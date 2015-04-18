package intervals;

public class EndClosePoint extends Point{

    public EndClosePoint(double value) {
        super(value);
    }

    @Override
    public boolean igual(Point point) {
        return point.igual(this);
    }

    @Override
    public boolean igual(InitialOpenPoint point) {
        return false;
    }

    @Override
    public boolean igual(EndClosePoint point) {
       return this.getValue() == point.getValue();
    }

    @Override
    public boolean igual(InitialClosePoint point) {
        return this.getValue() == point.getValue();
    }

    @Override
    public boolean igual(EndOpenPoint point) {
        return false;
    }

}
