package intervals;

public class OpenPoint extends Point {

    public OpenPoint(double value) {
        super(value);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean igual(Point point) {
        return point.igual(this);
    }

    @Override
    public boolean igual(OpenPoint point) {
        return false;
    }

    @Override
    public boolean igual(ClosePoint point) {
       return false;
    }

}
