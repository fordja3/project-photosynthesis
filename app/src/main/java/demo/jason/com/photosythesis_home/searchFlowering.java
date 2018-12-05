package demo.jason.com.photosythesis_home;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

import static demo.jason.com.photosythesis_home.plantList.plantList;

public class searchFlowering extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_flowering);


        // Locate the button in activity_main.xml
        Button Flowering = findViewById(R.id.buttonFlowering);


        // Capture button clicks
        Flowering.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {

                plantList.removeIf(Plant->!Plant.getFlowering());
                //Toast.makeText(searchFlowering.this,plantList.toString(),Toast.LENGTH_LONG).show();

                Intent move;
                move = new Intent(searchFlowering.this, Search.class);
                startActivity(move);

            }
        });


        Button NonFlowering = findViewById(R.id.buttonNonFlowering);

        NonFlowering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                plantList.removeIf(Plant->!Plant.getFlowering());
               // Toast.makeText(searchFlowering.this,plantList.toString(),Toast.LENGTH_LONG).show();
                Intent move;
                move = new Intent(searchFlowering.this, Search.class);
                startActivity(move);

            }
        });

    }
}

