package washing;

public class WashingPanel {
    private Door door;
    private Speaker speaker;
    private Brush brush;
    private boolean washingState = false;

    public WashingPanel(Door door, Speaker speaker, Brush brush) {
        this.door = door;
        this.speaker = speaker;
        this.brush = brush;
    }

    public boolean isWashingState() {
        return washingState;
    }

    public void setWashingState(boolean washingState) {
        this.washingState = washingState;
    }

    public  void start(){

        System.out.println("The panel squeezs sparkling water");
        Brush brush = new ScrubBrush();
        brush.start();
        System.out.println("The panel start rins with water");
        System.out.println("The panel dry the car  ");
        door.open();
        stop();

    }

    public  void stop(){
        System.out.println("Washing panel stop to washing");
        speaker.makeNoise();
        door.close();
    }
    //dsa

}
