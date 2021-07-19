package ro.siit.session11.bank;

import java.util.Date;

public class Card {
    private Date expirationDate;
    private String cardNumber;
    private String ownerName;

    public Card(Date expirationDate, String cardNumber, String ownerName) {
        this.expirationDate = expirationDate;
        this.cardNumber = cardNumber;
        this.ownerName = ownerName.toUpperCase();
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
