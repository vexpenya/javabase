import java.util.Date;
import java.util.Calendar;

public class Ticket {
    protected Client owner;
    protected Date registrationDate;
    protected Date expirationDate;

    public Ticket(Client owner) {
        this.owner = owner;
        this.registrationDate = new Date();
        this.expirationDate = addOneYear();
    }

    private Date addOneYear() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(registrationDate);
        cal.add(Calendar.YEAR, 1);
        return cal.getTime();
    }

    public Client getOwner() { return owner; }
    public Date getRegistrationDate() { return registrationDate; }
    public Date getExpirationDate() { return expirationDate; }
}