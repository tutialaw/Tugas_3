package com.prak.tugas_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ForgotPass4 extends AppCompatActivity {

    private ImageButton btnback;
    private Button btnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass4);
        btnback=findViewById(R.id.ibfp);
        btnsend=findViewById(R.id.fpbutton5);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(ForgotPass4.this, SignIn3.class);
                startActivity(pindah);
            }
        });

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(ForgotPass4.this, ResetPass5.class);
                startActivity(pindah);
            }
        });
    }
}