package com.example.changefontsize;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView t1;

    Button b1;
    Button b2;
    Button b3;
    Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.txt);

        b1 = findViewById(R.id.big);
        b2 = findViewById(R.id.reset);
        b3 = findViewById(R.id.small);
        b4 = findViewById(R.id.color);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("감사합니다");
                t1.setTextSize(60);

                Toast.makeText(MainActivity.this, "확대되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("경범선생");
                t1.setTextSize(30);

                Toast.makeText(MainActivity.this, "초기화되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setTextSize(20);
                Toast.makeText(MainActivity.this, "축소되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setTextSize(30);
                t1.setTextColor(Color.BLUE);

                Toast.makeText(MainActivity.this, "변경되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
