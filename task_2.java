import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

class PalindromeService {

    public boolean isPalindrome(String text) {
        String reversedText = new StringBuilder(text).reverse().toString();
        return text.equals(reversedText);
    }
}

@RunWith(Parameterized.class)
public class PalindromeServiceTest {
    
    private final String checkedText;
    private final boolean expected;
    
    public PalindromeServiceTest(String checkedText, boolean expected){
        this.checkedText = checkedText;
        this.expected = expected;
    }
    
    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][]{
            {"anna", true},
            {"anka", false},
            {"q", true} 
        };
    }
    
    @Test
    public void shouldCheckPalindrome(){
        PalindromeService palindromeService = new PalindromeService();
        boolean actual = palindromeService.isPalindrome(checkedText);
        assertEquals(expected, actual);
    }
}