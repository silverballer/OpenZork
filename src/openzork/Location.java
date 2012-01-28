package openzork;

abstract class Location {

	public String getName() {
		return Name;
	}

	public String getDescription() {
		return Description;
	}

	public String getNameAndDesc() {
		return (Name + "\n\n" + Description + "\n");
	}

	public String getItems() {
		return ItemsInArea;
	}/*
	 * public Location(String name, String description, boolean north, boolean
	 * south, boolean east, boolean west) { this.north = north; this.south =
	 * south; this.west = west; this.east = east; Name = name; Description =
	 * description; }
	 */

	public Location() {
	}

	protected String Description;
	protected String Name;
	protected String ItemsInArea;
	Location north, south, east, west = (Location) null;
}
