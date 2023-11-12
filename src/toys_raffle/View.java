
package toys_raffle;


import java.util.Scanner;

public class View {
    Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public int menuRqw() {
        System.out.println("\n1 - добавить новую игрушку \n2 - просмотреть список игрушек в магазине \n3 - " +
                "изменить частоту выпадения игрушки \n4 - розыгрыш \n");
        return scanner.nextInt();
    }

    public int startRqw() {
        System.out.println("\nПродолжить работу (1) или завершить и сохранить изменения (2): ");
        return scanner.nextInt();
    }

    public int idRqw() {
        System.out.println("Введите id: ");
        return scanner.nextInt();
    }

    public Double  weightRqw() {
        try {
            System.out.println("Введите вес(частоту выпадения, формат: от 0.0 до 1.0) : ");
            return scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("обломинго");

        }
        return scanner.nextDouble();
    }
//    public String nameRqw() {
//        System.out.println("name: ");
//        return scanner.next();
//    }
//    public int countRqw() {
//        System.out.println("count: ");
//        return scanner.nextInt();
//    }
}