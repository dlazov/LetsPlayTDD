import com.zovs.finances.SavingsAccount;
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

    @Test
    public void nextYear() throws Exception {
        SavingsAccount account = new SavingsAccount();
        account.deposit(10000);
        SavingsAccount nextYear = account.nextYear(10);
        assertEquals(11000, nextYear.balance());
    }
}
