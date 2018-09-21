import java.util.ArrayList;

public class AddressBook {
	
	private ArrayList<BuddyInfo> buddies;
	
	
	public void addBuddy(BuddyInfo buddy) {
		
		if(buddy != null) {
			buddies.add(buddy);
		}
		
	}
	
	public void removeBuddy(int index) {
		if(index >= 0 && index < buddies.size()) {
			buddies.remove(index);
		}
	}
	
	public static void main(String[] args) {
        System.out.println("Address Book");

        BuddyInfo bud = new BuddyInfo("Tom", "111", "Carleton");

        AddressBook book = new AddressBook();
        book.addBuddy(bud);
        book.removeBuddy(0);
	}
}