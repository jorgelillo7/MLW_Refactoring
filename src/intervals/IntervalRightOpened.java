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
    public String toString() {
        return "Interval [" + getMinimum().getValue() + ", " + getMaximum().getValue() + ")";
    }
    
}
