package Coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {

    private SomeService someService;

    @BeforeEach
    void  setUp (){
        someService = new SomeService();
    }
    @Test
    void multipleThreeNotFiveReturnsFizz(){

        assertEquals("Fizz", someService.fizzBuzz(3));
    }

    @Test
    void multipleFiveNotThreeReturnsBuzz(){

        assertEquals("Buzz", someService.fizzBuzz(5));
    }

    @Test
    void multipleFifteenReturnsFizzBuzz(){

        assertEquals("FizzBuzz", someService.fizzBuzz(15));
    }

    @Test
    void notMultipleReturnsNumber(){

        assertEquals(Integer.toString(11), someService.fizzBuzz(11));
    }

    @Test
    void firstLast6(){
        assertTrue(someService.firstLast6(new int[] {6,2,4}));
        assertTrue(someService.firstLast6(new int[] {1,2,6}));
        assertFalse(someService.firstLast6(new int[] {3,2,8}));

    }

    @Test
    void luckySum(){
        assertThat(someService.luckySum(13, 3, 8)).isEqualTo(11);
        assertThat(someService.luckySum(5, 13, 8)).isEqualTo(13);
        assertThat(someService.luckySum(4, 3, 13)).isEqualTo(7);
        assertThat(someService.luckySum(4, 3, 5)).isEqualTo(12);
    }

    @Test
    void testMoodAnalyser(){
        String mood = "Это грустное сообщение";
        assertThat(someService.moodAnalise(mood)).isEqualTo("SAD");
    }

    @Test
    void testHappyMoodAnalyser(){
        String mood = "Это веселое сообщение";
        assertThat(someService.moodAnalise(mood)).isEqualTo("HAPPY");
    }

    @Test
    void testEvenOddNumber(){
        assertTrue(someService.evenOddNumber(2));
        assertFalse(someService.evenOddNumber(1));
    }

    @Test
    void testNumberInInterval(){
        assertTrue(someService.numberInInterval(30));
        assertFalse(someService.numberInInterval(120));
    }
}