package apssdc.android11x45a0417.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button next_screen;
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate is called", Toast.LENGTH_SHORT).show();
        Log.i("gopal","onCreate is called");
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

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart is called", Toast.LENGTH_SHORT).show();
        Log.i("gopal","onStart is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume is called", Toast.LENGTH_SHORT).show();
        Log.i("gopal","onResume is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause is called", Toast.LENGTH_SHORT).show();
        Log.i("gopal","onPause is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop is called", Toast.LENGTH_SHORT).show();
        Log.i("gopal","onStop is called");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart is called", Toast.LENGTH_SHORT).show();
        Log.i("gopal","onRestart is called");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy is called", Toast.LENGTH_SHORT).show();
        Log.i("gopal","onDestory is called");
    }
}