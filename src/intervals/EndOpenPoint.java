package intervals;

public class EndOpenPoint extends Point {

    public EndOpenPoint(double value) {
        super(value);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean igual(Point point) {
        return point.igual(this);
    }

    @Override
    public boolean igual(EndOpenPoint point) {
        return false;
    }

    @Override
    public boolean igual(InitialClosePoint point) {
       return false;
    }

    @Override
    public boolean igual(InitialOpenPoint point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean igual(EndClosePoint point) {
        // TODO Auto-generated method stub
        return false;
    }

}
