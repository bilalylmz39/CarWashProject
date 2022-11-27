package washing;

public class Door{

    /*
    false represent => door is close
    true  //        => door is open
     */
    private boolean isOpen = false;



    public void open() {
        isOpen = true;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Door is open");
    }

    public void close() {

        isOpen = false;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The car exit from garagage");

        System.out.println("Door is close");

    }

    public boolean isOpen() {
        return isOpen;
    }


}
