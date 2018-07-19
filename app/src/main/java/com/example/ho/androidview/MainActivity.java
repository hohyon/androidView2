package com.example.ho.androidview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    EditText e1;
    Button b1;

    Button b2;
    Button b3;

    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.answer);
        e1 = findViewById(R.id.edit);
        b1 = findViewById(R.id.btn);

        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = e1.getText().toString();
                t1.setText(str);
                Toast.makeText(MainActivity.this, "수정되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = e1.getText().toString();
                t1.setText(t1.getText().toString() + str);

                Toast.makeText(MainActivity.this, "추가되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                t1.setText("");  // t1.setText(null); 도 가능

                Toast.makeText(MainActivity.this, "삭제되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
