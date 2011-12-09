/**
 * 
 */
package ds2.taskerville.api.remote;

import ds2.taskerville.api.TimeAmount;

/**
 * A basic implementation of the TimeAmount.
 * 
 * @author kaeto23
 * 
 */
public class TimeAmountDto implements TimeAmount {

	/**
	 * the svuid.
	 */
	private static final long serialVersionUID = -4215857869210911223L;
	/**
	 * The days.
	 */
	private int days;
	/**
	 * The hours.
	 */
	private int hours;
	/**
	 * The minutes.
	 */
	private int minutes;
	/**
	 * The weeks.
	 */
	private int weeks;

	/**
	 * Constructs an empty time amount.
	 */
	public TimeAmountDto() {
		// nothing to do
	}

	/**
	 * Constructs a time amount with the given parameters.
	 * 
	 * @param min
	 *            the minutes
	 * @param h
	 *            the hours
	 * @param d
	 *            the days
	 * @param w
	 *            the weeks
	 */
	public TimeAmountDto(int min, int h, int d, int w) {
		this();
		setMinutes(min);
		setHours(h);
		setDays(d);
		setWeeks(w);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ds2.taskerville.api.TimeAmount#getDays()
	 */
	@Override
	public int getDays() {
		return days;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ds2.taskerville.api.TimeAmount#getHours()
	 */
	@Override
	public int getHours() {
		return hours;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ds2.taskerville.api.TimeAmount#getMinutes()
	 */
	@Override
	public int getMinutes() {
		return minutes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ds2.taskerville.api.TimeAmount#getParsedString()
	 */
	@Override
	public String getParsedString() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ds2.taskerville.api.TimeAmount#getWeeks()
	 */
	@Override
	public int getWeeks() {
		return weeks;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(TimeAmount o) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @param days
	 *            the days to set
	 */
	public synchronized void setDays(int days) {
		this.days = days;
	}

	/**
	 * @param hours
	 *            the hours to set
	 */
	public synchronized void setHours(int hours) {
		if (hours < 0) {
			return;
		}
		this.hours = hours;
	}

	/**
	 * @param minutes
	 *            the minutes to set
	 */
	public synchronized void setMinutes(int minutes) {
		if (minutes < 0 || minutes >= 60) {
			return;
		}
		this.minutes = minutes;
	}

	/**
	 * @param weeks
	 *            the weeks to set
	 */
	public synchronized void setWeeks(int weeks) {
		if (weeks < 0) {
			return;
		}
		this.weeks = weeks;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + days;
		result = prime * result + hours;
		result = prime * result + minutes;
		result = prime * result + weeks;
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof TimeAmountDto))
			return false;
		TimeAmountDto other = (TimeAmountDto) obj;
		if (days != other.days)
			return false;
		if (hours != other.hours)
			return false;
		if (minutes != other.minutes)
			return false;
		if (weeks != other.weeks)
			return false;
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		StringBuffer builder = new StringBuffer();
		builder.append("TimeAmountDto [days=");
		builder.append(days);
		builder.append(", hours=");
		builder.append(hours);
		builder.append(", minutes=");
		builder.append(minutes);
		builder.append(", weeks=");
		builder.append(weeks);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public float getPercentComparedTo(TimeAmount t) {
		// TODO Auto-generated method stub
		return 0;
	}

}