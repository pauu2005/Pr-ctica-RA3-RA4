import static org.junit.Assert.*;
import org.junit.Test;

public class AccountTest {

    @Test
    public void testDeposit() {
        Account account = new Account();
        account.depositAmount(100);
        assertEquals(100, account.getBalance(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositNegative() {
        Account account = new Account();
        account.depositAmount(-50);
    }

    @Test
    public void testWithdraw() {
        Account account = new Account();
        account.depositAmount(200);
        account.withdrawAmount(50);
        assertEquals(150, account.getBalance(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawExcess() {
        Account account = new Account();
        account.withdrawAmount(500);
    }
}
