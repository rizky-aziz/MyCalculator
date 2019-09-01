package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnKali, btnBagi, btnTambah, btnKurang, btnHasil, btnHapus, btnTitik;

    TextView tvHasil;

    float value1, value2;

    boolean mTambah, mBagi, mKali, mKurang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnKali = (Button)findViewById(R.id.btnKali);
        btnBagi = (Button)findViewById(R.id.btnBagi);
        btnKurang = (Button)findViewById(R.id.btnKurang);
        btnTambah = (Button)findViewById(R.id.btnTambah);
        btnHapus= (Button)findViewById(R.id.btnHapus);
        btnTitik = (Button)findViewById(R.id.btnTitik);
        btnHasil = (Button)findViewById(R.id.btnHasil);
        tvHasil = (TextView)findViewById(R.id.tvHasil);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHasil.setText(tvHasil.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHasil.setText(tvHasil.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHasil.setText(tvHasil.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHasil.setText(tvHasil.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHasil.setText(tvHasil.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHasil.setText(tvHasil.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHasil.setText(tvHasil.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHasil.setText(tvHasil.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHasil.setText(tvHasil.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHasil.setText(tvHasil.getText()+"9");
            }
        });
        btnTitik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHasil.setText(tvHasil.getText()+".");
            }
        });
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tvHasil == null) {
                    tvHasil.setText("");
                } else {
                    value1 = Float.parseFloat(tvHasil.getText()+"");
                    mTambah = true;
                    tvHasil.setText(null);
                }
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat(tvHasil.getText()+"");
                mKurang = true;
                tvHasil.setText(null);
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat(tvHasil.getText()+"");
                mKali = true;
                tvHasil.setText(null);
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat(tvHasil.getText()+"");
                mBagi = true;
                tvHasil.setText(null);
            }
        });
        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2 = Float.parseFloat(tvHasil.getText()+"");

                if (mTambah == true){
                    tvHasil.setText(value1+value2+"");
                    mTambah = false;
                }

                if (mKurang == true) {
                    tvHasil.setText(value1 - value2+"");
                    mKurang = false;
                }

                if (mKali == true) {
                    tvHasil.setText(value1 * value2+"");
                    mKali = false;
                }

                if (mBagi == true){
                    tvHasil.setText(value1 / value2 + "");
                    mBagi = false;
                }
            }
        });

        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHasil.setText("");
            }
        });
    }

}