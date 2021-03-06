package hr.fer.zemris.java.hw07.observer2;

/**
 * Interface IntegerStorageObserver represents IntegerStorageObserver.
 * Used as abstract observer.
 * 
 * @author Filip
 */
public interface IntegerStorageObserver {

	/**
	 * This method notifies observers for changes.
	 * 
	 * @param istorage
	 */
	public void valueChanged(IntegerStorageChange istorage);
	
}
