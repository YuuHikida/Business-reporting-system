import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SUKKIRITest {
    SUKKIRI sut = new SUKKIRI();

    @Test
    void calc_area() {

         assertEquals(15, sut.execute(3, 5));
    }
//
//    @ParameterizedTest
//    @CsvSource({
//
//            "3,5,15",
//            "5,5,25",
//
//    })
//    void clac_area(int num, int num2, int expected) {
//        assertThat(sut.execute(num, num2) == expected).isTrue();
//    }


}