package intervals;

public class IntervalUnopened extends Interval{
    
    public IntervalUnopened(double minimum, double maximum) {
        super(new InitialClosePoint(minimum), new EndClosePoint(maximum));
        // TODO Auto-generated constructor stub
    }

    public Opening getOpening() {
        return Opening.UNOPENED;
    }
    
    public boolean includes(Point point) {
        return this.getMinimum().menorIgual(point) && this.getMaximum().mayorIgual(point);
    }
    
    public boolean includes(double value) {
        return this.includes(new InitialClosePoint(value));
    }

    @Override
    public boolean intersectsWith(IntervalBothOpened interval) {
        return interval.includes(this.getMinimum()) || interval.includes(this.getMaximum());
    }

    @Override
    public boolean intersectsWith(IntervalLeftOpened interval) {
        return interval.includes(this.getMinimum()) || interval.includes(this.getMaximum());
    }

    @Override
    public boolean intersectsWith(IntervalRightOpened interval) {
        return interval.includes(this.getMinimum()) || interval.includes(this.getMaximum());
    }

    @Override
    public boolean intersectsWith(IntervalUnopened interval) {
        return interval.includes(this.getMinimum()) || interval.includes(this.getMaximum());
    }
    
    @Override
    public boolean intersectsWith(Interval interval) {   
        return interval.intersectsWith(this);  
    }
    
    @Override
    public String toString() {
        return "Interval [" + getMinimum() + ", " + getMaximum() + "]";
    }

}
