package intervals;

public class IntervalLeftOpened extends Interval {

    public IntervalLeftOpened(double minimum, double maximum) {
        super(new OpenPoint(minimum), new ClosePoint(maximum));
        // TODO Auto-generated constructor stub
    }

    public Opening getOpening() {
        return Opening.LEFT_OPENED;
    }
    
    public boolean includes(Point point) {
        return this.getMinimum().menor(point) && this.getMaximum().mayor(point);
    }
    
    @Override
    public boolean includes(IntervalBothOpened interval){
        boolean minimumIncluded = interval.includes(this.getMinimum());
        boolean maximumIncluded = interval.includes(this.getMaximum());
        return (minimumIncluded || this.getMinimum() == interval.getMinimum())
                && (maximumIncluded);
        
    }
    
    @Override
    public boolean includes(IntervalLeftOpened interval) {
        boolean minimumIncluded = interval.includes(this.getMinimum());
        boolean maximumIncluded = interval.includes(this.getMaximum());
        return (minimumIncluded || interval.getMinimum() == this.getMinimum())
                && (maximumIncluded || interval.getMaximum() == this.getMaximum());
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
        return (minimumIncluded) && (maximumIncluded || interval.getMaximum() == this.getMaximum());
    }

    
    @Override
    public boolean includes(Interval interval) {
        return interval.includes(this);
    }

    @Override
    public boolean intersectsWith(IntervalBothOpened interval) {
        if (this.getMinimum() == interval.getMaximum()) {
            return false;
        }
        
        if (this.getMaximum() == interval.getMinimum()) {
            return false;
        }

        return interval.includes(this.getMinimum()) || interval.includes(this.getMaximum());
    }

    @Override
    public boolean intersectsWith(IntervalLeftOpened interval) {
        if (this.getMinimum() == interval.getMaximum()) {
            return false;
        }
        
        if (this.getMaximum() == interval.getMinimum()) {
            return false;
        }

        return interval.includes(this.getMinimum()) || interval.includes(this.getMaximum());
    }

    @Override
    public boolean intersectsWith(IntervalRightOpened interval) {
        if (this.getMinimum() == interval.getMaximum()) {
            return false;
        }
        
        if (this.getMaximum() == interval.getMinimum()) {
            return true;
        }

        return interval.includes(this.getMinimum()) || interval.includes(this.getMaximum());
    }

    @Override
    public boolean intersectsWith(IntervalUnopened interval) {
        if (this.getMinimum() == interval.getMaximum()) {
            return false;
        }
        
        if (this.getMaximum() == interval.getMinimum()) {
            return true;
        }

        return interval.includes(this.getMinimum()) || interval.includes(this.getMaximum());
    }
    
    @Override
    public boolean intersectsWith(Interval interval) {
        
        return interval.intersectsWith(this);
        
    }
    
    @Override
    public String toString() {
        return "Interval (" + getMinimum() + ", " + getMaximum() + "]";
    }
}
