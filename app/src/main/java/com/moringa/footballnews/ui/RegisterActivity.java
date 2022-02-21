package com.moringa.footballnews.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.moringa.footballnews.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.name) TextView name;
    @BindView(R.id.email) TextView email;
    @BindView(R.id.password) TextView password;
    @BindView(R.id.signup) Button register;
    @BindView(R.id.login) TextView login;
    @BindView(R.id.both)
    RelativeLayout both;

    private FirebaseAuth mAuth;

    public  static String TAG;
// ...
// Initialize Firebase Auth



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);

        mAuth = FirebaseAuth.getInstance();

        register.setOnClickListener(this);
        login.setOnClickListener(this);
    }

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

        if (view == login){
            fade();
            Handler hd = new Handler();
            hd.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                    startActivity(intent);
                }
            },1000);

        }

        if (view == register){
            users();
        }

    }
    private void users() {
        String Email = email.getText().toString().trim();
        String Password = password.getText().toString().trim();

        mAuth.createUserWithEmailAndPassword(Email,Password)
                .addOnCompleteListener(this,task -> {
                    if (task.isSuccessful()) {
                        // Sign in success, update UI with the signed-in user's information
                        Log.d(TAG, "signInWithCustomToken:success");
                        FirebaseUser user = mAuth.getCurrentUser();
//                user.getDisplayName();
                        Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                        startActivity(intent);
                    } else {
                        // If sign in fails, display a message to the user.
                        Log.e(TAG, "signInWithCustomToken:failure", task.getException());
                        Toast.makeText(RegisterActivity.this, "Authentication failed.",
                                Toast.LENGTH_SHORT).show();
                    }

                });
    }

    private void fade() {
        ImageView image = (ImageView)findViewById(R.id.imageView);
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade);
        both.startAnimation(animation1);
    }

}
