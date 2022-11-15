package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
      private Spinner s;
      private  TextView t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }

    private void setupViews() {
     s= findViewById(R.id.s);
     t4 = findViewById(R.id.t4);
    }


    public void sub(View view) {
       int x = (int) s.getSelectedItemId();
       if(x != -1){
           t4.setText(s.getSelectedItem().toString());
       }

    }
}