package kr.hs.emirim.sinyh104.stac;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by appcreator06 on 2016. 6. 23..
 */
public class firstActivity1 extends Activity{

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.first1);

        Button btnNewActivity=(Button)findViewById(R.id.characterActivity);
        btnNewActivity.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), character_activity.class);
                startActivity(intent);
            }
        });

        Button btnNewActivity1=(Button)findViewById(R.id.gotoStore);
        btnNewActivity1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), store.class);
                startActivity(intent);
            }
        });

        Button btnNewActivity2=(Button)findViewById(R.id.diary);
        btnNewActivity2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), diary.class);
                startActivity(intent);
            }
        });

        Button btnNewActivity3=(Button)findViewById(R.id.inSetting);
        btnNewActivity2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), insetting.class);
                startActivity(intent);
            }
        });
    }

}
