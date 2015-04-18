package intervals;

public class InitialClosePoint extends Point{

    public InitialClosePoint(double value) {
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
    public boolean igual(InitialClosePoint point) {
       return this.getValue() == point.getValue();
    }

    @Override
    public boolean igual(EndOpenPoint point) {
        return false;
    }

    @Override
    public boolean igual(EndClosePoint point) {
        return this.getValue() == point.getValue();
    }

}
