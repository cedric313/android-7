package com.example.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btShowAlert = findViewById(R.id.btShowAlert);

        btShowAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                    // setup the alert builder
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Important message");
                    builder.setMessage("I accept to read resources on every step !");

                    // add the buttons
                    builder.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this, "Congratulations", Toast.LENGTH_LONG).show();
                        }
                    });
                    builder.setNegativeButton("Cancel", null);

                    // create and show the alert dialog
                    AlertDialog dialog = builder.create();
                    dialog.show();

            }

        });





    }
}





