package com.example.alice.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {
    EditText textToCount;
    TextView countedText;
    Button countButton;
    WordCount wordCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        textToCount = (EditText) findViewById(R.id.textToCount);
        countedText = (TextView) findViewById(R.id.countedText);
        countButton = (Button) findViewById(R.id.countButton);
    }

    public void onCountButtonClicked(View button) {
        String text = textToCount.getText().toString();
        String textCounted = wordCount.count(text);
        countedText.setText(textCounted);
    }
}
