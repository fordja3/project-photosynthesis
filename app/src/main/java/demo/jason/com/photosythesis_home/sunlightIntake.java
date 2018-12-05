//Reagan Zhou
package demo.jason.com.photosythesis_home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class sunlightIntake extends AppCompatActivity {

    public Button moreSun;
    public Button avgSun;
    public Button lessSun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunlight_intake);
        moreSun();
        avgSun();
        lessSun();
    }

    public void moreSun() {
        moreSun = findViewById(R.id.moreSun);
        moreSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(sunlightIntake.this, MoreSun.class);
                startActivity(intent1);
            }
        });
    }

    public void avgSun() {
        avgSun = findViewById(R.id.avgSun);
        avgSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(sunlightIntake.this, AvgSun.class);
                startActivity(intent2);
            }
        });
    }

    public void lessSun() {
        lessSun = findViewById(R.id.lessSun);
        lessSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3 = new Intent(sunlightIntake.this, LessSun.class);
                startActivity(intent3);
            }
        });
    }
}
