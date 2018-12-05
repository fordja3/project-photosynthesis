package demo.jason.com.photosythesis_home;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static demo.jason.com.photosythesis_home.plantList.plantList;


public class searchBroadLeaf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_broad_leaf);


            // Locate the button in activity_main.xml
            Button nonVerigated = findViewById(R.id.buttonNonVerigated);

            // Capture button clicks
            nonVerigated.setOnClickListener(new View.OnClickListener() {


                @SuppressLint("NewApi")
                public void onClick(View arg0) {
                    Intent move;
                    move = new Intent(searchBroadLeaf.this, EnglishIvy.class);
                    startActivity(move);

                    plantList.removeIf(Plant->Plant.getVerigated() == true);
                    plantList.removeIf(Plant->Plant.getFlowering() == false);
                    plantList.removeIf(Plant->Plant.getBroadLeaf() == false);

                    Toast.makeText(searchBroadLeaf.this,plantList.toString(),Toast.LENGTH_LONG).show();

                }
            });

            Button Verigated = findViewById(R.id.buttonVerigated);

            Verigated.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent move;
                    move = new Intent(searchBroadLeaf.this, SnakePlant.class);
                    startActivity(move);

                    plantList.removeIf(Plant->Plant.getVerigated() == false);
                    plantList.removeIf(Plant->Plant.getFlowering() == true);
                    plantList.removeIf(Plant->Plant.getBroadLeaf() == true);

                    System.out.println(plantList.toString());

                    Toast.makeText(searchBroadLeaf.this,plantList.toString(),Toast.LENGTH_LONG).show();

                }
            });



        }
}
