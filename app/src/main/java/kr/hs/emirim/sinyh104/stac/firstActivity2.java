package kr.hs.emirim.sinyh104.stac;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by appcreator06 on 2016. 6. 23..
 */
public class firstActivity2 extends Activity{

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.first2);

        Button btnReturn2 = (Button) findViewById(R.id.btnReturn2);

        btnReturn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
