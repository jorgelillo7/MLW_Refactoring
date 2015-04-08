package intervals;

public class IntervalUnopened extends Interval{

    public IntervalUnopened(double minimum, double maximum, Opening opening) {
        super(minimum, maximum, opening);
        // TODO Auto-generated constructor stub
    }
    
    Opening getOpening() {
        return Opening.UNOPENED;
    }

}
