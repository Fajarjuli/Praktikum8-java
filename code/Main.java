public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("0.8", "Sepatu", 500000.0f, 0.05f);
        Item item2 = new Item("0.4", "Tas", 250000.0f, 0.05f);
        OrderDetail detail1 = new OrderDetail(1, "Taxable", item1);
        OrderDetail detail2 = new OrderDetail(2, "Taxable", item2);

        Customer customer = new Customer("Oliver", "123 Main St");

        Order order = new Order("28-11-2024", "Processing", customer, new OrderDetail[]{detail1, detail2});

        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Order Date: " + order.getDate());
        System.out.println("Order Status: " + order.getStatus());

        for (OrderDetail detail : order.getOrderDetails()) {
            Item item = detail.getItem();
            System.out.println("Item: " + item.getDescription());
            System.out.println("Quantity: " + detail.getQuantity());
            System.out.println("Price per item: " + String.format("%.0f", item.getPriceForQuantity(1)));
            System.out.println("SubTotal: " + String.format("%.0f", detail.calcSubTotal())); 
        }

        System.out.println("Order SubTotal: " + String.format("%.0f", order.calcSubTotal())); 
        System.out.println("Order Tax: " + String.format("%.0f", order.calcTax()));
        System.out.println("Order Total: " + String.format("%.0f", order.calcTotal())); 
        System.out.println("Total Weight: " + String.format("%.2f", order.calcTotalWeight()) + " lbs"); 
    }
}
