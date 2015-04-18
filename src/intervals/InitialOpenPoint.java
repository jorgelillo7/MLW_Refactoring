package intervals;

public class InitialOpenPoint extends Point {

    public InitialOpenPoint(double value) {
        super(value);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean igual(Point point) {
        return point.igual(this);
    }

    @Override
    public boolean igual(InitialOpenPoint point) {
        return true;
    }

    @Override
    public boolean igual(InitialClosePoint point) {
       return false;
    }

    @Override
    public boolean igual(EndOpenPoint point) {
        return false;
    }

    @Override
    public boolean igual(EndClosePoint point) {
        return false;
    }

}
