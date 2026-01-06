public class Product{
	private String productName;
	private double price;
	private static double discount;
	
	Product(){};
	Product(String name , double value) {
		productName = name;
		price = value;
	}
	public static void setDiscount(double sDiscount){
		discount = sDiscount;
	}
	public double calculateDiscountedPrice() {
		double discountAmount = price * (discount / 100);
		double discountedPrice = price - discountAmount;
		return discountedPrice;
	}
	public void compareDiscounts(Product compare) {
		Product higherDiscountProduct =  this.calculateDiscountedPrice() > compare.calculateDiscountedPrice() ? this : compare;
		System.out.println("Product " + higherDiscountProduct.productName + " has higher discounted price.");
	}
	public void displayInfo() {
		System.out.println("Product: " + productName + ", Original Price: " + price + ", Discounted Price: " + calculateDiscountedPrice());
	}
	public static void main(String args[]) {
		Product waterPipe = new Product("Water Pipe" , 2300);
		Product ceilingFan = new Product("Ceiling Fan" , 6700);
		Product.setDiscount(5);
		waterPipe.displayInfo();
		ceilingFan.displayInfo();
		System.out.println("Comparing two products and displaying the one with higher price ");
		ceilingFan.compareDiscounts(waterPipe);
		
		
		
	}
}