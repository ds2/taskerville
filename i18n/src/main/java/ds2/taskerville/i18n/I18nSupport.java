package ds2.taskerville.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * The i18n support.
 * 
 * @author kaeto23
 * @version 1.0
 */
public class I18nSupport {
	/**
	 * The resource bundle.
	 */
	private ResourceBundle rb = null;

	/**
	 * Instantiates the i18n support using the default locale.
	 */
	public I18nSupport() {
		this(Locale.getDefault());
	}

	/**
	 * Instantiates the i18n support using the given locale.
	 * 
	 * @param l
	 *            the locale to use.
	 */
	public I18nSupport(Locale l) {
		rb = ResourceBundle.getBundle("/ds2/taskerville/i18n/taskerville", l);
	}

	/**
	 * Returns the message with the given key.
	 * 
	 * @param key
	 *            the i18n key
	 * @param args
	 *            some arguments which replace any placeholders in the i18n
	 *            value
	 * @return an empty string in case of an error (usually the key name), or
	 *         the i18n value.
	 */
	public String getMessage(String key, Object... args) {
		String rc = rb.getString(key);
		if (args != null && args.length > 0) {
			rc = MessageFormat.format(rc, args);
		}
		return rc;
	}
}
