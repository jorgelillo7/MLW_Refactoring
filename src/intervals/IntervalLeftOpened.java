package intervals;

public class IntervalLeftOpened extends Interval {

    public IntervalLeftOpened(double minimum, double maximum) {
        super(minimum, maximum);
        // TODO Auto-generated constructor stub
    }

    Opening getOpening() {
        return Opening.LEFT_OPENED;
    }
    
}
