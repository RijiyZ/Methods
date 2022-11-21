import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        calculationYear();
        calculationYearOc();
        calculationDelivery();
    }

    public static void calculationYear() {
        int year = 1488;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Является високосным годом");
        } else {
            System.out.println(year + " Не я вляется високосным годом");
        }
    }

    public static void calculationYearOc() {
        int currentYear = LocalDate.now().getYear();
        int typeOc = 1;
        int yearDevice = 2012;
        if (currentYear > yearDevice && typeOc == 1) {
            System.out.println("Установите lite-версию для Android");
        }
        if (currentYear > yearDevice && typeOc == 0) {
            System.out.println("Установите lite-версию для ios");
        }

    }

    public static void calculationDelivery() {
        int deliveryTime;
        int deliveryDistance = 60;
        deliveryTime = deliveryDistance / 40;
        deliveryTime++;
        System.out.println("Потребуется дней: " + deliveryTime);
    }
}
