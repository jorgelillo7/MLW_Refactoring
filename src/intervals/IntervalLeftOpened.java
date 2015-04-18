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
        boolean minimumIncluded = this.includes(interval.getMinimum());
        boolean maximumIncluded = this.includes(interval.getMaximum());
        switch (interval.getOpening()) {
        case BOTH_OPENED:
            return (minimumIncluded || getMinimum() == interval.getMinimum())
                    && (maximumIncluded || getMaximum() == interval.getMaximum());
        case LEFT_OPENED:
            return (minimumIncluded || getMinimum() == interval.getMinimum())
                    && (maximumIncluded || getMaximum() == interval.getMaximum());
        case RIGHT_OPENED:
            return (minimumIncluded)
                    && (maximumIncluded || getMaximum() == interval.getMaximum());
        case UNOPENED:
            return (minimumIncluded)
                    && (maximumIncluded || getMaximum() == interval.getMaximum());
        default:
            assert false;
            return false;
        }
    }
    
    public boolean includes(IntervalBothOpened interval){
        boolean minimumIncluded = this.includes(interval.getMinimum());
        boolean maximumIncluded = this.includes(interval.getMaximum());
        return false;
        
    }
    
    public boolean includes(IntervalLeftOpened interval) {
        boolean minimumIncluded = this.includes(interval.getMinimum());
        boolean maximumIncluded = this.includes(interval.getMaximum());
        return false;
    }
    
    public boolean includes(IntervalRightOpened interval) {
        boolean minimumIncluded = this.includes(interval.getMinimum());
        boolean maximumIncluded = this.includes(interval.getMaximum());
        return false;
    }
    
    public boolean includes(IntervalUnopened interval) {
        boolean minimumIncluded = this.includes(interval.getMinimum());
        boolean maximumIncluded = this.includes(interval.getMaximum());
        return false;
    }
}
