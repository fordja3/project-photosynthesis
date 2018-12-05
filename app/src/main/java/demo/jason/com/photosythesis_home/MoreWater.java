package demo.jason.com.photosythesis_home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MoreWater extends AppCompatActivity {

    public Button AnthiriumButton;

    public void plant1() {
        AnthiriumButton = findViewById(R.id.buttonPeper);
        AnthiriumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(MoreWater.this, Anthurium.class);
                startActivity(int1);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_water);
        plant1();
        }
    }

