//Suzanne
package demo.jason.com.photosythesis_home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class WaterIntake extends AppCompatActivity {


    public Button Less;
    public Button More;
    public Button Average;


    public void one() {
        Less = findViewById(R.id.Dragon);
        Less.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(WaterIntake.this, LessWater.class);
                startActivity(int1);
            }
        });
    }

    public void two() {
        More = findViewById(R.id.More);
        More.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int2 = new Intent(WaterIntake.this, MoreWater.class);
                startActivity(int2);
            }
        });
    }

    public void three() {
        Average = findViewById(R.id.Average);
        Average.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int3 = new Intent(WaterIntake.this, AverageWater.class);
                startActivity(int3);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_intake);
        one();
        two();
        three();
    }
}
