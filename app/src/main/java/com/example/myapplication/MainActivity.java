package com.example.myapplication;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int liczba = 7;
    Button buttonDalej, buttonNazot, buttonLosuj;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        buttonDalej = findViewById(R.id.button2);
        buttonNazot = findViewById(R.id.button);
        buttonLosuj = findViewById(R.id.button3);
        editText = findViewById(R.id.editTextText);

        buttonDalej.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        liczba++;
                        editText.setText(liczba+"");
                    }
                }
        );
        buttonNazot.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        liczba--;
                        editText.setText(liczba+"");
                    }
                }
        );
        buttonLosuj.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Random random = new Random();
                        liczba = random.nextInt(100);
                        editText.setText(liczba +"");
                    }
                }
        );
        editText.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void afterTextChanged(Editable editable) {
                        liczba = Integer.parseInt(editText.getText().toString());
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }
                }
        );

    }
}