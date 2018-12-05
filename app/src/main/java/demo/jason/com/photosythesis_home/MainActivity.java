package demo.jason.com.photosythesis_home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import static demo.jason.com.photosythesis_home.plantList.plantListAdd;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Plant> plantList = plantListAdd();

        // Locate the button in activity_main.xml
        Button button1 = findViewById(R.id.buttonOpen);

        // Capture button clicks
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent move;
                move = new Intent(MainActivity.this, Home.class);
                startActivity(move);
            }
        });


    }
}

