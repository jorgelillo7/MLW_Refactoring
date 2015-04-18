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

    @Override
    public boolean menor(Point point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean menor(InitialOpenPoint point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean menor(InitialClosePoint point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean menor(EndOpenPoint point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean menor(EndClosePoint point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean mayor(Point point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean mayor(InitialOpenPoint point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean mayor(InitialClosePoint point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean mayor(EndOpenPoint point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean mayor(EndClosePoint point) {
        // TODO Auto-generated method stub
        return false;
    }

}
