package com.theBestBikeShop;

import com.theBestBikeShop.model.Bicycle;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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