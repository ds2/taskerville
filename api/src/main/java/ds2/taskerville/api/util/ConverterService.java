/**
 * 
 */
package ds2.taskerville.api.util;

/**
 * A converter for converting several formats.
 * 
 * @author kaeto23
 * @version 1.0
 */
public interface ConverterService {
	/**
	 * Converts a string into a int value.
	 * 
	 * @param s
	 *            the string version of an int number
	 * @param defValue
	 *            a default value in case of an error
	 * @return the default value, or the converted value
	 */
	int toInt(String s, int defValue);

}
