public class FitnessClub {
    private static final int CLUB_OPEN = 6;
    private static final int CLUB_CLOSE = 24;

    private final Ticket[] gym = new Ticket[100];
    private final Ticket[] pool = new Ticket[100];
    private final Ticket[] group = new Ticket[100];
    private final Ticket[] spa = new Ticket[100];

    private int gymTicket = 0;
    private int poolTicket = 0;
    private int groupTicket = 0;
    private int spaTicket = 0;

    public boolean registerInZone(Ticket ticket, String zone) {
        if (ticket == null || zone == null) {
            return false;
        }

        int accessFrom;
        int accessTo;
        boolean Access;

        if (ticket instanceof DefoltTicket)
        {
            DefoltTicket rm = (DefoltTicket) ticket;
            accessFrom = rm.getAccessFrom();
            accessTo = rm.getAccessTo();
            Access = rm.hasAccessTo(zone);
        } else if (ticket instanceof VIPTicket)
        {
            VIPTicket vm = (VIPTicket) ticket;
            accessFrom = vm.getAccessFrom();
            accessTo = vm.getAccessTo();
            Access = vm.hasAccessTo(zone);
        } else
        {
            return false;
        }

        if (!Access) {
            System.out.println("Абонемент не дает доступ в " + zone);
            return false;
        }

        Ticket[] targetArray;
        int count;

        switch (zone) {
            case "gym":
                targetArray = gym;
                count = gymTicket;
                break;
            case "pool":
                targetArray = pool;
                count = poolTicket;
                break;
            case "group":
                targetArray = group;
                count = groupTicket;
                break;
            case "spa":
                targetArray = spa;
                count = spaTicket;
                break;
            default:
                return false;
        }

        // Добавляем клиента в выбранную зону
        targetArray[count] = ticket;
        if (zone.equals("gym")) {
            gymTicket++;
        } else if (zone.equals("pool")) {
            poolTicket++;
        } else if (zone.equals("group")) {
            groupTicket++;
        } else if (zone.equals("spa")) {
            spaTicket++;
        }

        System.out.println(ticket.getOwner().getFirstName() + " вошел в " + zone);
        return true;
    }
}