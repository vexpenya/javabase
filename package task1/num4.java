public class num4 {
    public static void main(String[] args) {

        double initialVelocity = 20.0;
        double time = 2.0;
        final double GRAVITY = 9.81; 


        double height = initialVelocity * time - (GRAVITY * time * time) / 2;

        System.out.printf("Начальная скорость: %.1f м/с\n", initialVelocity);
        System.out.printf("Время: %.1f с\n", time);
        System.out.printf("Ускорение свободного падения: %.2f м/с²\n", GRAVITY);
        System.out.printf("Высота тела через %.1f секунд: %.2f метров\n", time, height);
    }
}
