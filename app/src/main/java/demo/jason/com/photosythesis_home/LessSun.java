//Reagan Zhou
package demo.jason.com.photosythesis_home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LessSun extends AppCompatActivity {
    public Button arrowLessSun;
    public Button snakePlantLessSun;
    public Button peaceLilyLessSun;
    public Button castIronLessSun;
    public Button parlorLessSun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_less_sun);
        arrowLessSun();
        snakePlantLessSun();
        peaceLilyLessSun();
        castIronLessSun();
        parlorLessSun();
    }

    public void castIronLessSun() {
        castIronLessSun = findViewById(R.id.castIronLessSun);
        castIronLessSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int4 = new Intent(LessSun.this, castIron.class);
                startActivity(int4);
            }
        });
    }

    public void parlorLessSun() {
        parlorLessSun = findViewById(R.id.parlorLessSun);
        parlorLessSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int5 = new Intent(LessSun.this, ParlorPalm.class);
                startActivity(int5);
            }
        });
    }

    public void snakePlantLessSun() {
        snakePlantLessSun = findViewById(R.id.snakeLessSun);
        snakePlantLessSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int2 = new Intent(LessSun.this, SnakePlant.class);
                startActivity(int2);
            }
        });
    }

    public void peaceLilyLessSun() {
        peaceLilyLessSun = findViewById(R.id.peaceLessSun);
        peaceLilyLessSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int3 = new Intent(LessSun.this, PeaceLily.class);
                startActivity(int3);
            }
        });
    }

    public void arrowLessSun() {
        arrowLessSun = findViewById(R.id.arrowLessSun);
        arrowLessSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(LessSun.this, ArrowheadVine.class);
                startActivity(int1);
            }
        });
    }



}


