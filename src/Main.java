import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String yearType(int year) {
        String answer;
        if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            answer = " год - високосный год";
        } else {
            answer = " год - невисокосный год";
        }
        return answer;
    }

    public static String preferOs(byte clientOS, short clientDeviceYear) {
        String prefer;
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear && clientOS == 0) {
            prefer = "Установите облегченную версию приложения для iOS по ссылке";
        } else if (clientDeviceYear < currentYear && clientOS == 1) {
            prefer = "Установите облегченную версию приложения для Android по ссылке";
        } else if (clientDeviceYear >= currentYear && clientOS == 0) {
            prefer = "Установите версию приложения для iOS по ссылке";
        } else if (clientDeviceYear >= currentYear && clientOS == 1) {
            prefer = "Установите версию приложения для Android по ссылке";
        } else {
            prefer = "неверно указана OS";
        }
        return prefer;
    }

    public static String delivery(int deliveryDistance) {
        String message;
        if (deliveryDistance <= 100) {
            byte days = 3;
            if (deliveryDistance < 60) {
                days--;
                if (deliveryDistance < 20) {
                    days--;
                }
            }
            message = "Потребуется дней: " + days;
        } else {
            message = "доставки нет";
        }
        return message;
    }

    public static void main(String[] args) {

//задача 1
        System.out.println("задача 1");

        int year = 2021;
        System.out.println(year + yearType(year));

//задача 2
        System.out.println("задача 2");

        byte clientOS = 1;
        short clientDeviceYear = 2015;
        System.out.println(preferOs(clientOS, clientDeviceYear));

//задача 3
        System.out.println("задача 3");

        int deliveryDistance = 95;
        System.out.println(delivery(deliveryDistance));

    }
}