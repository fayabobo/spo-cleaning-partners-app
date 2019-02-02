package spo.cleaning.partners.app.core;

/**
 * Class which represents a cleaner
 * 
 * @author nsanzfia
 *
 */
public abstract class Cleaner {
	protected int workCapacity;

	public int getWorkCapacity() {
		return workCapacity;
	}

	public void setWorkCapacity(int workCapacity) {
		this.workCapacity = workCapacity;
	}

}
