package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Dectambah1,Dectambah2;
    Button BtnHit,BtnKali,BtnKurang,BtnBagi;
    TextView Hasil;
    String Dec1, Dec2;
    Integer Total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BtnHit = findViewById(R.id.BtnHitung);
        Hasil = findViewById(R.id.TVIEWHASIL);
        Dectambah1 = findViewById(R.id.DECIMALTAMBAH1);
        Dectambah2 = findViewById(R.id.DECIMALTAMBAH2);
        BtnKali = findViewById(R.id.Btn_Kali);
        BtnKurang = findViewById(R.id.Btn_Kurang);
        BtnBagi = findViewById(R.id.Btn_bagi);

        BtnHit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dec1 = Dectambah1.getText().toString();
                Dec2 = Dectambah2.getText().toString();
                Total = Integer.parseInt(Dec1)+Integer.parseInt(Dec2);
                Hasil.setText(String.valueOf(Total));
            }
        });

        BtnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dec1 = Dectambah1.getText().toString();
                Dec2 = Dectambah2.getText().toString();
                Total = Integer.parseInt(Dec1)*Integer.parseInt(Dec2);
                Hasil.setText(String.valueOf(Total));

            }
        });
        BtnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dec1 = Dectambah1.getText().toString();
                Dec2 = Dectambah2.getText().toString();
                Total = Integer.parseInt(Dec1)-Integer.parseInt(Dec2);
                Hasil.setText(String.valueOf(Total));

            }
        });

        BtnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dec1 = Dectambah1.getText().toString();
                Dec2 = Dectambah2.getText().toString();
                Total = Integer.parseInt(Dec1)/Integer.parseInt(Dec2);
                Hasil.setText(String.valueOf(Total));

            }
        });
    }
}