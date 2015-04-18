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
    
    public boolean igual(Point point) {
        return this.getValue() == point.getValue();
    }
    
    public abstract boolean menor(Point point);

    public abstract boolean menor(OpenPoint point);

    public abstract boolean menor(ClosePoint point);

    public boolean menorIgual(Point point) {
        return this.menor(point) || this.igual(point);
    }
    
    public boolean mayor(Point point) {
        return !this.menorIgual(point);
    }
    
    public boolean mayorIgual(Point point) {
        return !this.menor(point);
    }


}
