package intervals;

public class IntervalBothOpened extends Interval{
    
    public IntervalBothOpened(double minimum, double maximum) {
        super(minimum, maximum);
        // TODO Auto-generated constructor stub
    }

    public Opening getOpening() {
        return Opening.BOTH_OPENED;
    }
    
    public boolean includes(double value) {
        return getMinimum() < value && value < getMaximum();
    }
    
    public boolean includes(Interval interval) {
        
    }

}
