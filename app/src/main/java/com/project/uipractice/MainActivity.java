package com.project.uipractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;
    private EditText todoField;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (ConstraintLayout) findViewById(R.id.layout);

        todoField = (EditText) findViewById(R.id.todoField);
        todoField.setText(null);
        todoField.getText().toString();
        Log.d("todo", String.valueOf(todoField));

        submitButton = (Button) findViewById(R.id.submitButton);
        TextView listView = new TextView(this);
        submitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //this is the textview
                listView.append(todoField.getText().toString());

                if(layout.getParent() != null) {
                    layout.removeView(listView);
                }
                layout.addView(listView);

            }
        });

       




    }
}