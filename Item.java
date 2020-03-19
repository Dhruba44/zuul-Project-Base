
/**
 * This class is part of the "World of Zuul" application.   
 * Item class represents item and some related information of item such as description,
 * types and points.
 * 
 * @author Gobra team
 * @version March 17, 2020 
 */

public class Item {
	
	private String description;
	private int point;	
	private ItemType itemType;	
	
	  // constructor
	public Item(String description,int point) 
	{		
		this.description = 	description;
		this.point = point;
	}
	
	 // item item types with item
	public void setItemType (ItemType itype) {
		this.itemType = itype;
	}
		
	  // get item description
        public String getDescription() {
		return this.description;
	 }


	//	get points of items
	public int getPoint() {
		return this.point;
	}

	// get points to items
	public void setPoint(int point) { 
		this.point = point;
	}
	
	// get the itemType 
	public ItemType getItemType() {
		return this.itemType;
	}

}

