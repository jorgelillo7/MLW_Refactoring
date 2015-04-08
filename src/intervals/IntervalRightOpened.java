package intervals;

public class IntervalRightOpened extends Interval {


    
    public IntervalRightOpened(double minimum, double maximum) {
        super(minimum, maximum);
        // TODO Auto-generated constructor stub
    }

    public Opening getOpening() {
        return Opening.RIGHT_OPENED;
    }
    
    public boolean includes(double value) {
        return getMinimum() <= value && value < getMaximum();
    }
    
    
}
