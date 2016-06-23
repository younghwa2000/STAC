package kr.hs.emirim.sinyh104.stac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNewActivity=(Button)findViewById(R.id.but_garley);
        btnNewActivity.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), firstActivity.class);
                startActivity(intent);
            }
        });

        Button btnNewActivity1=(Button)findViewById(R.id.but_start);
        btnNewActivity1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), firstActivity1.class);
                startActivity(intent);
            }
        });

        Button btnNewActivity2=(Button)findViewById(R.id.but_replay);
        btnNewActivity2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), firstActivity2.class);
                startActivity(intent);
            }
        });

    }
}
