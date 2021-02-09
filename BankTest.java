import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank;

    @BeforeEach
    void setUp() {
        bank = new Bank();
    }

    @AfterEach
    void tearDown() {
        bank = null;
    }

    @Test
    void testToSetBankName() {
        bank.setBankName("MyBank");
        assertEquals("MyBank", bank.getBankName());
    }

    @Test
    void testToSetNumberOfCustomers() {
        bank.setNumberOfCustomers(5678);
        assertEquals(5678, bank.getNumberOfCustomers());
    }

}