package demo.jason.com.photosythesis_home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class non_toxic_plants extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button5;
    private Button button6;
    private Button button8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_toxic_plants);

        // for button 1 - christmas cactus
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openChristmasCactus();
            }
        });

        // for button 2 - hoys
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openHoya();
            }
        });

        // for button 5 - parlor palm
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openParlorPalm();
            }
        });

        // for button 6 - spider plant
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSpiderPlant();
            }
        });

        // for button 8 - swedish ivy
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSwedishIvy();
            }
        });


    }

    public void openChristmasCactus(){
        Intent intent = new Intent(this, ChristmasCactus.class);
        startActivity(intent);
    }

    public void openHoya(){
        Intent intent = new Intent(this, hoyaSue.class);
        startActivity(intent);
    }

    public void openParlorPalm(){
        Intent intent = new Intent(this, ParlorPalm.class);
        startActivity(intent);
    }

    public void openSpiderPlant(){
        Intent intent = new Intent(this, SpiderPlant.class);
        startActivity(intent);
    }

    // for some reason swedishIvyNew doesn't work, it crashes when you click button
    //  will try to fix later, for now, place holder with english ivy
    public void openSwedishIvy(){
        Intent intent = new Intent(this, SwedishIvy.class);
        startActivity(intent);
    }
}
