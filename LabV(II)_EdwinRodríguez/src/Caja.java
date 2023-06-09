import java.util.ArrayList;

public class Caja {
    private ArrayList<Ticket> tickets;
    private int numCaja;

    public Caja(ArrayList<Ticket> tickets, int numCaja) {
        this.tickets = new ArrayList<>();
        this.numCaja = numCaja;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public int getNumCaja() {
        return numCaja;
    }

    public void setNumCaja(int numCaja) {
        this.numCaja = numCaja;
    }

    public void generarTicket() {
        Ticket.total += 1;
        tickets.add(new Ticket(numCaja, Ticket.total));
    }

    public void imprimir() {
        for (Ticket ticket : tickets) {
            System.out.println(" ");
            ticket.imprimir();
        }
    }
}
