/**
 * 
 */
package ds2.taskerville.api;

/**
 * A list of entry states.
 * 
 * @author kaeto23
 * @version 1.0
 */
public enum EntryStates {
	/**
	 * The entry is deleted, and should be considered not available for any
	 * search.
	 */
	Deleted(5),
	/**
	 * The entry is locked. It can be found, but not changed, or edited some
	 * way.
	 */
	Locked(2),
	/**
	 * The entry is valid
	 */
	Valid(1);
	/**
	 * the state id.
	 */
	private int stateId;

	/**
	 * Creates a constant.
	 * 
	 * @param sId
	 *            the state id as a number
	 */
	private EntryStates(final int sId) {
		stateId = sId;
	}

	/**
	 * Returns the state id.
	 * 
	 * @return the state id
	 */
	public int getStateId() {
		return stateId;
	}
}
