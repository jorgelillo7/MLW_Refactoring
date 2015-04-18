package intervals;

public abstract class Interval {
    
	private double minimum;
	private double maximum;

	public Interval(double minimum, double maximum) {
		this.setMinimum(minimum);
		this.setMaximum(maximum);
	}

	public double midPoint() {
		return (getMaximum() + getMinimum()) / 2;
	}

	public abstract boolean includes(double value);
	
	public abstract boolean includes(Interval interval);
	
	public abstract boolean includes(IntervalBothOpened interval);
    
    public abstract boolean includes(IntervalLeftOpened interval);
    
    public abstract boolean includes(IntervalRightOpened interval);
    
    public abstract boolean includes(IntervalUnopened interval);
    
    public abstract boolean intersectsWith(IntervalBothOpened interval);
    
    public abstract boolean intersectsWith(IntervalLeftOpened interval);
    
    public abstract boolean intersectsWith(IntervalRightOpened interval);
    
    public abstract boolean intersectsWith(IntervalUnopened interval);

	public abstract boolean intersectsWith(Interval interval);
	
	
	@Override
	public boolean equals(Object object) {
		// TODO
		return false;
	}

    public double getMaximum() {
        return maximum;
    }

    private void setMaximum(double maximum) {
        this.maximum = maximum;
    }

    public double getMinimum() {
        return minimum;
    }
    

    private void setMinimum(double minimum) {
        this.minimum = minimum;
    }

    public abstract Opening getOpening();


}
