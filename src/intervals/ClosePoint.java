package intervals;

public class ClosePoint extends Point{

    public ClosePoint(double value) {
        super(value);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean menor(Point point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean menor(OpenPoint point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean menor(ClosePoint point) {
        // TODO Auto-generated method stub
        return false;
    }

}
