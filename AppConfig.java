public class AppConfig {

    private static AppConfig instance;

    private String universityName;
    private double deliveryFee;

    private AppConfig() {
        universityName = "Istanbul Aydin University";
        deliveryFee = 25.0;
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getUniversityName() {
        return universityName;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }
}