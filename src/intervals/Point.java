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
    
    public abstract boolean igual(OpenPoint point);
    
    public abstract boolean igual(ClosePoint point);
    
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
