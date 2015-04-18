package intervals;

public class EndOpenPoint extends Point {

    public EndOpenPoint(double value) {
        super(value);
    }

    @Override
    public boolean igual(Point point) {
        return point.igual(this);
    }

    @Override
    public boolean igual(EndOpenPoint point) {
        return true;
    }

    @Override
    public boolean igual(InitialClosePoint point) {
       return false;
    }

    @Override
    public boolean igual(InitialOpenPoint point) {
        return false;
    }

    @Override
    public boolean igual(EndClosePoint point) {
        return false;
    }

}
