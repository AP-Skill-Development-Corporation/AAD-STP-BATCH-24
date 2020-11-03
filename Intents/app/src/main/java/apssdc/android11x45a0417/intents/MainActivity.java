package apssdc.android11x45a0417.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button next_screen;
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next_screen=findViewById(R.id.bt_next);
        editText=findViewById(R.id.et_text);
        next_screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                String s=editText.getText().toString();
                i.putExtra("gopalvar",s);
                startActivity(i);
            }
        });
    }
}