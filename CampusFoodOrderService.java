public class CampusFoodOrderService {

    public void placeOrder(String studentName, String foodName, String notificationType) {

        AppConfig config = AppConfig.getInstance();

        System.out.println("Order created for: " + studentName);
        System.out.println("Food: " + foodName);
        System.out.println("Delivery fee: " + config.getDeliveryFee() + " TL");

        Notification notification = NotificationFactory.createNotification(notificationType);

        if (notification != null) {
            notification.send(studentName, foodName);
        } else {
            System.out.println("Unknown notification type.");
        }
    }

    public static void main(String[] args) {

        CampusFoodOrderService service = new CampusFoodOrderService();

        service.placeOrder("Ali", "Chicken Sandwich", "EMAIL");
        service.placeOrder("Zeynep", "Vegetarian Pizza", "SMS");
        service.placeOrder("Omar", "Coffee", "PUSH");

    }
}// this is the main program now, and it uses all the previously created files to run the program. self note

