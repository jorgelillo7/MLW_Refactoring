package intervals;

public class IntervalUnopened extends Interval{
    
    public IntervalUnopened(double minimum, double maximum) {
        super(new InitialClosePoint(minimum), new EndClosePoint(maximum));
        // TODO Auto-generated constructor stub
    }

    public Opening getOpening() {
        return Opening.UNOPENED;
    }
    
    public boolean includes(double value) {
        return this.includes(new InitialClosePoint(value));
    }
    
    @Override
    public String toString() {
        return "Interval [" + getMinimum() + ", " + getMaximum() + "]";
    }

}
