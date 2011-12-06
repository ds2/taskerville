/**
 * 
 */
package ds2.taskerville.ejb;

import javax.ejb.Stateless;

import ds2.taskerville.api.TimeAmount;
import ds2.taskerville.api.svc.TimeAmountService;

/**
 * @author kaeto23
 * 
 */
@Stateless(name = "TimeAmountService")
public class TimeAmountServiceImpl implements TimeAmountService {
	/**
	 * The time amount service impl.
	 */
	private TimeAmountService svc = null;

	/**
	 * 
	 */
	public TimeAmountServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TimeAmount createTimeAmount(int minutes, Integer hours,
			Integer days, Integer weeks) {
		return svc.createTimeAmount(minutes, hours, days, weeks);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TimeAmount parseTimeAmount(String s) {
		return svc.parseTimeAmount(s);
	}

}
