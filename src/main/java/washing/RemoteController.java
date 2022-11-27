package washing;

public class RemoteController {
    private Door door;

    public RemoteController(Door door) {
        this.door = door;
    }

    public void pressButoon(){
        if(door.isOpen()){
            door.close();
        }else {
            door.open();
        }
    }
}
