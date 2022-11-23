import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        isLeapYar(2022);
        calculateVersionOS(1,2014);
        calculationDelivery(60);
    }
    public static void isLeapYar(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Является високосным годом");
        } else {
            System.out.println(year + " Не я вляется високосным годом");
        }
    }

    public static void calculateVersionOS(int typeOc, int yearDevice) {
        int currentYear = LocalDate.now().getYear();
        if (currentYear > yearDevice && typeOc == 1) {
            System.out.println("Установите lite-версию для Android");
        }
        if (currentYear > yearDevice && typeOc == 0) {
            System.out.println("Установите lite-версию для ios");
        }
    }

    public static void calculationDelivery(int deliveryDistance) {
        int deliveryTime;
        deliveryTime = deliveryDistance / 40;
        deliveryTime++;
        System.out.println("Потребуется дней: " + deliveryTime);
    }
}
