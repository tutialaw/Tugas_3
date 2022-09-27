package com.prak.tugas_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class SignIn3 extends AppCompatActivity {

    private Button btnlogin;
    private TextView btnfopa;
    private ImageButton imbtnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in3);
        btnlogin=findViewById(R.id.sibutton8);
        btnfopa=findViewById(R.id.si7);
        imbtnback=findViewById(R.id.ibsi);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(SignIn3.this, SuccessLogin7.class);
                startActivity(pindah);
            }
        });

        btnfopa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(SignIn3.this, ForgotPass4.class);
                startActivity(pindah);
            }
        });

        imbtnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(SignIn3.this, Welcome2.class);
                startActivity(pindah);
            }
        });
    }
}