package C0520H1;

import org.junit.jupiter.api.*;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {


    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }

    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }

    @Tag("DEV")
    @Test
    void testCalcOne()
    {
        System.out.println("======TEST ONE EXECUTED=======");
        //Test will pass
        Assertions.assertNotEquals(3, Calculator.add(2, 2));
        //Test will fail
        Assertions.assertNotEquals(4, Calculator.add(2,2), "Calculator.add(2, 2) test failed");
        //Test will Pass
        Assertions.assertEquals( 4 , Calculator.add(2, 2));
        //Test will fail
        Supplier<String> messageSupplier  = ()-> "Calculator.add(2, 2) test failed";
        Assertions.assertNotEquals(4, Calculator.add(2, 2), messageSupplier);
    }

    @Tag("PROD")
    @Disabled
    @Test
    void testCalcTwo()
    {
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals( 6 , Calculator.add(2, 4));
    }

    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }

    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }
}
