package demo.jason.com.photosythesis_home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class flower_color_sort extends AppCompatActivity {

    private Button button11;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_color_sort);

        // for button 1 - christmas cactus
        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openChristmasCactus();
            }
        });

        // for button 2 - Anthurium
        button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openAnthurium();
            }
        });

        // for button 5 - peace lily
        button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openPeaceLily();
            }
        });

        // for button 6 - Hoya
        button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openHoya();
            }
        });

        // for button 8 - Tradescantia
        button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTradescantia();
            }
        });
    }

    public void openChristmasCactus(){
        Intent intent = new Intent(this, ChristmasCactus.class);
        startActivity(intent);
    }

    public void openAnthurium(){
        Intent intent = new Intent(this, Anthurium.class);
        startActivity(intent);
    }

    public void openPeaceLily(){
        Intent intent = new Intent(this, PeaceLily.class);
        startActivity(intent);
    }

    public void openHoya(){
        Intent intent = new Intent(this, hoyaSue.class);
        startActivity(intent);
    }

    // for some reason swedishIvyNew doesn't work, it crashes when you click button
    //  will try to fix later, for now, place holder with english ivy
    public void openTradescantia(){
        Intent intent = new Intent(this, TradescantiaSue.class);
        startActivity(intent);
    }

}
