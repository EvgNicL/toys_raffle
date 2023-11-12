
package toys_raffle;


import java.util.Scanner;

public class View {
    Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public int startRqw() {
        System.out.println("\n1 - продолжить работу\n2 - выход \n");
        return scanner.nextInt();
    }
    public int menuRqw(){
        try {
            System.out.println("""

                1 - добавить новую игрушку\s
                2 - просмотреть список игрушек в магазине\s
                3 - изменить частоту выпадения игрушки\s
                4 - розыгрыш""");
            return scanner.nextInt();
        } catch (RuntimeException e){
            System.out.println("\nне корректный ввод\n");
        }
        return 0;
    }


    public int idRqw() {
        try {
            System.out.println("Введите id: ");
            return scanner.nextInt();
        } catch (RuntimeException e){
            System.out.println("\nне корректный ввод\n");
        }
        return 0;
    }

    public Double  weightRqw() {
        try {
            System.out.println("Введите вес(частоту выпадения) ЧЕРЕЗ ЗАПЯТУЮ: ");
            return scanner.nextDouble();
        } catch (RuntimeException e) {

            System.out.println("\nЧЕРЕЗ ЗАПЯТУЮ!!!!");
        }
        return null;
    }
}