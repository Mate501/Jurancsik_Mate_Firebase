package com.qr.doma_firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.Var;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class ListResultActivity extends AppCompatActivity {

    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_result);

        output = findViewById(R.id.content);
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        readData();
    }

    private void readData() {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("varosok").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if (task.isSuccessful()) {
                    String kiiras = "";
                    for (QueryDocumentSnapshot document : task.getResult()) {
                        Varos varos = document.toObject(Varos.class);
                        kiiras += varos.getOrszag() + "\n";
                    }
                    output.setText(kiiras);
                } else {
                    Log.w("TAG", "Error getting documents.", task.getException());
                }
            }
        });
    }
}