public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(1, "Иван", "Иванов", 1990);
        Client client2 = new Client(2, "Анна", "Петрова", 1985);

        DefoltTicket regular = new DefoltTicket(client1);
        VIPTicket vip = new VIPTicket(client2);

        FitnessClub club = new FitnessClub();

        System.out.println("=== Проверка доступа ===");

        club.registerInZone(regular, "gym");

        club.registerInZone(regular, "pool");

        club.registerInZone(vip, "pool");

        club.registerInZone(vip, "group");

    }
}