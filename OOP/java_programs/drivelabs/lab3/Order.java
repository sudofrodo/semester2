public class Order{
  private int orderId;
  private String productName;
  private int quantity;
  private double pricePerUnit;
  private static int totalOrders;
  private static double totalRevenue;
  
  public Order() {
  totalOrders++;
  totalRevenue += quantity * pricePerUnit;
  };
  public Order(int id, String name, int qty, double unitPrice){
  orderId = id;
  productName = name;
  quantity = qty;
  pricePerUnit = unitPrice;
  totalOrders++;
  totalRevenue += quantity * pricePerUnit;
  }
  public static void getTotalOrders(){
    System.out.println("Total Orders: " + totalOrders);
  }
  public void displayOrderDetails(){
    String orderDetails = "Order Id: " + orderId + ", Product: "+ productName + ", Quantity: " + quantity + ", Total Price: "+ quantity * pricePerUnit + " PKR";
    if (quantity >= 50) {
    double totalPrice = quantity * pricePerUnit;
    double discount = totalPrice * 0.10;
    double discountedPrice = totalPrice - discount;
    orderDetails += " Total Price after Discount: " + discountedPrice;
    }
    System.out.println(orderDetails);
  }
  public static void main(String args[]) {
    Order o1 = new Order(111 , "cup", 20 , 140);
    o1.displayOrderDetails();
    Order o2 = new Order(321 , "honey" , 55 , 245);
    o2.displayOrderDetails();
    Order o3 = new Order(456 , "jam" , 40, 350);
    o3.displayOrderDetails();
    System.out.println("Total Orders: " + Order.totalOrders);
    System.out.println("Total Revenue: " + Order.totalRevenue);
  }
}

