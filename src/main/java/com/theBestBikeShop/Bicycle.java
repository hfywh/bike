package com.theBestBikeShop;


/**
 * This is to test the javadoc
 * @author Yong
 * @since 12/11/2021
 * @version 2.4
 */
public class Bicycle {
        private int gear;
        private int speed;
        private boolean lightstatus;

    /**
     * Initialize the bicycle state
     * @param gear Bicycle gear
     */
    public Bicycle(int gear) {
        this.gear = gear;
        this.lightstatus=false;
        //add one line on here
    }

    /**
     * Set gear
     * @param newValue Gear
     */
    //modify a file
        public void setGear(int newValue) {
            gear=newValue;
        }

    /**
     * Decrease speed
     * @param decrement brake
     */
        public void applyBrake(int decrement) {
            speed-=decrement;
        }

    /**
     * increase speed
     * @param increment speed
     */
        public void speedUp(int increment) {
            speed+=increment;
        }

    /**
     * Switch light status
     */
        public void switchLightStatus(){
            if(lightstatus){
                lightstatus=false;
            }else{
                lightstatus=true;
            }
        }

        public void currentState(){
            System.out.println("Gear:"+gear+"; Speed:"+speed+"; LightStatus:"+lightstatus);
        }

    public int getgear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }
}
