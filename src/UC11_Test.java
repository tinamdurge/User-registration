import org.junit.jupiter.api.*;

public class UC11_Test{
    static UC11;

    @BeforeAll
    public static void init(){
        System.out.println("Before all");
       UC11 = new UC11();
    }
    @Test
    void givenFirstNameShouldReturnTrue(){
        boolean value = UC11.validateFirstName("Sanjana");
        Assertions.assertTrue(value);
        System.out.println("First Name Checked:- Successfully Passed UC1");
    }
    @Test
    void givenLastNameShouldReturnTrue(){
        boolean LastName = UC11.validateLastName("Srinivas");
        Assertions.assertTrue(LastName);
        System.out.println("Last Name Checked :- Successfully Passed UC2");
    }

    @Test
    void givenEmailIdShouldReturnTrue(){
        boolean Email = UC11.validateEmail("sanjanams@gmail.com");
        Assertions.assertTrue(Email);
        System.out.println("Email ID Checked :- Successfully Passed UC3");
    }
    @Test
    void givenMobileNumberShouldReturnTrue(){
        boolean PhoneNumber = UC11.validatePhoneNumber("919535397690");
        Assertions.assertTrue(PhoneNumber);
        System.out.println("PhoneNumber Checked :- Successfully Passed UC4");
    }

    @Test
    void checkPasswordShouldReturnTrue(){
        boolean Password = UC11.validatePassword("Sanjana@1");
        Assertions.assertTrue(Password);
        System.out.println("Password Checked(Rule1, Rule2, Rule3 & Rule4) :- Successfully Passed UC5,UC6,UC7,UC8");
    }
}
