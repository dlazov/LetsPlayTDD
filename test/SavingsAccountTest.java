import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SavingsAccountTest {
    @Test
    public void depositAndWithdrawTest() {
        SavingsAccount account = new SavingsAccount();
        account.deposit(100);
        assertEquals("after deposit", 100, account.balance());
        account.withdraw(50);
        assertEquals("after withdraw", 50, account.balance());
    }

    @Test
    public void negativeBalanceIsJustFine() throws Exception {
        SavingsAccount account = new SavingsAccount();
        account.withdraw(75);
        assertEquals(-75, account.balance());
    }
}