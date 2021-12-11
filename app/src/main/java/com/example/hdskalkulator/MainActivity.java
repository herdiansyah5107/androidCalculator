package com.example.hdskalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7,
            btn8, btn9, btnhasil, btnbagi, btnkali, btnkurang, btnc,btntambah;
    TextView counterText;
    Integer angkaPertama,angkaKedua;
    Integer hasilAKhir;
    String Type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btntambah =findViewById(R.id.btntambah);
        btnhasil = findViewById(R.id.btnhasil);
        btnbagi = findViewById(R.id.btnbagi);
        btnkali = findViewById(R.id.btnkali);
        btnkurang = findViewById(R.id.btnkurang);
        btnc = findViewById(R.id.btnc);
        counterText = findViewById(R.id.counterText);

        nolOnClicklistaner();
        satuOnClicklistaner();
        duaOnClicklistaner();
        tigaOnClicklistaner();
        empatOnClicklistaner();
        limaOnClicklistaner();
        enamOnClicklistaner();
        tujuhOnClicklistaner();
        delapanOnClicklistaner();
        sembilanOnClicklistaner();
        tambahOnClickListener();
        hasilbtnOnClicklistaner();
        bagiOnClicklistaner();
        kaliOnClicklistaner();
        kurangOnClicklistaner();
        resetlOnClicklistaner();


    }

    private void kurangOnClicklistaner() {
        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angkaPertama = Integer.parseInt(counterText.getText().toString().trim());
                counterText.setText("0");
               angkaKedua = Integer.parseInt(counterText.getText().toString().trim());
                Type="kurang";
            }
        });
    }

    private void kaliOnClicklistaner() {
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angkaPertama = Integer.parseInt(counterText.getText().toString().trim());
                counterText.setText("0");
                angkaKedua = Integer.parseInt(counterText.getText().toString().trim());
                Type="kali";
            }
        });
    }
    private void bagiOnClicklistaner() {
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angkaPertama = Integer.parseInt(counterText.getText().toString().trim());
                counterText.setText("0");
                angkaKedua = Integer.parseInt(counterText.getText().toString().trim());
                Type="bagi";
            }
        });
    }
    private void tambahOnClickListener() {
        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            angkaPertama = Integer.parseInt(counterText.getText().toString());
            counterText.setText("0");
            angkaKedua = Integer.parseInt(counterText.getText().toString());
            Type="tambah";
            }
        });
    }
    private void hasilbtnOnClicklistaner() {
        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (Type) {
                    case "tambah":
                        angkaKedua = Integer.parseInt(counterText.getText().toString().trim());
                        hasilAKhir = angkaPertama + angkaKedua;
                        counterText.setText(String.valueOf(hasilAKhir));
                        break;
                    case "bagi":
                        angkaKedua = Integer.parseInt(counterText.getText().toString().trim());
                        hasilAKhir = angkaPertama / angkaKedua;
                        counterText.setText(String.valueOf(hasilAKhir));
                        break;
                    case "kali":
                        angkaKedua = Integer.parseInt(counterText.getText().toString().trim());
                        hasilAKhir = angkaPertama * angkaKedua;
                        counterText.setText(String.valueOf(hasilAKhir));
                        break;
                    case "kurang":
                        angkaKedua = Integer.parseInt(counterText.getText().toString().trim());
                        hasilAKhir = angkaPertama - angkaKedua;
                        counterText.setText(String.valueOf(hasilAKhir));
                        break;
                }
                Type="hasil";
            }
        });
    }
    private void resetlOnClicklistaner() {
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterText.setText("0");
                Type="reset";
            }
        });
    }
    private void nolOnClicklistaner() {
        btn0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(counterText.getText().equals("0")) {
                    counterText.setText("0");
                }else {
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText().toString())+"0"));
                }
            }

        });
    }
    private void satuOnClicklistaner() {
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
               if(counterText.getText()!="0"&& Type=="hasil"){
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText().toString())+"1"));
                }else if(counterText.getText().equals("0")||  Type=="hasil"){
                    counterText.setText("1");
                }else {
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText().toString())+"1"));
                }
            }
        });
    }
    private void duaOnClicklistaner() {
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counterText.getText()!="0"&& Type=="hasil") {
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText().toString()) + "2"));
                }else if(counterText.getText().equals("0")||  Type=="hasil"){
                    counterText.setText("2");
                }else {
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText().toString())+"2"));
                }
            }
        });
    }
    private void tigaOnClicklistaner() {
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counterText.getText()!="0"&& Type=="hasil") {
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText().toString()) + "3"));
                }else if(counterText.getText().equals("0")||  Type=="hasil"){
                    counterText.setText("3");
                }else {
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText().toString())+"3"));
                }
            }
        });
    }
    private void empatOnClicklistaner() {
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counterText.getText()!="0"&& Type=="hasil") {
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText().toString()) + "1"));
                }else if(counterText.getText().equals("0")||  Type=="hasil"){
                    counterText.setText("4");
                }else {
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText().toString())+"4"));
                }
            }
        });
    }
    private void limaOnClicklistaner() {
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counterText.getText()!="0"&& Type=="hasil") {
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText().toString()) + "5"));
                }else if(counterText.getText().equals("0")|| Type=="hasil"){
                    counterText.setText("5");
                }else {
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText().toString()) + "5"));
                }
            }
        });
    }
    private void enamOnClicklistaner() {
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counterText.getText()!="0"&& Type=="hasil") {
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText().toString()) +"6"));
                }else if(counterText.getText().equals("0")|| Type=="hasil"){
                    counterText.setText("6");
                }else {
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText().toString())+"6"));
                }
            }
        });
    }
    private void tujuhOnClicklistaner() {
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counterText.getText()!="0"&& Type=="hasil") {
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText().toString())+"7"));
                }else if(counterText.getText().equals("0")|| Type=="hasil"){
                    counterText.setText("7");
                }else{
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText().toString())+"7"));
                }
            }
        });
    }
    private void delapanOnClicklistaner() {
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counterText.getText()!="0"&& Type=="hasil") {
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText().toString()) + "8"));
                }else if(counterText.getText().equals("0")||  Type=="hasil"){
                    counterText.setText("8");
                }else{
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText().toString())+"8"));
                }
            }
        });
    }
    private void sembilanOnClicklistaner() {
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counterText.getText() != "0" && Type == "hasil") {
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText().toString()) + "5"));
                } else if (counterText.getText().equals("0") || Type == "hasil") {
                    counterText.setText("9");
                } else {
                    counterText.setText(String.valueOf(Integer.parseInt(counterText.getText() + "9")));
                }
            }
        });

    }
}