package intervals;

public class IntervalLeftOpened extends Interval {

    public IntervalLeftOpened(double minimum, double maximum) {
        super(new InitialOpenPoint(minimum), new EndClosePoint(maximum));
        // TODO Auto-generated constructor stub
    }

    public Opening getOpening() {
        return Opening.LEFT_OPENED;
    }
    
    public boolean includes(Point point) {
        return this.getMinimum().menorIgual(point) && this.getMaximum().mayorIgual(point);
    }
    
    public boolean includes(double value) {
        return this.includes(new InitialClosePoint(value));
    }
    
    @Override
    public String toString() {
        return "Interval (" + getMinimum().getValue() + ", " + getMaximum().getValue() + "]";
    }
}
