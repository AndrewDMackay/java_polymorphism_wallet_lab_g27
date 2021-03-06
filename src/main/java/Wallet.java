import java.util.ArrayList;

public class Wallet implements IScan {
    private String name;
    private ArrayList<IScan> cards;

//    private ArrayList<CreditCard> creditCards;
//    private ArrayList<DebitCard> debitCards;
//    private ArrayList<LoyaltyCard> loyaltyCards;
//    private ArrayList<Ticket> tickets;

    public Wallet(String name) {
        this.name = name;
        this.cards = new ArrayList<>();

//        this.creditCards = new ArrayList<CreditCard>();
//        this.debitCards = new ArrayList<DebitCard>();
//        this.loyaltyCards = new ArrayList<LoyaltyCard>();
//        this.tickets = new ArrayList<Ticket>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.cards.size();
    }

    public void addItem(IScan card) {
        this.cards.add(card);
    }

    @Override
    public String scan(String data) {
        return data;
    }
}

//    public void addItem(CreditCard item) {
//        this.creditCards.add(item);
//    }
//
//    public void addItem(DebitCard item) {
//        this.debitCards.add(item);
//    }
//
//    public void addItem(LoyaltyCard item) {
//        this.loyaltyCards.add(item);
//    }
//
//    public void addItem(Ticket item) {
//        this.tickets.add(item);
//    }

