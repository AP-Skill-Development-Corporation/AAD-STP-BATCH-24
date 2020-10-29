package apssdc.android11x45a0417.in;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
Button toast_bt;
TextView txt;
int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast_bt=findViewById(R.id.bt_toast);
        txt=findViewById(R.id.text);
        toast_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Welcome to Apssdc Android Day-4 class"
                ,Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void count(View view) {
        i++;
        txt.setText(i+"");
    }
}