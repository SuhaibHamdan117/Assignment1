package edu.cs.birzeit.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Spinner spinl;
    private EditText txtf;
    private EditText txtl;
    private EditText txte;
    private EditText txtp;
    private EditText txtpa;
    RadioButton ragf;
    RadioButton ragm;
    RadioGroup rgroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinl=findViewById(R.id.spinl);
        populateSpinner();
        setup();

    }

    private void setup() {

        txtf =findViewById(R.id.txtf);
        txtl =findViewById(R.id.txtl);
        txte =findViewById(R.id.txte);
        txtp =findViewById(R.id.txtp);
        txtpa =findViewById(R.id.txtpa);
        spinl =(Spinner) findViewById(R.id.spinl);
        rgroup =findViewById(R.id.rgroup);
        ragf =findViewById(R.id.ragf);
        ragm =findViewById(R.id.ragm);
    }

    private void populateSpinner() {
        ArrayList<String> data=new ArrayList<>();
        data.add("Java");
        data.add("C#");
        data.add("C");
        data.add("Php");
        data.add("Java Script");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,data);
        spinl.setAdapter(adapter);
    }

    public void btn_onClick(View view) {

        InputMethodManager mgr = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
        String language = spinl.getSelectedItem().toString();
        int genid=rgroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) rgroup.findViewById(genid);
        String gender=radioButton.getText().toString();
        String first=txtf. getText(). toString();
        String last=txtl. getText(). toString();
        String full = first + " " +last;
        String email=txte. getText(). toString();
        String phone=txtp. getText(). toString();
        String password=txtpa. getText(). toString();

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("Full",full);
        intent.putExtra("Gender",gender);
        intent.putExtra("Language",language);
        intent.putExtra("Email",email);
        intent.putExtra("Phone",phone);
        intent.putExtra("Password",password);
        startActivity(intent);
    }
}