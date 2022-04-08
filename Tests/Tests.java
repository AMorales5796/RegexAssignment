import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexTest {

    @Test
    void FirstNameLetterACapTrue()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("A");
        assertTrue(tester1.getFirstName().matches("[A-Z]"));
    }

    @Test
    void FirstNameLetterBCapTrue()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("B");
        assertTrue(tester1.getFirstName().matches("[A-Z]"));
    }

    @Test
    void FNLetterBMoreFalse()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("Bob");
        assertFalse(tester1.getFirstName().matches("[A-Z]"));
    }

    @Test
    void FNLetterbFalse()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("b");
        assertFalse(tester1.getFirstName().matches("[A-Z]"));
    }

    @Test
    void FNLetterBoTrue()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("Bo");
        assertTrue(tester1.getFirstName().matches("[A-Z][a-z]"));
    }

    @Test
    void FNLetterBFalse()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("B");
        assertFalse(tester1.getFirstName().matches("[A-Z][a-z]"));
    }

    @Test
    void FNLetterBLengthTrue()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("Bfwrgertbgdcsahe");
        assertTrue(tester1.getFirstName().matches("[A-Z][a-z]*"));
    }

    @Test
    void FNLWithHyphenTrue()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("John-bob");
        assertTrue(tester1.getFirstName().matches("[A-Z]+([-][a-z])*"));
    }

    @Test
    void getFirstName() {
    }

    @Test
    void setFirstName() {
    }

    @Test
    void testToString() {
    }
}