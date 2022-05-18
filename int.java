import java.util.*;
class Item{
	int itemId;
	String itemName;
	Item(int itemId, String itemName){
		this.itemName = itemName;
		this.itemId = itemId;
		
	}
	Item(){}
		void setitemId(int itemId){
			this.itemId = itemId;
		}
		void setitemName(String itemName){
			this.itemName = itemName;
		}
		public String toString(){
			return this.itemId+" "+this.itemName;
		}
}
class namesort implements Comparator<Item>{
	public int compare(Item I1, Item I2){
		return I1.itemName.compareTo(I2.itemName);
	}
}
class idsort implements Comparator<Item>{
	public int compare(Item I1, Item I2){
		return I1.itemId-(I2.itemId);
	}
}

class Inventory{
	static Item I = new Item();
	static ArrayList<Item> list = new ArrayList<> ();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice;
		Item I1 = new Item(1,"A");
		Item I2 = new Item(23,"F");
		Item I3 = new Item(10,"B");
		Item I4 = new Item(6,"Q");
		Item I5 = new Item(14,"L");
		list.add(I1);
		list.add(I2);
		list.add(I3);
		list.add(I4);
		list.add(I5);
		do{
			System.out.println("Enter choice:");
			System.out.println("sorting");
			
			choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Details");
					System.out.println("Item");
					
					for(int i=1;i<=1;i++){
						System.out.println("id");
						int d=sc.nextInt();
						I.setitemId(d);
						System.out.println("name");
						sc.nextLine();
						String s = sc.nextLine();
						I.setitemName(s);
						list.add(I);
						
					}
					System.out.println("added items");
					System.out.println(list);
						break;
				case 2:
					System.out.println("before sort");
					System.out.println(list);
					System.out.println("id sort");
					idsort n2 = new idsort();
					Collections.sort(list,n2);
					System.out.println(list);
					System.out.println("name sort");
					namesort n1 = new namesort();
					Collections.sort(list,n1);
					System.out.println(list);
					break;
				case 3:
					System.out.println("list");
					System.out.println(list);
					System.out.println("index item");
					int re =sc.nextInt();
					list.remove(re);
					System.out.println("remove list");
					System.out.println(list);
					break;
				case 4:
					System.out.println("done");
					break;
			}
		}while(choice!=4);
	}
}