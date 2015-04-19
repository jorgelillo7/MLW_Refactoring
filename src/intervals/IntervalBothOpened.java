package intervals;

public class IntervalBothOpened extends Interval{
    
    public IntervalBothOpened(double minimum, double maximum) {
        super(new InitialOpenPoint(minimum), new EndOpenPoint(maximum));
        // TODO Auto-generated constructor stub
    }

    public Opening getOpening() {
        return Opening.BOTH_OPENED;
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
        return "Interval (" + getMinimum().getValue() + ", " + getMaximum().getValue() + ")";
    }

    
}
