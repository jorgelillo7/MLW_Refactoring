package intervals;

public class IntervalLeftOpened extends Interval {

    public IntervalLeftOpened(double minimum, double maximum, Opening opening) {
        super(minimum, maximum, opening);
        // TODO Auto-generated constructor stub
    }

    Opening getOpening() {
        return Opening.LEFT_OPENED;
    }
    
}
