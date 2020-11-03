package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone=findViewById(R.id.et1);

        findViewById(R.id.b1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p=phone.getText().toString();

                Intent i=new Intent(Intent.ACTION_DIAL);

                i.setData(Uri.parse("tel:"+p));

                startActivity(i);



            }
        });

    }

    public void googlepage(View view)
    {

        Uri uri=Uri.parse("http://www.google.com");

        Intent intent=new Intent(Intent.ACTION_VIEW,uri);

        startActivity(intent);

    }
}