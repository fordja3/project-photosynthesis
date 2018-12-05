package demo.jason.com.photosythesis_home;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class Plant {

    String name;
    boolean flowering;
    boolean verigated;
    boolean broadLeaf;
    int watering;


    public Plant(String name, boolean verigated, boolean flowering, int watering, boolean broadLeaf){

        this.name = name;
        this.verigated = verigated;
        this.flowering = flowering;
        this.watering = watering;
        this.broadLeaf = broadLeaf;
    }

    public Plant() {
    }


    public String getName(){
        return name.toString();
    }

    boolean getFlowering(){
        return flowering;
    }

    boolean getVerigated(){
        return verigated;
    }

    boolean getBroadLeaf(){
        return broadLeaf;
    }

    public int waterNeeds(){
        int med = 2;
        int low = 1;
        int high = 3;

        if(low == 1){
            return 1;
        }else if(med == 2){
            return 2;
        }else{
            return 3;
        }
    }

    public String toString(){
        return this.getName();
    }


}
