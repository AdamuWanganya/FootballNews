package com.moringa.footballnews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
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
}