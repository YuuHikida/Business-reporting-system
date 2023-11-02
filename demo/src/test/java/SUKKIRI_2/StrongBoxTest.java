package SUKKIRI_2;

import com.example.demo.Cleric;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static SUKKIRI_2.KeyType.PADLOCK;
import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StrongBoxTest {
//    @Test
//    void cheakerKeyType()
//    {
//        //準備
//        StrongBox.KeyType KeyType = StrongBox.KeyType.PADLOCK;
//
//        assertEquals(StrongBox.KeyType.PADLOCK,KeyType);
//
//        //assertThat(StrongBox.KeyType(PADLOCK));
//    }

//    @Test
//    void get_item_when_KeyType_is_PADLOCK()
//    {
//
//       StrongBox<Cleric> sut = new StrongBox<>(KeyType.PADLOCK);
//       Cleric cleric = new Cleric("ゆう",10,10);
//       sut.put(cleric);
//       //sut.get();
//        for (int i = 1; i <=1023 ; i++) {
//            assertNull(sut.get());
//
//        }
//        assertSame(sut.get(), cleric);
//
//    }


    @ParameterizedTest
    @CsvSource({
            "PADLOCK,1024",
            "BUTTON,10000",
            "DIAL,30000",
            "FINGER,1000000"
    })
    void getItem(String keyType,int loopCount)
    {
        StrongBox<Cleric> sut = new StrongBox<>(KeyType.valueOf(keyType));
        Cleric cleric = new Cleric("ゆう",10,10);
        sut.put(cleric);
        //sut.get();
        for (int i = 1; i <=loopCount-1 ; i++) {
            assertNull(sut.get());

        }
        assertSame(sut.get(), cleric);
    }

}