package intervals;

public class IntervalRightOpened extends Interval {


    
    public IntervalRightOpened(double minimum, double maximum) {
        super(new ClosePoint(minimum), new OpenPoint(maximum));
        // TODO Auto-generated constructor stub
    }

    public Opening getOpening() {
        return Opening.RIGHT_OPENED;
    }
    
    public boolean includes(Point point) {
        return this.getMinimum().menor(point) && this.getMaximum().mayor(point);
    }
    
    public boolean includes(double value) {
        return this.includes(new ClosePoint(value));
    }
    
    
    @Override
    public boolean includes(IntervalBothOpened interval){
        boolean minimumIncluded = interval.includes(this.getMinimum());
        boolean maximumIncluded = interval.includes(this.getMaximum());
        return (minimumIncluded) && (maximumIncluded || this.getMaximum().getValue() == interval.getMaximum().getValue());
        
    }
    
    @Override
    public boolean includes(IntervalLeftOpened interval) {
        boolean minimumIncluded = interval.includes(this.getMinimum());
        boolean maximumIncluded = interval.includes(this.getMaximum());
        return (minimumIncluded) && (maximumIncluded || interval.getMaximum().getValue() == this.getMaximum().getValue());
    }
    
    @Override
    public boolean includes(IntervalRightOpened interval) {
        boolean minimumIncluded = interval.includes(this.getMinimum());
        boolean maximumIncluded = interval.includes(this.getMaximum());
        return (minimumIncluded || interval.getMinimum().getValue() == this.getMinimum().getValue())
                && (maximumIncluded || interval.getMaximum().getValue() == this.getMaximum().getValue());
    }
    
    @Override
    public boolean includes(IntervalUnopened interval) {
        boolean minimumIncluded = interval.includes(this.getMinimum());
        boolean maximumIncluded = interval.includes(this.getMaximum());
        return (minimumIncluded || interval.getMinimum().getValue() == this.getMinimum().getValue()) && (maximumIncluded);
    }

    @Override
    public boolean includes(Interval interval) {
        return interval.includes(this);
    }

    @Override
    public boolean intersectsWith(IntervalBothOpened interval) {
        if (this.getMinimum().getValue() == interval.getMaximum().getValue()) {
            return false;
        }
        
        if (this.getMaximum().getValue() == interval.getMinimum().getValue()) {
            return false;
        }

        return interval.includes(this.getMinimum()) || interval.includes(this.getMaximum());
    }

    @Override
    public boolean intersectsWith(IntervalLeftOpened interval) {
        if (this.getMinimum().getValue() == interval.getMaximum().getValue()) {
            return true;
        }
        
        if (this.getMaximum().getValue() == interval.getMinimum().getValue()) {
            return false;
        }

        return interval.includes(this.getMinimum()) || interval.includes(this.getMaximum());
    }

    @Override
    public boolean intersectsWith(IntervalRightOpened interval) {
        if (this.getMinimum().getValue() == interval.getMaximum().getValue()) {
            return false;
        }
        
        if (this.getMaximum().getValue() == interval.getMinimum().getValue()) {
            return false;
        }

        return interval.includes(this.getMinimum()) || interval.includes(this.getMaximum());
    }

    @Override
    public boolean intersectsWith(IntervalUnopened interval) {
        if (this.getMinimum().getValue() == interval.getMaximum().getValue()) {
            return true;
        }
        
        if (this.getMaximum().getValue() == interval.getMinimum().getValue()) {
            return false;
        }

        return interval.includes(this.getMinimum()) || interval.includes(this.getMaximum());
    }
    
    @Override
    public boolean intersectsWith(Interval interval) {
        
        return interval.intersectsWith(this);
        
    }
    
    @Override
    public String toString() {
        return "Interval [" + getMinimum() + ", " + getMaximum() + ")";
    }
    
}
