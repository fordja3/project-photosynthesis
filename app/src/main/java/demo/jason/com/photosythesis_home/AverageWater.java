package demo.jason.com.photosythesis_home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AverageWater extends AppCompatActivity {

    private Button peaceAvgWater;
    private Button arrowAvgWater;
    private Button cast;
    private Button chi;
    private Button Eng;
    private Button palm;
    private Button spider;
    private Button phil;


    public void plant1() {
        peaceAvgWater = findViewById(R.id.button4);
        peaceAvgWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(AverageWater.this, PeaceLily.class);
                startActivity(int1);
            }
        });
    }

    public void plant2() {
        arrowAvgWater = findViewById(R.id.button7);
        arrowAvgWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int2 = new Intent(AverageWater.this, ArrowheadVine.class);
                startActivity(int2);
            }
        });
    }

    public void plant3(){
        cast = findViewById(R.id.buttonCast);
        cast.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){

                Intent int3 = new Intent(AverageWater.this, castIron.class);
                startActivity(int3);
            }
        });
    }

    public void plant4(){
        cast = findViewById(R.id.buttonDief);
        cast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(AverageWater.this, Dieffenbachia.class);
                startActivity(int4);
            }
        });
    }

    public void plant5(){
        chi = findViewById(R.id.buttonChi);
        chi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(AverageWater.this, Chi_Evergreen.class);
                startActivity(int5);
            }
        });
    }

    public void plant6(){
        Eng = findViewById(R.id.buttonEng);
        Eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(AverageWater.this, Eng_Ivy.class);
                startActivity(int6);
            }
        });
    }

    public void plant7(){
        palm = findViewById(R.id.buttonPalm);
        palm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7 = new Intent(AverageWater.this, ParlorPalm.class);
                startActivity(int7);
            }
        });
    }

    public void plant8(){
        spider = findViewById(R.id.buttonSpider);
        spider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int8 = new Intent(AverageWater.this, SpiderPlant.class);
                startActivity(int8);
            }
        });
    }

    public void plant9(){
        phil = findViewById(R.id.buttonPhil);
        phil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int9 = new Intent(AverageWater.this, Philodendron.class);
                startActivity(int9);
            }
        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_average_water);
        plant1();
        plant2();
        plant3();
        plant4();
        plant5();
        plant6();
        plant7();
        plant8();
        plant9();
    }
}
