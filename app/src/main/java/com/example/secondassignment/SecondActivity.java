package com.example.secondassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    EditText ed1;
    Button b3;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ed1=findViewById(R.id.edit_id);
        b3=findViewById(R.id.btn_2);


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                //phoneNo = Integer.valueOf(ed1.getText().toString());

                String phoneNo = ed1.getText().toString();
                i.putExtra("textview_main", phoneNo);
                setResult(RESULT_OK,i);
                finish();




            }
        });



    }




}
