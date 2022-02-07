package com.moringa.footballnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.appNameTextView)
    TextView appNameTextVIew;
    @BindView(R.id.seachNewButton)
    Button searchNewsButton;
    @BindView(R.id.newsEditText)
    EditText newsEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchNewsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == searchNewsButton) {
            String search = searchNewsButton.getText().toString();
            Intent intent = new Intent(MainActivity.this,NewsActivity.class);

            intent.putExtra("search",search);
            startActivity(intent);
        }
    }
}