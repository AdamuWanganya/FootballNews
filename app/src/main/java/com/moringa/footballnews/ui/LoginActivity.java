package com.moringa.footballnews.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.moringa.footballnews.MainActivity;
import com.moringa.footballnews.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.email)  TextView email;
    @BindView(R.id.password) TextView password;
    @BindView(R.id.register)  TextView register;
    @BindView(R.id.login)  Button login;

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        mAuth = FirebaseAuth.getInstance();

        register.setOnClickListener(this);
        login.setOnClickListener(this);
    }

//    new Handler().postDelayed(new Runnable() {
//        @Override
//        public void run() {
//
//            Intent i=new Intent(CurrentActivity.this,Next.class);
//            startActivity(i);
//        }
//    }, 3000);
//Handler hd = new Handler();
//            hd.postDelayed(new Runnable() {
//        @Override
//        public void run() {
//
//            // Add Your Intent
//
//        }
//
//    }, 2000); // Time Delay ,2 Seconds
//}

    @Override
    public void onClick(View view) {
        if (view == register) {
            clockwise();

            Handler hd = new Handler();
            hd.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
           startActivity(intent);
                }
            },10000);
//            clockwise();
//            Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
//            startActivity(intent);
        }

        if (view == login) {
            users();
        }

    }

    private void clockwise() {
        ImageView image = (ImageView)findViewById(R.id.imageView);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        image.startAnimation(animation);
    }

    private void users() {
        String Email = email.getText().toString().trim();
        String Password = password.getText().toString().trim();
        if (Email.equals("")) {
            email.setError("Fill in Email");
            return;

        }
        if (Password.equals("")){
            password.setError("fill in password");
            return;
        }
        mAuth.signInWithEmailAndPassword(Email,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LoginActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}