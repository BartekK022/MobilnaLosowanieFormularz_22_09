package com.example.myapplication;

import android.os.Bundle;
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

        buttonDalej = findViewById(R.id.button);
        buttonNazot = findViewById(R.id.button2);
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
        buttonDalej.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Random random = new Random();
                        liczba = random.nextInt(100);
                        editText.setText(liczba +"");
                    }
                }
        );

    }
}