package intervals;

public abstract class Point {
    
    private double value;

    public Point(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    public abstract boolean igual(Point point);
    
    public abstract boolean igual(InitialOpenPoint point);
    
    public abstract boolean igual(InitialClosePoint point);
    
    public abstract boolean igual(EndOpenPoint point);
    
    public abstract boolean igual(EndClosePoint point);
    
    public boolean menor(Point point) {
        return this.getValue() < point.getValue();
    }

    public boolean menorIgual(Point point) {
        return this.menor(point) || this.igual(point);
    }
    
    public boolean mayor(Point point) {
        return this.getValue() > point.getValue();
    }
    
    public boolean mayorIgual(Point point) {
        return this.mayor(point) || this.igual(point);
    }


}
