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
	
	

	public boolean includes(double value) {
		switch (getOpening()) {
		case BOTH_OPENED:
			return includesBothOpened(value);
		case LEFT_OPENED:
		    return includesLeftOpened(value);
		case RIGHT_OPENED:
		    return includesRightOpened(value);
		case UNOPENED:
		    return includesUnopened(value);
		default:
			assert false;
			return false;
		}
	}
	
	

    private boolean includesRightOpened(double value) {
        return getMinimum() <= value && value < getMaximum();
    }

    private boolean includesLeftOpened(double value) {
        return getMinimum() < value && value <= getMaximum();
    }

    public boolean includesBothOpened(double value) {
	    return getMinimum() < value && value < getMaximum();
	}
	
	public boolean includes(Interval interval) {
		boolean minimumIncluded = this.includes(interval.getMinimum());
		boolean maximumIncluded = this.includes(interval.getMaximum());
		switch (getOpening()) {
		case BOTH_OPENED:
			switch (interval.getOpening()) {
			case BOTH_OPENED:
				return (minimumIncluded || getMinimum() == interval.getMinimum())
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			case LEFT_OPENED:
				return (minimumIncluded || getMinimum() == interval.getMinimum())
						&& (maximumIncluded);
			case RIGHT_OPENED:
				return (minimumIncluded)
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			case UNOPENED:
				return (minimumIncluded) && (maximumIncluded);
			default:
				assert false;
				return false;
			}
		case LEFT_OPENED:
			switch (interval.getOpening()) {
			case BOTH_OPENED:
				return (minimumIncluded || getMinimum() == interval.getMinimum())
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			case LEFT_OPENED:
				return (minimumIncluded || getMinimum() == interval.getMinimum())
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			case RIGHT_OPENED:
				return (minimumIncluded)
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			case UNOPENED:
				return (minimumIncluded)
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			default:
				assert false;
				return false;
			}
		case RIGHT_OPENED:
			switch (interval.getOpening()) {
			case BOTH_OPENED:
				return (minimumIncluded || getMinimum() == interval.getMinimum())
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			case LEFT_OPENED:
				return (minimumIncluded || getMinimum() == interval.getMinimum())
						&& (maximumIncluded);
			case RIGHT_OPENED:
				return (minimumIncluded || getMinimum() == interval.getMinimum())
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			case UNOPENED:
				return (minimumIncluded || getMinimum() == interval.getMinimum())
						&& (maximumIncluded);
			default:
				assert false;
				return false;
			}
		case UNOPENED:
			switch (interval.getOpening()) {
			case BOTH_OPENED:
				return (minimumIncluded || getMinimum() == interval.getMinimum())
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			case LEFT_OPENED:
				return (minimumIncluded || getMinimum() == interval.getMinimum())
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			case RIGHT_OPENED:
				return (minimumIncluded || getMinimum() == interval.getMinimum())
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			case UNOPENED:
				return (minimumIncluded || getMinimum() == interval.getMinimum())
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			default:
				assert false;
				return false;
			}
		default:
			assert false;
			return false;
		}
	}

	public boolean intersectsWith(Interval interval) {
		if (getMinimum() == interval.getMaximum()) {
			switch (getOpening()) {
			case BOTH_OPENED:
			case LEFT_OPENED:
				return false;
			case RIGHT_OPENED:
			case UNOPENED:
				return interval.getOpening() == Opening.LEFT_OPENED ||
						interval.getOpening() == Opening.UNOPENED;
			default:
				assert false;
				return false;
			}
		}
		if (getMaximum() == interval.getMinimum()) {
			switch (getOpening()) {
			case BOTH_OPENED:
			case RIGHT_OPENED:
				return false;
			case LEFT_OPENED:
			case UNOPENED:
				return interval.getOpening() == Opening.RIGHT_OPENED ||
						interval.getOpening() == Opening.UNOPENED;
			default:
				assert false;
				return false;
			}
		}
		return this.includes(interval.getMinimum())
				|| this.includes(interval.getMaximum());
	}

	@Override
	public String toString() {
		// TODO
		return null;
	}

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

    abstract Opening getOpening();


}
