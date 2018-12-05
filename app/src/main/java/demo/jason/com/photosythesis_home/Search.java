package demo.jason.com.photosythesis_home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static demo.jason.com.photosythesis_home.plantList.plantList;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Locate the button in activity_main.xml
        Button Flowering = findViewById(R.id.buttonBroadleaf);


        // Capture button clicks
        Flowering.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {



                plantList.removeIf(Plant->Plant.getBroadLeaf() == false);
                //Toast.makeText(searchFlowering.this,plantList.toString(),Toast.LENGTH_LONG).show();

                TextView tv = (TextView)findViewById(R.id.textView72);
                tv.setText(plantList.toString());

            }
        });


        Button NonFlowering = findViewById(R.id.buttonNonBroadleaf);

        NonFlowering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                plantList.removeIf(Plant->Plant.getBroadLeaf() == true);
                // Toast.makeText(searchFlowering.this,plantList.toString(),Toast.LENGTH_LONG).show();

                TextView tv = (TextView)findViewById(R.id.textView72);
                tv.setText(plantList.toString());

            }
        });


    }
}

