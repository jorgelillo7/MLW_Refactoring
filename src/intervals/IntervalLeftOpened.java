package intervals;

public class IntervalLeftOpened extends Interval {

    public IntervalLeftOpened(double minimum, double maximum) {
        super(minimum, maximum);
        // TODO Auto-generated constructor stub
    }

    public Opening getOpening() {
        return Opening.LEFT_OPENED;
    }
    
    public boolean includes(double value) {
        return getMinimum() < value && value <= getMaximum();
    }
    
    public boolean includes(Interval interval) {
        
    }
}
