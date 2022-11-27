package washing;

import washing.Brush;

public class ScrubBrush extends Brush {

    public ScrubBrush() {
        super();
    }

    private int thickness = 1;

    @Override
    public void start() {
        System.out.println("Scrub  brush is working");
    }

    @Override
    public void stop() {
        System.out.println("Scrub  brush is stop");
    }
}
