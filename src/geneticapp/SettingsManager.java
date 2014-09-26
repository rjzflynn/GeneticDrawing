
package geneticapp;

import java.util.HashMap;
import java.util.Map;


public class SettingsManager { //Class for managing all of the apps settings:
                               //Number of polygons, points in each polygon,
                               // how the DNA should be initilized, mutation strategy.

    
    private Map<String,Integer>config;
    
    public static final int COLOR = 0;
    public static final int WHITE = 1;
    public static final int BLACK = 2;
    
    public static final int HARD = 3;
    public static final int MEDIUM = 4;
    public static final int SOFT = 5;

    public SettingsManager() {
        config = new HashMap();
        config.put("numOfPolygons", 50); 
        config.put("pointsInPolygon", 6);
        config.put("initilizeDNA", BLACK);
        config.put("mutationStrategy", MEDIUM);
    }
    
    //Setters
    
    public void setNumOfPolygons(int number){
        config.put("numOfPolygons", number);
    }
    
    public void setPointsInPolygon(int number){
        config.put("pointsInPolygon", number);
    }
    
    public void setInitialDNA(int number){
        config.put("initilizeDNA", number);
    }
    
    public void setMutationStratagy(int number){
        config.put("mutationStrategy", number);
    }
    
    //Getters
    
    public int getNumOfPolygons(){
        return config.get("numOfPolygons");
    }
    
    public int getPointsInPolygon(){
        return config.get("pointsInPolygon");
    }
    
    public int getInitialDNA(){
        return config.get("initilizeDNA");
    }
    
    public int getMutationStratagy(){
        return config.get("mutationStrategy");
    }
    
    void print(){
        for (int value : config.values()) {
            System.out.println("value: " + value);
        }
    }
    
    
}
