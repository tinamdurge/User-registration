import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailTest {
    private String email;
    private boolean expectedResult;
    private UserRegistration userRegistration;

    public EmailTest(String email, boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }

    @Before
    public void init(){
        userRegistration =new UserRegistration();
    }
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{
                {"abc.100@abc.com.au",true},
                {"abc@yahoo.com",true},
                {"abc@yahoo.com",true},
                {"abc-100@yahoo.com",true},
                {"abc@1.com",true},
                {"abc111@abc.com",true},
                {"abc-100@abc.net",true},
                {"abc@gmail.com.com",true},
                {"abc+100@gmail.com",true},
                {"abc@yahoo.com",true},
                {"c",false},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {"abc123@.com",false},
                {"abc123@.com.com",false},
                {".abc@abc.com",false},
                {"abc()*@gmail.com",false},
                {"abc@%*.com",false},
                {"abc..2002@gmail.com",false},
                {"abc.@gmail.com",false},
                {"abc@abc@gmail.com",false},
                {"abc@gmail.com.1a",false},
                {"abc@gmail.com.aa.au",false}
        });
    }
    @Test
    public void testEmail(){
        System.out.println("Parameterized Sample Email is: "+email);
        boolean actualValue= userRegistration.validateEmail(email);
        Assert.assertEquals(expectedResult,actualValue);
        System.out.println("Email Sample Passed");
    }

}