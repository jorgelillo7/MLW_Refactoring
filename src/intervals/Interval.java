package intervals;

public class Interval {

    
	private double minimum;
	private double maximum;
	private Opening opening;

	public Interval(double minimum, double maximum, Opening opening) {
		this.minimum = minimum;
		this.setMaximum(maximum);
		this.opening = opening;
	}

	public double midPoint() {
		return (getMaximum() + minimum) / 2;
	}

	public boolean includes(double value) {
		switch (opening) {
		case BOTH_OPENED:
			return minimum < value && value < getMaximum();
		case LEFT_OPENED:
			return minimum < value && value <= getMaximum();
		case RIGHT_OPENED:
			return minimum <= value && value < getMaximum();
		case UNOPENED:
			return minimum <= value && value <= getMaximum();
		default:
			assert false;
			return false;
		}
	}
	

	public boolean includes(Interval interval) {
		boolean minimumIncluded = this.includes(interval.minimum);
		boolean maximumIncluded = this.includes(interval.getMaximum());
		switch (opening) {
		case BOTH_OPENED:
			switch (interval.opening) {
			case BOTH_OPENED:
				return (minimumIncluded || minimum == interval.minimum)
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			case LEFT_OPENED:
				return (minimumIncluded || minimum == interval.minimum)
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
			switch (interval.opening) {
			case BOTH_OPENED:
				return (minimumIncluded || minimum == interval.minimum)
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			case LEFT_OPENED:
				return (minimumIncluded || minimum == interval.minimum)
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
			switch (interval.opening) {
			case BOTH_OPENED:
				return (minimumIncluded || minimum == interval.minimum)
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			case LEFT_OPENED:
				return (minimumIncluded || minimum == interval.minimum)
						&& (maximumIncluded);
			case RIGHT_OPENED:
				return (minimumIncluded || minimum == interval.minimum)
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			case UNOPENED:
				return (minimumIncluded || minimum == interval.minimum)
						&& (maximumIncluded);
			default:
				assert false;
				return false;
			}
		case UNOPENED:
			switch (interval.opening) {
			case BOTH_OPENED:
				return (minimumIncluded || minimum == interval.minimum)
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			case LEFT_OPENED:
				return (minimumIncluded || minimum == interval.minimum)
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			case RIGHT_OPENED:
				return (minimumIncluded || minimum == interval.minimum)
						&& (maximumIncluded || getMaximum() == interval.getMaximum());
			case UNOPENED:
				return (minimumIncluded || minimum == interval.minimum)
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
		if (minimum == interval.getMaximum()) {
			switch (opening) {
			case BOTH_OPENED:
			case LEFT_OPENED:
				return false;
			case RIGHT_OPENED:
			case UNOPENED:
				return interval.opening == Opening.LEFT_OPENED ||
						interval.opening == Opening.UNOPENED;
			default:
				assert false;
				return false;
			}
		}
		if (getMaximum() == interval.minimum) {
			switch (opening) {
			case BOTH_OPENED:
			case RIGHT_OPENED:
				return false;
			case LEFT_OPENED:
			case UNOPENED:
				return interval.opening == Opening.RIGHT_OPENED ||
						interval.opening == Opening.UNOPENED;
			default:
				assert false;
				return false;
			}
		}
		return this.includes(interval.minimum)
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

    private double getMaximum() {
        return maximum;
    }

    private void setMaximum(double maximum) {
        this.maximum = maximum;
    }

}
