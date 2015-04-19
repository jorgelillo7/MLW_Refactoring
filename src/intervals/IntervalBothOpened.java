package intervals;

public class IntervalBothOpened extends Interval{
    
    public IntervalBothOpened(double minimum, double maximum) {
        super(new InitialOpenPoint(minimum), new EndOpenPoint(maximum));
        // TODO Auto-generated constructor stub
    }

    public Opening getOpening() {
        return Opening.BOTH_OPENED;
    }
    
    public boolean includes(double value) {
        return this.includes(new InitialClosePoint(value));
    }
    
    @Override
    public String toString() {
        return "Interval (" + getMinimum().getValue() + ", " + getMaximum().getValue() + ")";
    }

    
}
