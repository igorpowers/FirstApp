package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText inputText;
    Button encBtn;
    String outputString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
        mySpinner.setPrompt("Выберите продукт");
        mySpinner.setOnItemSelectedListener(onItemSelectedListener());

        encBtn = (Button) findViewById(R.id.encBtn);
        inputText = (EditText) findViewById(R.id.inputText);

        encBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                outputString = encrypt(inputText.getText());
            }

            private String encrypt(Editable text) {
                return null;
            }


        });


    }

    AdapterView.OnItemSelectedListener onItemSelectedListener()
    {
        return new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(getBaseContext(), parent.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }

        };
    }
}