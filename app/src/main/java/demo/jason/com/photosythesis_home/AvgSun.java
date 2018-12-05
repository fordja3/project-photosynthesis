//Reagan Zhou
package demo.jason.com.photosythesis_home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AvgSun extends AppCompatActivity {

    public Button anthuriumAvgSun;
    public Button peaceLilyAvgSun;
    public Button dieffenbachiaAvgSun;
    public Button dragonAvgSun;
    public Button englishIvyAvgSun;
    public Button ficusAvgSun;
    public Button hoyaAvgsun;
    public Button parlorAvgSun;
    public Button philodendronAvgSun;
    public Button spiderAvgSun;
    public Button tradescantiaAvgSun;
    public Button arrowAvgSun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avg_sun);
        anthuriumAvgSun();
        peaceLilyAvgSun();
        dragonAvgSun();
        arrowAvgSun();
        dieffenbachiaAvgSun();
        englishIvyAvgSun();
        ficusAvgSun();
        hoyaAvgsun();
        parlorAvgSun();
        philodendronAvgSun();
        spiderAvgSun();
        tradescantiaAvgSun();

    }

    public void dieffenbachiaAvgSun() {
        dieffenbachiaAvgSun = findViewById(R.id.dieffenbachiaAvgSun);
        dieffenbachiaAvgSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int5 = new Intent(AvgSun.this, Dieffenbachia.class);
                startActivity(int5);
            }
        });
    }

    public void englishIvyAvgSun() {
        englishIvyAvgSun = findViewById(R.id.englishIvyAvgSun);
        englishIvyAvgSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int6 = new Intent(AvgSun.this, Eng_Ivy.class);
                startActivity(int6);
            }
        });
    }

    public void ficusAvgSun() {
        ficusAvgSun = findViewById(R.id.ficusAvgSun);
        ficusAvgSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int7 = new Intent(AvgSun.this, ficusSue.class);
                startActivity(int7);
            }
        });
    }

    public void hoyaAvgsun() {
        hoyaAvgsun = findViewById(R.id.hoyaAvgsun);
        hoyaAvgsun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int8 = new Intent(AvgSun.this, hoyaSue.class);
                startActivity(int8);
            }
        });
    }

    public void parlorAvgSun() {
        parlorAvgSun= findViewById(R.id.parlorAvgSun);
        parlorAvgSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int9 = new Intent(AvgSun.this, ParlorPalm.class);
                startActivity(int9);
            }
        });
    }

    public void philodendronAvgSun() {
        philodendronAvgSun = findViewById(R.id.philodendronAvgSun);
        philodendronAvgSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int10 = new Intent(AvgSun.this, Philodendron.class);
                startActivity(int10);
            }
        });
    }

    public void spiderAvgSun() {
        spiderAvgSun= findViewById(R.id.spiderAvgSun);
        spiderAvgSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int11 = new Intent(AvgSun.this, SpiderPlant.class);
                startActivity(int11);
            }
        });
    }

    public void tradescantiaAvgSun() {
        tradescantiaAvgSun = findViewById(R.id.tradescantiaAvgSun);
        tradescantiaAvgSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int12 = new Intent(AvgSun.this, TradescantiaSue.class);
                startActivity(int12);
            }
        });
    }

    public void anthuriumAvgSun() {
        anthuriumAvgSun = findViewById(R.id.anthuriumAvgSun);
        anthuriumAvgSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(AvgSun.this, Anthurium.class);
                startActivity(int1);
            }
        });
    }

    public void peaceLilyAvgSun() {
        peaceLilyAvgSun = findViewById(R.id.peaceAvgSun);
        peaceLilyAvgSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int2 = new Intent(AvgSun.this, PeaceLily.class);
                startActivity(int2);
            }
        });
    }

    public void dragonAvgSun() {
        dragonAvgSun = findViewById(R.id.dragonAvgSun);
        dragonAvgSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int3 = new Intent(AvgSun.this, DragonTree.class);
                startActivity(int3);
            }
        });
    }

    public void arrowAvgSun() {
        arrowAvgSun = findViewById(R.id.arrowAvgSun);
        arrowAvgSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int4 = new Intent(AvgSun.this, ArrowheadVine.class);
                startActivity(int4);
            }
        });
    }
}
