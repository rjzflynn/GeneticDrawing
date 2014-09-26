package geneticapp;

import geneticapp.Interface.GUI;

public class App {

    public static void main(String[] args) {
        startApp();
    }
    
    private static void startApp(){
        GeneticAlgo app = new GeneticAlgo();
        GUI gui = new GUI(app);
        app.setGui(gui);
        gui.setVisible(true);
    }
}
