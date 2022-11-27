package washing;

public class Camera {
    private Speaker speaker;
    private Door door;
    private boolean carState = false;
    private WashingPanel washingPanel;

    public Camera(Speaker speaker, Door door, boolean carState, WashingPanel washingPanel) {
        this.speaker = speaker;
        this.door = door;
        this.carState = carState;
        this.washingPanel = washingPanel;
    }

    public boolean isCarState() {
        return carState;
    }

    public void setCarState(boolean carState) {
        this.carState = carState;
    }

    public void plaqueControl(int plaque){
        if(StaticDatabase.plaqueControl(plaque)){
            speaker.makeNoise();
            door.open();
            System.out.println("The car enter the garaga");
            washingPanel.start();
        }
    }

}
