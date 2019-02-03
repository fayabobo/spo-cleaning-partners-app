package spo.cleaning.partners.app.core;

import java.util.List;

import javax.validation.constraints.Size;

import spo.cleaning.partners.app.constants.Constants;

/**
 * Class which represents a structure
 * 
 * @author nsanzfia
 *
 */
public class Structure {

	@Size(max = Constants.MAX_ROOMS_IN_A_STRUCTURE)
	List<Room> rooms;

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
}
