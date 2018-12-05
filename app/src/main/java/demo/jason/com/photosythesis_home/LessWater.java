package demo.jason.com.photosythesis_home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LessWater extends AppCompatActivity {
    public Button AloeButton;
    public void plant1() {
        AloeButton = findViewById(R.id.buttonAloe);
        AloeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(LessWater.this, Aloe.class);
                startActivity(int1);
            }
        });
    }

    public Button Asparagus;
    public void plant2() {
        Asparagus = findViewById(R.id.asparagus);
        Asparagus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(LessWater.this, AsparagusFern.class);
                startActivity(int2);
            }
        });
    }

    public Button dragon;
    public void plant3() {
        dragon = findViewById(R.id.Dragon);
        dragon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(LessWater.this, DragonTree.class);
                startActivity(int3);
            }
        });

    }


    public Button peper;
    public void plant4() {
        peper = findViewById(R.id.buttonPeper);
        peper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(LessWater.this, Peperomia.class);
                startActivity(int4);
            }
        });

    }

    public Button ficus;
    public void plant5(){
        ficus = findViewById(R.id.buttonFicusSue);
        ficus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(LessWater.this, ficusSue.class);
                startActivity(int5);
            }
        });
    }

    public Button hoya;
    public void plant6(){
        hoya = findViewById(R.id.buttonHoyaSue);
        hoya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(LessWater.this, hoyaSue.class);
                startActivity(int6);
            }
        });
    }

    public Button trad;
    public void plant7(){
        trad = findViewById(R.id.buttonTrad);
        trad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7 = new Intent(LessWater.this, TradescantiaSue.class);
                startActivity(int7);
            }
        });
    }

    public Button swedishIvy;
    public void plant8(){
        swedishIvy = findViewById(R.id.buttonSwe);
        swedishIvy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int8 = new Intent(LessWater.this, SwedishIvy.class);
                startActivity(int8);
            }
        });
    }

    public Button snake;
    public void plant9(){
        snake = findViewById(R.id.buttonSnake);
        snake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int9 = new Intent(LessWater.this, SnakePlant.class);
                startActivity(int9);
            }
        });
    }

    public Button chris;
    public void plant10(){
        snake = findViewById(R.id.buttonChris);
        snake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int10 = new Intent(LessWater.this, ChristmasCactus.class);
                startActivity(int10);
            }
        });
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_less_water);
        plant1();
        plant2();
        plant3();
        plant4();
        plant5();
        plant6();
        plant7();
        plant8();
        plant9();
        plant10();


    }
}
