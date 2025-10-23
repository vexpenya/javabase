import java.util.Scanner;

public class num5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[][] questions = {
                 {"Какой газ преобладает в атмосфере Земли?", "1. Кислород", "2. Азот", "3. Углекислый газ", "2"},
            {"Сколько континентов на Земле?", "1. 5", "2. 6", "3. 7", "2"},
            {"Какая самая большая пустыня в мире?", "1. Сахара", "2. Гоби", "3. Антарктическая", "3"},
            {"Какой элемент обозначается символом 'O'?", "1. Золото", "2. Кислород", "3. Олово", "2"},
            {"В каком году человек полетел в космос?", "1. 1957", "2. 1961", "3. 1969", "2"},
            {"Какое самое твердое природное вещество?", "1. Алмаз", "2. Сталь", "3. Кварц", "1"},
            {"Сколько костей в теле взрослого человека?", "1. 196", "2. 206", "3. 216", "2"},
            {"Какая планета известна как 'Красная планета'?", "1. Венера", "2. Марс", "3. Юпитер", "2"},
            {"Кто открыл закон всемирного тяготения?", "1. Эйнштейн", "2. Ньютон", "3. Галилей", "2"},
            {"Какой океан самый большой по площади?", "1. Атлантический", "2. Индийский", "3. Тихий", "3"}
        };

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nВопрос " + (i + 1) + ": " + questions[i][0]);
            System.out.println(questions[i][1]);
            System.out.println(questions[i][2]);
            System.out.println(questions[i][3]);

            System.out.print("Ваш ответ (1-3): ");
            String answer = scanner.nextLine();

            if (answer.equals(questions[i][4])) {
                System.out.println("Правильно!");
                score++;
            } else {
                System.out.println("Неправильно! Правильный ответ: " + questions[i][4]);
            }
        }

        System.out.println("\n=== РЕЗУЛЬТАТ ===");
        System.out.println("Правильных ответов: " + score + " из " + questions.length);

        scanner.close();
    }
}