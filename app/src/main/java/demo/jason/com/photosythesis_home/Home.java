package demo.jason.com.photosythesis_home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {


    public Button userHistory;
    public Button water;
    public Button sunlight;
    public Button favs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        //// Rebecca -- non-toxic button and flower color button
        // non-toxic
        Button nonToxic = (Button) findViewById(R.id.button9);

        nonToxic.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent move;
                move = new Intent(Home.this, non_toxic_plants.class);
                startActivity(move);
            }
        });

        //flower color
        Button flowerColor = (Button) findViewById(R.id.button10);

        flowerColor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent move;
                move = new Intent(Home.this, flower_color_sort.class);
                startActivity(move);
            }
        });
        //// end


        // Favorites to Home
        Button buttonHome = findViewById(R.id.buttonfavs);

        // intent fav to home
        buttonHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent move;
                move = new Intent(Home.this, Favorites.class);
                startActivity(move);
            }
        });

        //
        Button buttonfavs = findViewById(R.id.buttonHome);

        // Capture button clicks
        buttonHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg1) {
                Intent move;
                move = new Intent(Home.this, Favorites.class);
                startActivity(move);
            }
        });

        Button buttonHistory = findViewById(R.id.userHistory);

        // Capture button clicks
        buttonHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg1) {
                Intent move;
                move = new Intent(Home.this, StoreHistory.class);
                startActivity(move);
            }
        });

        Button buttonSunlight = findViewById(R.id.mapView);

        // Capture button clicks
        buttonHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg1) {
                Intent move;
                move = new Intent(Home.this, searchChecklist.class);
                startActivity(move);
            }
        });

        His();
        agua();
        sunlight();
    }

    //Suzanne Start
    public void His() {
        userHistory = findViewById(R.id.userHistory);
        userHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent storageHistory = new Intent(Home.this, StoreHistory.class);
                startActivity(storageHistory);
            }
        });
    }

    public void agua() {
        water = findViewById(R.id.water);
        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent waterAmount = new Intent(Home.this, WaterIntake.class);
                startActivity(waterAmount);
            }
        });
    }
    //Suzanne Finish

    //Reagan Start
    public void sunlight() {
        sunlight = findViewById(R.id.mapView);
        sunlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent storageHistory = new Intent(Home.this, sunlightIntake.class);
                startActivity(storageHistory);
            }
        });
    }
    //Reagan Finish
}
