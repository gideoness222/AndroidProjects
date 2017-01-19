package com.example.gideonubaldo.contactmanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nametxt,phonetxt,emailtxt,addresstxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nametxt = (EditText)findViewById(R.id.etName);
        phonetxt = (EditText)findViewById(R.id.etPhoneNumber);
        emailtxt = (EditText)findViewById(R.id.etEmail);
        addresstxt = (EditText)findViewById(R.id.etAddress);
        final Button addBtn = (Button)findViewById(R.id.addButton);

        nametxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                addBtn.setEnabled(!nametxt.getText().toString().trim().isEmpty());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
