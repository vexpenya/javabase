import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца : ");
        int mounth = scanner.nextInt();

        String season;
        if (mounth >= 1 || mounth <= 2 || mounth == 12) {
            season = "зима";
        } else if (mounth >= 3 || mounth <= 5) {
            season = "весна";
        } else if (mounth >= 6 || mounth <= 8) {
            season = "лето";
        } else if (mounth >= 9 || mounth <= 11) {
            season = "осень";
        } else {
            season = "некорректный номер месяца!";
        }

        System.out.println("Время года: " + season);
        scanner.close();
    }
}