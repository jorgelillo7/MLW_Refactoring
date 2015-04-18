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
    
    public boolean includes(IntervalBothOpened interval){
        boolean minimumIncluded = this.includes(interval.getMinimum());
        boolean maximumIncluded = this.includes(interval.getMaximum());
        return (minimumIncluded || getMinimum() == interval.getMinimum())
                && (maximumIncluded || getMaximum() == interval.getMaximum());
        
    }
    
    public boolean includes(IntervalLeftOpened interval) {
        boolean minimumIncluded = this.includes(interval.getMinimum());
        boolean maximumIncluded = this.includes(interval.getMaximum());
        return (minimumIncluded || getMinimum() == interval.getMinimum())
                && (maximumIncluded || getMaximum() == interval.getMaximum());
    }
    
    public boolean includes(IntervalRightOpened interval) {
        boolean minimumIncluded = this.includes(interval.getMinimum());
        boolean maximumIncluded = this.includes(interval.getMaximum());
        return (minimumIncluded)
                && (maximumIncluded || getMaximum() == interval.getMaximum());
    }
    
    public boolean includes(IntervalUnopened interval) {
        boolean minimumIncluded = this.includes(interval.getMinimum());
        boolean maximumIncluded = this.includes(interval.getMaximum());
        return (minimumIncluded)
                && (maximumIncluded || getMaximum() == interval.getMaximum());
    }
}
