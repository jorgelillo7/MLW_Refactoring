package intervals;

public class IntervalRightOpened extends Interval {

    public IntervalRightOpened(double minimum, double maximum, Opening opening) {
        super(minimum, maximum, opening);
        // TODO Auto-generated constructor stub
    }
    
    Opening getOpening() {
        return Opening.RIGHT_OPENED;
    }

}
