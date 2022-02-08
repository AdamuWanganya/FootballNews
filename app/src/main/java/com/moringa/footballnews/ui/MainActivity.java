package com.moringa.footballnews.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.moringa.footballnews.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.id)
    EditText id;
    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == button) {
            String strId = id.getText().toString();
            if (strId.isEmpty()) {
                Toast.makeText(MainActivity.this, "can't search without id", Toast.LENGTH_LONG).show();
            } else {
                Intent intent = new Intent(MainActivity.this, TrophiesActivity.class);
                intent.putExtra("id", strId);
                startActivity(intent);
            }
//                String strId = id.getText().toString();
//
//                if (strId.isEmpty()){
//                    Toast.makeText(MainActivity.this, "can't search without id", Toast.LENGTH_LONG).show();
//                } else {
//                    Intent intent = new Intent(MainActivity.this, TrophiesActivity.class);
//                    intent.putExtra("id", strId);
//                    startActivity(intent);
//                }
        }
    }


}