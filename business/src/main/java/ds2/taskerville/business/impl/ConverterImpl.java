package ds2.taskerville.business.impl;

import java.util.logging.Logger;

import ds2.taskerville.api.util.ConverterService;

/**
 * The basic implementation of a converter.
 * 
 * @author kaeto23
 * @version 1.0
 */
public class ConverterImpl implements ConverterService {
	/**
	 * A logger.
	 */
	private static final Logger log = Logger.getLogger(ConverterImpl.class
			.getName());

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int toInt(String s, int defValue) {
		if (s == null || s.length() <= 0) {
			return defValue;
		}
		int rc = defValue;
		try {
			rc = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			log.info("Error when parsing \"" + s + "\": "
					+ e.getLocalizedMessage());
		}
		return rc;
	}

}
