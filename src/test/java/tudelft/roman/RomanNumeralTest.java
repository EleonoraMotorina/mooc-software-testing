package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {


    @Test
    public void justNumber() { //  метод
        RomanNumeral roman = new RomanNumeral(); // Обьект roman -  где проверяем(в каком классе) и сохраняем ссылку на него в переменной "roman"
        int result = roman.convert("L"); // установка свойств;  ( что проверяем! и куда будеи сохранять результат (int result)
        Assertions.assertEquals(50, result); // какой результат ожидаем
    }

    @Test
    public void number() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("II");
        Assertions.assertEquals(2,result);
    }

    @Test
    public void example() {
        RomanNumeral roman  = new RomanNumeral();
        int result = roman.convert("II");
        Assertions.assertEquals(2,result);
    }

    @Test
    public void doubleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1,result);
    }

    @Test
    public void thirdNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("D");
        Assertions.assertEquals(500,result);
    }


    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithMany() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("M");
        Assertions.assertEquals(1000, result);

    }



    @Test
    public void numberWithManyDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }
}
