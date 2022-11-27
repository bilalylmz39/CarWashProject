import app.App;
import washing.*;

public class Main {
    public static void main(String[] args) {

        //initialize data
        new StaticDatabase();
        App app = new App();

        Speaker speaker = new Speaker();
        Door door = new Door();
        Brush brush = new ScrubBrush();
        WashingPanel washingPanel = new WashingPanel(door,speaker,brush);


        Camera camera = new Camera(speaker,door,true,washingPanel);

        //144232 this plaque is creadet to test in App class
        System.out.println("Kamera kontrol işlemi");
        camera.plaqueControl(144232);




    }

    
}
