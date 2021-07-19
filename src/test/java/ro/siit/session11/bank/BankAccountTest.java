package ro.siit.session11.bank;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class BankAccountTest {

    private BankAccount bankAccount;
    private String iban;

    private Card card;
    private String cardNo = "0000000000000000";
    String owner = "John DOe";
    Date expiry = GregorianCalendar.getInstance().getTime();

    @Before
    public void init(){
        bankAccount = new BankAccount(iban);
        card = new Card(expiry, cardNo,owner);
    }

    @Test
    public void shouldReturnBalance(){
        Assert.assertEquals(0.0, bankAccount.getBalance(), 0.0);
        bankAccount.addMoney(2.0);
        Assert.assertEquals(2.0, bankAccount.getBalance(), 0.0);
    }

    @Test
    public void shouldAddCard(){
        bankAccount.attachCard(card);
        List<Card> cardList = bankAccount.getAttachedCards();
        Assert.assertTrue(cardList.contains(card));
    }

    @Test
    public void shouldAddMoney(){
        Double initialAmount = bankAccount.getBalance();
        Double amount = 5.0;
        bankAccount.addMoney(amount);
        Assert.assertEquals(initialAmount+amount, bankAccount.getBalance(), 0.1 * amount);
    }

}
