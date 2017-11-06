package fr.wcs.gitworkflow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonToMap=findViewById(R.id.buttonToMap);
        buttonToMap.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent toMapsActivity=new Intent(MainActivity.this,GoogleMapsActivity.class);
                startActivity(toMapsActivity);
            }
        });
    }
}
