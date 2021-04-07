package edu.cs.birzeit.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;


public class MainActivity2 extends AppCompatActivity {

    private EditText txtf2;
    private EditText txtg2;
    private EditText txte2;
    private EditText txtp2;
    private EditText txtpa2;
    private EditText txtlan2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setup();
        Intent intent=getIntent();
        String full =intent.getStringExtra("Full");
        String gender =intent.getStringExtra("Gender");
        String language =intent.getStringExtra("Language");
        String email =intent.getStringExtra("Email");
        String phone =intent.getStringExtra("Phone");
        String Password =intent.getStringExtra("Password");
        txtf2.setText(full);
        txtg2.setText(gender);
        txte2.setText(email);
        txtp2.setText(phone);
        txtpa2.setText(Password);
        txtlan2.setText(language);
    }

    private void setup() {
        txtf2 =findViewById(R.id.txtf2);
        txtg2 =findViewById(R.id.txtg2);
        txte2 =findViewById(R.id.txte2);
        txtp2 =findViewById(R.id.txtp2);
        txtpa2 =findViewById(R.id.txtpa2);
        txtlan2 =findViewById(R.id.txtlan2);
    }
}