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
    
    public abstract boolean menor(Point point);
    
    public abstract boolean menor(InitialOpenPoint point);
    
    public abstract boolean menor(InitialClosePoint point);
    
    public abstract boolean menor(EndOpenPoint point);
    
    public abstract boolean menor(EndClosePoint point);
    
    public abstract boolean mayor(Point point);
    
    public abstract boolean mayor(InitialOpenPoint point);
    
    public abstract boolean mayor(InitialClosePoint point);
    
    public abstract boolean mayor(EndOpenPoint point);
    
    public abstract boolean mayor(EndClosePoint point);
    

    public boolean menorIgual(Point point) {
        return this.menor(point) || this.igual(point);
    }
    
    public boolean mayorIgual(Point point) {
        return this.mayor(point) || this.igual(point);
    }


}
