import java.util.HashMap;

class Item {
	public String itemId;
	public String name;
	public String description;
	public double price;
	
	public Item(String id, String name, double price, String description)
	{
		this.itemId = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
//	public String getItemId() {
//		return itemId;
//	}
//	public void setItemId(String itemId) {
//		this.itemId = itemId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
}


public class Shopping {
	HashMap<Item, Integer> map = new HashMap<Item, Integer>();
	public void addToCart(Item item,Integer quantity)
	{
		map.put(item, 2);
	}
	
	public Integer showQuantity(Item item)
	{
		return map.get(item);
	}
	
	public void updateQuantity(Item item,Integer quantity)
	{
		map.put(item, quantity);
	}
	
	public void deleteItem(Item item)
	{
		map.remove(item);
	}
	
	public double displayBill()
	{
		double ammount = 0;
		for(var key : map.keySet())
		{
			ammount += key.price * map.get(key);
//			System.out.println("Key: " + map.get(key));
		}
		return ammount;
	}
	
	public static void main(String args[])
	{
		Item item1 = new Item("1", "Pencil", 10, "For writing purpose");
		Item item2 = new Item("2", "Pen", 40, "For writing purpose");
		Item item3 = new Item("3", "Apples", 100, "For eating purpose");
		Item item4 = new Item("4", "T-Shirt", 500, "Clothes");
		Item item5 = new Item("5", "Formal Shoes Black", 1400, "Shoes");
		Item item6 = new Item("6", "Jeans", 1000, "Clothes");
		
		Shopping shop = new Shopping();
		shop.addToCart(item1, 2);
		shop.addToCart(item2, 2);
		shop.updateQuantity(item2, 10);
		System.out.println("Item quantity is: " + shop.showQuantity(item1));
		shop.addToCart(item3, 2);
		shop.addToCart(item4, 2);
		shop.deleteItem(item3);
		shop.addToCart(item5, 2);
		shop.updateQuantity(item4, 3);
		shop.addToCart(item6, 2);
		System.out.println("Total Bill Ammount: " + shop.displayBill());
	}
	
}
