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
                && (maximumIncluded);
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
        return (minimumIncluded) && (maximumIncluded);
    }

    @Override
    public boolean includes(Interval interval) {
        // TODO Auto-generated method stub
        return false;
    }

    
}
