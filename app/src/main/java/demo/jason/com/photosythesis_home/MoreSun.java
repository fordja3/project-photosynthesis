//Reagan Zhou
package demo.jason.com.photosythesis_home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MoreSun extends AppCompatActivity {

    public Button snakeMoreSun;
    public Button aloeMoreSun;
    public Button asparagusMoreSun;
    public Button peaceMoreSun;
    public Button peperomiaMoreSun;
    public Button christmasMoreSun;
    public Button dieffenbachiaMoreSun;
    public Button dragonMoreSun;
    public Button ficusMoreSun;
    public Button spiderMoreSun;
    public Button tradescantiaMoreSun;
    public Button swedishMoreSun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_sun);
        snakeMoreSun();
        aloeMoreSun();
        peaceMoreSun();
        christmasMoreSun();
        dragonMoreSun();
        asparagusMoreSun();
        peperomiaMoreSun();
        dieffenbachiaMoreSun();
        ficusMoreSun();
        spiderMoreSun();
        tradescantiaMoreSun();
        swedishMoreSun();

    }

    public void asparagusMoreSun(){
        asparagusMoreSun = findViewById(R.id.asparagusMoreSun);
        asparagusMoreSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int9 = new Intent(MoreSun.this, AsparagusFern.class);
                startActivity(int9);
            }
        });
    }

    public void peperomiaMoreSun(){
        peperomiaMoreSun = findViewById(R.id.peperomiaMoreSun);
        peperomiaMoreSun.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent int8 = new Intent(MoreSun.this, Peperomia.class);
                startActivity(int8);
            }
        });
    }

    public void dieffenbachiaMoreSun(){
        dieffenbachiaMoreSun = findViewById(R.id.dieffenbachiaMoreSun);
        dieffenbachiaMoreSun.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent int9 = new Intent(MoreSun.this, Dieffenbachia.class);
                startActivity(int9);
            }
        });
    }

    public void ficusMoreSun(){
        ficusMoreSun = findViewById(R.id.ficusMoreSun);
        ficusMoreSun.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent int10 = new Intent(MoreSun.this, ficusSue.class);
                startActivity(int10);
            }
        });
    }

    public void spiderMoreSun(){
        spiderMoreSun = findViewById(R.id.spiderMoreSun);
        spiderMoreSun.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent int11 = new Intent(MoreSun.this, SpiderPlant.class);
                startActivity(int11);
            }
        });
    }

    public void tradescantiaMoreSun(){
        tradescantiaMoreSun = findViewById(R.id.tradescantiaMoreSun);
        tradescantiaMoreSun.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent int12 = new Intent(MoreSun.this, TradescantiaSue.class);
                startActivity(int12);
            }
        });
    }

    public void swedishMoreSun(){
        swedishMoreSun = findViewById(R.id.swedishMoreSun);
        swedishMoreSun.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent int13 = new Intent(MoreSun.this, SwedishIvy.class);
                startActivity(int13);
            }
        });
    }

    public void snakeMoreSun() {
        snakeMoreSun = findViewById(R.id.snakeMoreSun);
        snakeMoreSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(MoreSun.this, SnakePlant.class);
                startActivity(int1);
            }
        });
    }

    public void aloeMoreSun() {
        aloeMoreSun = findViewById(R.id.aloeMoreSun);
        aloeMoreSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int2 = new Intent(MoreSun.this, Aloe.class);
                startActivity(int2);
            }
        });
    }

    public void peaceMoreSun() {
        peaceMoreSun = findViewById(R.id.peaceMoreSun);
        peaceMoreSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int4 = new Intent(MoreSun.this, PeaceLily.class);
                startActivity(int4);
            }
        });
    }

    public void christmasMoreSun() {
        christmasMoreSun = findViewById(R.id.christMoreSun);
        christmasMoreSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int5 = new Intent(MoreSun.this, ChristmasCactus.class);
                startActivity(int5);
            }
        });
    }

    public void dragonMoreSun() {
        dragonMoreSun = findViewById(R.id.dragonMoreSun);
        dragonMoreSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int6 = new Intent(MoreSun.this, DragonTree.class);
                startActivity(int6);
            }
        });
    }

}
