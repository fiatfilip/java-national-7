package ro.siit.session11.bank;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private String iban;
    private Double balance;
    private List<Card> attachedCards;

    public BankAccount(String iban) {
        this.iban = iban;
        this.balance = 0.0;
        this.attachedCards = new ArrayList<>();
    }

    public void attachCard(Card card) {
        attachedCards.add(card);
    }

    public void addMoney(Double amount) {

        if (amount > 0) {
            balance += 0.9 * amount;
        }
    }

    public void withdrawMoney(Double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public List<Card> getAttachedCards() {
        return new ArrayList<>(attachedCards);
    }
}
