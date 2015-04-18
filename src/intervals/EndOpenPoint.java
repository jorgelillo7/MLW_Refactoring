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

    @Override
    public boolean menor(Point point) {
        return point.menor(this);
    }

    @Override
    public boolean menor(InitialOpenPoint point) {
        return point.getValue() < this.getValue();
    }

    @Override
    public boolean menor(InitialClosePoint point) {
        return point.getValue() < this.getValue();
    }

    @Override
    public boolean menor(EndOpenPoint point) {
        return point.getValue() < this.getValue();
    }

    @Override
    public boolean menor(EndClosePoint point) {
        return point.getValue() < this.getValue();
    }

    @Override
    public boolean mayor(Point point) {
        return point.mayor(this);
    }

    @Override
    public boolean mayor(InitialOpenPoint point) {
        return point.getValue() > this.getValue();
    }

    @Override
    public boolean mayor(InitialClosePoint point) {
        return point.getValue() > this.getValue();
    }

    @Override
    public boolean mayor(EndOpenPoint point) {
        return point.getValue() > this.getValue();
    }

    @Override
    public boolean mayor(EndClosePoint point) {
        return point.getValue() > this.getValue();
    }
}
