import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class AccountTest {
    Account account = null;
    @Test
    public void testAccount() throws Exception {
        account = new Account(10000);
        if (account == null) {
            throw new Exception("계좌생성 실패");
       }
    }

    @Test
    public void testGetBalance() throws Exception {
        account = new Account(10000);
        assertEquals(10000, account.getBalance());
    }


    @Test
    public void testDeposit() throws Exception {
        account = new Account(10000);
        account.deposit(1000);
        assertEquals(11000, account.getBalance());
    }

    @Test
    public void testWithdraw() throws Exception {
        account = new Account(10000);
        account.withdraw(1000);
        assertEquals(9000, account.getBalance());
    }
}
