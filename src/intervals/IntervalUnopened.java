package intervals;

public class IntervalUnopened extends Interval{
    
    public IntervalUnopened(double minimum, double maximum) {
        super(minimum, maximum);
        // TODO Auto-generated constructor stub
    }

    public Opening getOpening() {
        return Opening.UNOPENED;
    }
    
    public boolean includes(double value) {
        return getMinimum() <= value && value <= getMaximum();
    }
    
    @Override
    public boolean includes(IntervalBothOpened interval){
        boolean minimumIncluded = interval.includes(this.getMinimum());
        boolean maximumIncluded = interval.includes(this.getMaximum());
        return (minimumIncluded) && (maximumIncluded);
        
    }
    
    @Override
    public boolean includes(IntervalLeftOpened interval) {
        boolean minimumIncluded = interval.includes(this.getMinimum());
        boolean maximumIncluded = interval.includes(this.getMaximum());
        return (minimumIncluded) && (maximumIncluded || interval.getMaximum() == this.getMaximum());
    }
    
    @Override
    public boolean includes(IntervalRightOpened interval) {
        boolean minimumIncluded = interval.includes(this.getMinimum());
        boolean maximumIncluded = interval.includes(this.getMaximum());
        return (minimumIncluded || interval.getMinimum() == this.getMinimum()) && (maximumIncluded);
    }
    
    @Override
    public boolean includes(IntervalUnopened interval) {
        boolean minimumIncluded = interval.includes(this.getMinimum());
        boolean maximumIncluded = interval.includes(this.getMaximum());
        return (minimumIncluded || this.getMinimum() == interval.getMinimum())
                && (maximumIncluded || getMaximum() == interval.getMaximum());
    }
    
    @Override
    public boolean includes(Interval interval) {
        return interval.includes(this);
    }

    @Override
    public boolean intersectWith(IntervalBothOpened interval) {
        if (this.getMinimum() == interval.getMaximum()) {
            return false;
        }
        
        if (this.getMaximum() == interval.getMinimum()) {
            return false;
        }

        return this.includes(interval.getMinimum()) || this.includes(interval.getMaximum());
    }

    @Override
    public boolean intersectWith(IntervalLeftOpened interval) {
        if (this.getMinimum() == interval.getMaximum()) {
            return true;
        }
        
        if (this.getMaximum() == interval.getMinimum()) {
            return false;
        }

        return this.includes(interval.getMinimum()) || this.includes(interval.getMaximum());
    }

    @Override
    public boolean intersectWith(IntervalRightOpened interval) {
        if (this.getMinimum() == interval.getMaximum()) {
            return false;
        }
        
        if (this.getMaximum() == interval.getMinimum()) {
            return true;
        }

        return this.includes(interval.getMinimum()) || this.includes(interval.getMaximum());
    }

    @Override
    public boolean intersectWith(IntervalUnopened interval) {
        if (this.getMinimum() == interval.getMaximum()) {
            return true;
        }
        
        if (this.getMaximum() == interval.getMinimum()) {
            return true;
        }

        return this.includes(interval.getMinimum()) || this.includes(interval.getMaximum());
    }

}
