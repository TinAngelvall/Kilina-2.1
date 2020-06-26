package com.example.kilina_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;

   /* EditText textLogin = (EditText) findViewById(R.id.personName);
    String personName = textLogin.getText().toString();

    EditText textEmail = (EditText) findViewById(R.id.email);
    String email = textEmail.getText().toString();*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        button = findViewById(R.id.Ok);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });

        textView = findViewById(R.id.output); {
            textView.setText("Подписка на рассылку успешно оформлена для пользователя"/* + personName + " на электронный адрес " + email*/);
        }
    }
}