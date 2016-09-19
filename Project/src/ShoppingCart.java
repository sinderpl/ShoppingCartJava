import java.util.ArrayList;
/**
 * A class that simulates a shopping cart
 * @author A00209408
 */
public class ShoppingCart 
{
	private String customerName;
	private ArrayList<Double> prices;
	/**
	 * @param priceList Array that stores prices
	 * @param customerName String that saves the customers name
	 * This is the constructor
	 */
	public ShoppingCart(String name)
	{
		customerName = name;	
		prices = new ArrayList<Double>();
	}
	/**
	 * This adds the price to the array
	 * @price price of the product
	 */
	public void addPrice(double price)
	{
		prices.add(price);
	}
	/**
	 *Returns the number of items in the array
	 */
	public int numberItems()
	{
		return prices.size();
	}
	/**
	 * This calculates and returns total price of the items
	 * @return total price of items
	 */
	public double totalPrice()
	{
		double totalPrice = 0.0;
		for (int x = prices.size()-1; x>=0; x--)
		{
			totalPrice += prices.get(x);
		}
		return totalPrice;
	}
	/**
	 *Prints all the items in the list
	 */
	public void printItems()
	{
		System.out.println("\nList of all the items in the cart:");
		System.out.println("=============");
		for (double price :prices)
		{
			System.out.println("\nItem price:"+price);
		}
		System.out.println("=============");
	}
	/**
	 *resets the array
	 */
	public void resetArray()
	{
		prices = new ArrayList<Double>();
	}
	public static void main(String[] args) 
	{
		ShoppingCart myCart = new ShoppingCart("Joe Bloggs");
		myCart.addPrice(39.99);
		myCart.addPrice(5.50);
		myCart.addPrice(5.20);
		System.out.println("The number of items is: " + myCart.numberItems());
		System.out.println("The total price is: " + myCart.totalPrice());
		myCart.printItems();
		myCart.resetArray();
		
	}

}
