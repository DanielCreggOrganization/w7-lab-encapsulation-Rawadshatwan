package ie.atu.testpackage;

public class Main {
public static void main(String[] args) {
    SecretMessage smobject1 = new SecretMessage("Potato");
    smobject1.displayMessage();

    Temperature smoTemperature = new Temperature();
    smoTemperature.setCelsius(25);
    System.out.println(smoTemperature.getCelsius());
}
}
