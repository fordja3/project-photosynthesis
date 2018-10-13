package demo.jason.com.photosythesis_home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Locate the button in activity_main.xml
        Button buttonHome = findViewById(R.id.buttonfavs);

        // Capture button clicks
        buttonHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent move;
                move = new Intent(Home.this, Favorites.class);
                startActivity(move);
            }
        });

        // Locate the button in activity_main.xml
        Button buttonfavs = findViewById(R.id.buttonHome);

        // Capture button clicks
        buttonHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg1) {
                Intent move;
                move = new Intent(Home.this, Favorites.class);
                startActivity(move);
            }
        });


    }
}
