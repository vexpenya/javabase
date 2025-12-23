public class VIPTicket extends Ticket {
    private final String type = "vip";
    private final String[] allowedZones = {"gym", "pool", "group", "spa"};
    private final int accessFrom = 6;
    private final int accessTo = 24;

    public VIPTicket(Client owner) {
        super(owner);
    }

    public String getType() { return type; }
    public String[] getAllowedZones() { return allowedZones; }
    public int getAccessFrom() { return accessFrom; }
    public int getAccessTo() { return accessTo; }

    public boolean hasAccessTo(String zone) {
        for (String z : allowedZones) {
            if (z.equals(zone)) return true;
        }
        return false;
    }
}

