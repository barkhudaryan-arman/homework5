public class Main {
    public static void main(String[] args) {
        // Задача 1,2
        int clientOS = 0;
        int clientDeviceYear = 2016;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }else{
            System.out.println("Для вашего типа операционной системы у нас нет приложения, возпользуетесь браузерной версией ");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        // Задача 3
        int year = 1585;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            if (1584 < year) {
                System.out.println("Год " + year + " високосный");
            }
        }else{
            System.out.println("Год " + year + " не является високосным");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        // Задача 4
        int deliveryDistance = 21;
        int deliveryDays = 1;
        if (deliveryDistance < 20){
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays++;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDays++;
        }else {
            System.out.println("Доставки нет");
        }
        System.out.println("Потребуется дней: "  + deliveryDays);
        System.out.println();
        System.out.println();
        System.out.println();

        // Задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("В году 12 месяцев!!!");
        }
    }
}