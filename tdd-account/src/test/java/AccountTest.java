import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class AccountTest {

    @Test
    public void testAccount() throws Exception {
        Account account = new Account(10000);
        if (account == null) {
            throw new Exception("계좌생성 실패");
       }
    }

    @Test
    public void testGetBalance() throws Exception {
        Account account = new Account(10000);
        assertEquals(10000, account.getBalance());
    }

}
