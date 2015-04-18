package intervals;

public class IntervalRightOpened extends Interval {
    
    public IntervalRightOpened(double minimum, double maximum) {
        super(new InitialClosePoint(minimum), new EndOpenPoint(maximum));
        // TODO Auto-generated constructor stub
    }

    public Opening getOpening() {
        return Opening.RIGHT_OPENED;
    }
    
    public boolean includes(Point point) {
        return this.getMinimum().menorIgual(point) && this.getMaximum().mayorIgual(point);
    }
    
    public boolean includes(double value) {
        return this.includes(new InitialClosePoint(value));
    }
    
    @Override
    public boolean includes(IntervalBothOpened interval){
        return (interval.includes(this.getMinimum())) && (interval.includes(this.getMaximum()));    
    }
    
    @Override
    public boolean includes(IntervalLeftOpened interval) {
        return (interval.includes(this.getMinimum())) && (interval.includes(this.getMaximum()));
    }
    
    @Override
    public boolean includes(IntervalRightOpened interval) {
        return (interval.includes(this.getMinimum())) && (interval.includes(this.getMaximum()));
    }
    
    @Override
    public boolean includes(IntervalUnopened interval) {
        return (interval.includes(this.getMinimum())) && (interval.includes(this.getMaximum()));
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
        return "Interval [" + getMinimum().getValue() + ", " + getMaximum().getValue() + ")";
    }
    
}
