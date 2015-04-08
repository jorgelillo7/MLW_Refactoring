package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
	    
    	switch (opening) {
            case BOTH_OPENED:
                return new IntervalBothOpened(minimum,maximum);
            case LEFT_OPENED:
                return new IntervalLeftOpened(minimum,maximum);
            case RIGHT_OPENED:
                return new IntervalRightOpened(minimum,maximum);
            case UNOPENED:
                return new IntervalUnopened(minimum,maximum);
            default:
                throw new IllegalArgumentException("Incorrect type code value");
        }
		
	}
}