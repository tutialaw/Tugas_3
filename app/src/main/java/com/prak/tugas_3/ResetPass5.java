package com.prak.tugas_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ResetPass5 extends AppCompatActivity {

    private ImageButton btnback;
    private Button btnchange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_pass5);
        btnback=findViewById(R.id.ibrp);
        btnchange=findViewById(R.id.rpbutton9);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(ResetPass5.this, ForgotPass4.class);
                startActivity(pindah);
            }
        });

        btnchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(ResetPass5.this, Successful6.class);
                startActivity(pindah);
            }
        });
    }
}