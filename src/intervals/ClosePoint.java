package intervals;

public class ClosePoint extends Point{

    public ClosePoint(double value) {
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
       return this.getValue() == point.getValue();
    }

}
