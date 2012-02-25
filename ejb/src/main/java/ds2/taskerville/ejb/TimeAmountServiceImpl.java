/*
 * TaskerVille - issue and project management
 * Copyright (C) 2012  Dirk Strauss
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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
