package demo.jason.com.photosythesis_home;

import android.os.Bundle;

import java.util.ArrayList;

public abstract class plantList extends Plant {

    public static ArrayList<Plant> plantList = new ArrayList<Plant>();
//
//    Plant Snakeplant = new Plant("Snakeplant", true, false, 1, true);
//    Plant Aloe = new Plant("Aloe", true, false, 2,false);
//    Plant Anthurium = new Plant("anthurium_", false, true, 3, true);
//    Plant Asparagus = new Plant("Asparagus", false, true, 1, false);
//    Plant PeaceLily = new Plant("PeaceLily", true, false, 2, true);
//    Plant Peperomia = new Plant("Peperomia", false, true, 3, false);
//    Plant CastIron = new Plant("CastIron", true, true, 1, true);
//    Plant ChristmasCactus = new Plant("ChristmasCactus", false, true, 2, false);
//    Plant DragonTree = new Plant("DragonTree", false, false, 2, true);


    public static ArrayList<Plant> plantListAdd() {
        //ArrayList<Plant> plantList = new ArrayList<Plant>();


        Plant Aloe = new Plant("Aloe", true, false, 2, false);
        Plant Anthurium = new Plant("Anthurium", false, true, 3, true);
        Plant Asparagus = new Plant("Asparagus", false, true, 1, false);
        Plant PeaceLily = new Plant("PeaceLily", true, false, 2, true);
        Plant Peperomia = new Plant("Peperomia", false, true, 3, false);
        Plant CastIron = new Plant("CastIron", true, true, 1, true);
        Plant ChristmasCactus = new Plant("Christmas Cactus", false, true, 2, false);
        // watering not yet changed.
        Plant DragonTree = new Plant("DragonTree", false, false, 1, true);
        Plant Spiderplant = new Plant("Spiderplant", true, false, 1, false);
        Plant Deiffenbachia = new Plant("Deiffenbachia", true, false, 2, true);
        Plant ChineseEvergreen = new Plant("Chinese Evergreen", true, false, 3, true);
        Plant EnglishIvy = new Plant("English Ivy", false, false, 1, false);
        Plant Ficus = new Plant("Ficus", true, false, 2, true);
        Plant Hoya = new Plant("Hoya", false, true, 1, false); //done
        Plant ParlorPalm = new Plant("Parlor Palm", false, false, 1, false);
        Plant Philodendron = new Plant("Philodendron", false, false, 2, true);
        Plant Snakeplant = new Plant("Snakeplant", true, false, 1, true);
        Plant SwedishIvy = new Plant("Swedish Ivy", true, false, 2, true);
        Plant Tradescantia = new Plant("Tradescantia", false, false, 2, false);
        Plant ArrowHeadVine = new Plant("Arrow Head Vine", true, false, 2, true);

        plantList.add(Snakeplant);
        plantList.add(Aloe);
        plantList.add(Anthurium);
        plantList.add(Asparagus);
        plantList.add(PeaceLily);
        plantList.add(Peperomia);
        plantList.add(ChristmasCactus);
        plantList.add(CastIron);
        plantList.add(Spiderplant);
        plantList.add(Deiffenbachia);
        plantList.add(ChineseEvergreen);
        plantList.add(EnglishIvy);
        plantList.add(Ficus);
        plantList.add(Hoya);
        plantList.add(ParlorPalm);
        plantList.add(Philodendron);
        plantList.add(DragonTree);
        plantList.add(SwedishIvy);
        plantList.add(Tradescantia);
        plantList.add(ArrowHeadVine);
        return plantList;


    }


    public plantList(String name, boolean verigated, boolean flowering, int watering,
                     boolean broadLeaf) {
        super(name, verigated, flowering, watering, broadLeaf);
    }

    public static ArrayList<Plant> getPlantList() {
        return plantList;
    }

        /*public String plantToString () {
            return plantList.toString();
        }*/


    public String plantToString() {
        String strings = "";
        for (Plant item : plantList) {
            strings = strings + item.toString() + " ";
        }
        return strings;
        //return plantList.toString();
    }

}

