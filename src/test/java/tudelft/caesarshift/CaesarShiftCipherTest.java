package tudelft.caesarshift;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

//@ParameterizedTest(name = "message={0}, shift={1}, expectedResult={2}")
//@CsvSource({
//        //letters And Positive Number
//        "abc,3,def",
//        //letters And Negative number
//        "abc,-3,xyz",
//        //only Numbers
//        //
//        "123,2,invalid",
//        //letters With space and Positive Number
//        "abc_123,2,invalid",
//        //letters With End Positive Number
//        "xyz,5,cde"
//})
//public void exampleTest(String message, int shift) {
//    CaesarShiftCipher caesar = new CaesarShiftCipher();
//    String result = caesar.CaesarShiftCipher(message,shift);
//    Assertions.assertEquals(expectedResult,result);
//
//}


    private CaesarShiftCipher caesar;
    @BeforeEach
    public void initiliaze() {
        this.caesar = new CaesarShiftCipher();
    }
    @Test
    public void lettersAndPositiveNumber(){
        CaesarShiftCipher caesar = new CaesarShiftCipher();
        String result = caesar.CaesarShiftCipher("abc",3);
        Assertions.assertEquals("def",result);
    }
    @Test
    public void lettersAndNegativenumber() {
        String result = caesar.CaesarShiftCipher("abc",-3);
        Assertions.assertEquals("xyz",result);
    }
    @Test
    public void onlyNumbers() {
        String result = caesar.CaesarShiftCipher("123",2);
        Assertions.assertEquals("invalid",result);
    }
    @Test
    public void lettersWithspaceandPositiveNumber() {
        String result = caesar.CaesarShiftCipher("abc_123",2);
        Assertions.assertEquals("invalid",result);
    }
    @Test
    public void lettersWithEndPositiveNumber() {
        String result = caesar.CaesarShiftCipher("xyz",5);
        Assertions.assertEquals("cde",result);
    }


}
