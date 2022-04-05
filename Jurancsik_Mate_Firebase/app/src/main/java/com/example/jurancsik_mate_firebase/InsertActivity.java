package com.example.jurancsik_mate_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
            public void onClick(View view) {
                onBackPressed();
            }
        });

        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message;
                if (name.getText().length() == 0) {
                    message = getString(R.string.error_name_is_required);
                } else if (country.getText().length() == 0){
                    message = getString(R.string.error_country_is_required);
                } else if (population.getText().length() == 0){
                    message = getString(R.string.error_population_is_required);
                } else {
                    message = getString(R.string.succesful);
                }
                Toast.makeText(InsertActivity.this, message, Toast.LENGTH_LONG).show();
                Toast.makeText(InsertActivity.this, message, Toast.LENGTH_SHORT).show();





            }
        });
    }
}