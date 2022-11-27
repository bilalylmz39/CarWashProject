package washing;

import washing.Brush;

public class SoftBrush extends Brush {

    public SoftBrush() {
        super();
    }

    private int thickness = 1;

    @Override
    public void start() {
        System.out.println("Soft  brush is working");
    }

    @Override
    public void stop() {
        System.out.println("Soft brush is stop");
    }
}
