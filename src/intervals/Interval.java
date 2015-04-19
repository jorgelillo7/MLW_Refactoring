package intervals;

public abstract class Interval {
    
	private Point minimum;
	private Point maximum;

	public Interval(Point minimum, Point maximum) {
		this.setMinimum(minimum);
		this.setMaximum(maximum);
	}

	public double midPoint() {
		return (getMaximum().getValue() + getMinimum().getValue()) / 2;
	}
	
	public abstract boolean includes(double value);

	public abstract boolean includes(Point point);
	
	public boolean includes(Interval interval) {
        return (this.includes(interval.getMinimum())) && (this.includes(interval.getMaximum()));
    }
	
	public boolean intersectsWith(Interval interval) {
        return this.includes(interval.getMinimum()) || this.includes(interval.getMaximum());
    }
	
	@Override
	public boolean equals(Object object) {
		// TODO
		return false;
	}

    public Point getMaximum() {
        return maximum;
    }

    private void setMaximum(Point maximum) {
        this.maximum = maximum;
    }

    public Point getMinimum() {
        return minimum;
    }
    

    private void setMinimum(Point minimum) {
        this.minimum = minimum;
    }

    public abstract Opening getOpening();


}
