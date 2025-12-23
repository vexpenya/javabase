public class DefoltTicket extends Ticket {
    private final String type = "regular";
    private final String[] allowedZones = {"gym", "spa"};
    private final int accessFrom = 8;
    private final int accessTo = 22;

    public DefoltTicket(Client owner) {
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

