package com.example.newtohk;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

public class TransActivity extends AppCompatActivity {

    private EditText editText;
    private TextView resultTextView;
    private Button translateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trans);

        editText = findViewById(R.id.editText);
        resultTextView = findViewById(R.id.resultTextView);
        translateButton = findViewById(R.id.translateButton);

        translateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                new TranslateTask().execute(text);
            }
        });
    }

    private class TranslateTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            Translate translate = TranslateOptions.newBuilder().setApiKey("AIzaSyBCNycEID-BfQCZKekVRZXJnasnPUH2mks").build().getService();
            String text = editText.getText().toString();
            String targetLanguage = "zh-CN";
            Translation translation = translate.translate(text, Translate.TranslateOption.targetLanguage(targetLanguage));
            return translation.getTranslatedText();
        }

        @Override
        protected void onPostExecute(String result) {
            resultTextView.setText(result);
        }
    }
}
