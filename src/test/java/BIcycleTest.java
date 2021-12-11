import com.theBestBikeShop.Bicycle;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BIcycleTest {

    Bicycle b = new Bicycle(3);


    @Test
    @DisplayName("anything")
    void setGear() {
        assertEquals(3,b.getgear());
    }

    @Test
    @Disabled
    void applyBrake() {
    }

    @Test
    void speedUp() {
    }

    @Test
    void switchLightStatus() {
    }

    @Test
    void currentState() {
    }
}