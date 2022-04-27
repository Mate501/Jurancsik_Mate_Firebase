package com.qr.doma_firebase;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InsertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        EditText name = findViewById(R.id.etName);
        EditText country = findViewById(R.id.etCountry);
        EditText population = findViewById(R.id.etPopulation);

        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message;
                if (name.getText().length() == 0){
                    message = getString(R.string.error_name_is_required);
                }else if(country.getText().length() == 0){
                    message = getString(R.string.error_country_is_required);
                }else if(population.getText().length() == 0) {
                    message = getString(R.string.error_population_is_required);
                }else {
                    message = getString(R.string.successful);
                }
                Toast.makeText(InsertActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}