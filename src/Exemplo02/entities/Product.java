package Exemplo02.entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		return "Product: " + name + ", $" + price + ", " + quantity + " units, Total: $ " +totalValueInStock();
	}
	
	
}
