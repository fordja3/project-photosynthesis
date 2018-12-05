package demo.jason.com.photosythesis_home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import static demo.jason.com.photosythesis_home.plantList.plantList;
import static demo.jason.com.photosythesis_home.plantList.plantListAdd;

public class searchChecklist extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_checklist);

        // moved to MainActivity for now.
        //ArrayList<Plant> plantList = plantListAdd();

        // Locate the button in activity_main.xml
        Button nonVerigated = findViewById(R.id.buttonNonVerigated);

        // Capture button clicks
        nonVerigated.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {
                Intent move;
                move = new Intent(searchChecklist.this, searchFlowering.class);
                startActivity(move);

                plantList.removeIf(Plant->!Plant.getVerigated());
                Toast.makeText(searchChecklist.this,plantList.toString(),Toast.LENGTH_LONG).show();

            }
        });

        Button Verigated = findViewById(R.id.buttonVerigated);

        Verigated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move;
                move = new Intent(searchChecklist.this, searchFlowering.class);
                startActivity(move);

                plantList.removeIf(Plant->!Plant.getVerigated());

                Toast.makeText(searchChecklist.this,plantList.toString(),Toast.LENGTH_LONG).show();

            }
        });







    }
}




/*

      /*  int snakePlant = 1;
        int aloe = 2;
        int Anthurium = 3;
        int asparagus = 4;
        int peaceLily = 5;
        int peperomia = 6;
        int castIron = 7;
        int christmasCactus = 8;
        int dieffenbachia = 9;
        int chineseEvergreen = 10;
        int dracaena = 11;
        int englishIvy = 12;
        int ficus = 13;
        int hoya = 14;
        int parlorPalm = 15;
        int philodendron = 16;
        int spiderPlant = 17;
        int tradescantia = 18;
        int swedishIvy = 19;
        int arrowheadVine = 20;
        list.add(snakePlant);//Adding plants to the list
        list.add(aloe);
        list.add(Anthurium);
        list.add(asparagus);
        list.add(peaceLily);
        list.add(peperomia);
        list.add(castIron);
        list.add(christmasCactus);
        list.add(dieffenbachia);
        list.add(chineseEvergreen);
        list.add(dracaena);
        list.add(englishIvy);
        list.add(ficus);
        list.add(hoya);
        list.add(parlorPalm);
        list.add(philodendron);
        list.add(spiderPlant);
        list.add(tradescantia);
        list.add(swedishIvy);
        list.add(arrowheadVine);



        System.out.println(plantList.toString()); //For testing

      /*  System.out.println(list.contains(aloe));

        System.out.println(list.get(aloe));

        System.out.println(list.indexOf(aloe));

        System.out.println(list.equals(aloe));



        System.out.println("Is it a flowering plant or non-flowering?");


        if(plantList.equals(false)){

            plantList.remove(Aloe);
            plantList.remove(Asparagus);
            plantList.remove(Asparagus);

             System.out.println(plantList.toString());
        }else{

            plantList.remove(Anthurium);
            plantList.remove(Asparagus);
            plantList.remove(Asparagus);

        }


        System.out.println("Is it verigated or non-verigated?");

        if (plantList.contains(true)) {
            System.out.println("true");
        }else{
            System.out.println("false");

        }

        System.out.println("How much water does it need?");  //Button clicks will enter "number" and return

        if(plantList.contains(1)){
            System.out.println("1");
        }else if(plantList.contains(2)){
            System.out.println("2");
        }else{
            System.out.println("3");

        }
    }

    public static String flowering(ArrayList plantList){

        System.out.println("Is it a flowering plant or non-flowering?");

        if(plantList.equals(false)){
            return plantList.toString();

        }else{

            return plantList.toString();
        }

       // return plantList.toString();
    }


    private static int firstQuestion(ArrayList list, int snakePlant, int aloe, int Anthurium, int asparagus, int peaceLily, int peperomia, int castIron, int christmasCactus, int dieffenbachia, int chineseEvergreen, int dracaena, int englishIvy, int ficus, int hoya, int parlorPalm, int philodendron, int spiderPlant, int tradescantia, int swedishIvy, int arrowheadVine) {
        //Flowering or not flowering? Flowering = 1   Not flowering = 0

        snakePlant = 0;//Setting the answer to the question for each plant
        aloe = 0;
        Anthurium = 1;
        asparagus = 0;
        peaceLily = 1;
        peperomia = 1;
        castIron = 0;
        christmasCactus = 1;
        dieffenbachia = 0;
        chineseEvergreen = 0;
        dracaena = 0;
        englishIvy = 0;
        ficus = 0;
        hoya = 0;
        parlorPalm = 0;
        philodendron = 0;
        spiderPlant = 0;
        tradescantia = 1;
        swedishIvy = 0;
        arrowheadVine = 0;
        Scanner reader = new Scanner(System.in);//scanning user input
        int userInput = reader.nextInt();
        reader.close();

        while(list.contains(list.get(userInput)))//using userinput to modify the arraylist
        {list.remove(list.get(userInput));
            System.out.println(list); //For testing

        }
    return Integer.parseInt(list.toString());
    }


    private static void secondQuestion(int snakePlant, int aloe, int Anthurium, int asparagus, int peaceLily, int peperomia, int castIron, int christmasCactus, int dieffenbachia, int chineseEvergreen, int dracaena, int englishIvy, int ficus, int hoya, int parlorPalm, int philodendron, int spiderPlant, int tradescantia, int swedishIvy, int arrowheadVine) {
        //Varigated or not varigated? Varigated = 1   Not varigated = 0

        snakePlant = 1;//Setting the answer to the question for each plant
        aloe = 0;
        Anthurium = 0;
        asparagus = 0;
        peaceLily = 0;
        peperomia = 0;
        castIron = 0;
        christmasCactus = 0;
        dieffenbachia = 1;
        chineseEvergreen = 1;
        dracaena = 1;
        englishIvy = 0;
        ficus = 1;
        hoya = 0;
        parlorPalm = 0;
        philodendron = 0;
        spiderPlant = 1;
        tradescantia = 0;
        swedishIvy = 1;
        arrowheadVine = 1;
        Scanner reader = new Scanner(System.in);//scanning user input
        int userInput = reader.nextInt();
        reader.close();

    /*    while(list.contains(list.get(userInput))){//using userinput to modify the arraylist
             list.remove(list.get(userInput));
            System.out.println(list.toString()); //For testing
    */





















