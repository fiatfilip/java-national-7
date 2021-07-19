package ro.siit.session11.bank;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Date;
import java.util.GregorianCalendar;

public class CardTest {

    private Card card;
    private String cardNo = "0000000000000000";
    String owner = "John DOe";
    Date expiry = GregorianCalendar.getInstance().getTime();

    @Before
    public void init(){
        this.card = new Card(expiry, cardNo, owner);
    }

    @Test
    public void shouldReturnCardNumber(){
//        String cardNo = "0000000000000000";
//        Card card = new Card(GregorianCalendar.getInstance().getTime(), cardNo, "JOHN DOE");

        Assert.assertEquals(cardNo, card.getCardNumber());
    }

    @Test
    public void shouldReturnOwnerName(){
//        String cardNo = "0000000000000000";
//        String owner = "John DOe";
//        Card card = new Card(GregorianCalendar.getInstance().getTime(), cardNo, "JOHN DOE");

        Assert.assertEquals(owner.toUpperCase(), card.getOwnerName());
    }

    @Test
    @Ignore
    public void shouldReturnExpirationDate(){
//        String cardNo = "0000000000000000";
//        String owner = "John DOe";
//        Date expiry = GregorianCalendar.getInstance().getTime();
//        Card card = new Card(expiry, cardNo, "JOHN DOE");

        Assert.assertEquals(expiry, card.getExpirationDate());
    }
}
