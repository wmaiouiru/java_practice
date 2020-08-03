package main.java;

public class EnumSandbox {
    public static void main(String[] args) {
        ChargeLevel level = ChargeLevel.FULL;
        ChargeLevel level3 = ChargeLevel.findBySection(3);
        switch (level3) {
            case FULL:
                System.out.println("It is full!: " + ChargeLevel.FULL.sections);
                break;
            case HIGH:
                System.out.println("High: " + ChargeLevel.HIGH.sections);
                break;
            case MEDIUM:
                System.out.println("Medium: " + ChargeLevel.MEDIUM.sections);
                break;
            case LOW:
                System.out.println("Low: " + ChargeLevel.LOW.sections);
                break;
            default:
                System.out.println("Unsupported enum constant.");
        }
    }
}
