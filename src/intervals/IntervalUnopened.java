package intervals;

public class IntervalUnopened extends Interval{
    
    public IntervalUnopened(double minimum, double maximum) {
        super(minimum, maximum);
        // TODO Auto-generated constructor stub
    }

    Opening getOpening() {
        return Opening.UNOPENED;
    }
    
    public boolean includes(double value) {
        return getMinimum() <= value && value <= getMaximum();
    }
    

}
