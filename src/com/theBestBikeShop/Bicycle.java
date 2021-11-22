package com.theBestBikeShop;

public class Bicycle {
        private int gear;
        private int speed;
        private boolean lightstatus;

    public Bicycle(int gear) {
        this.gear = gear;
        this.lightstatus=false;
        //add one line on here
    }

    //modify a file
        public void setGear(int newValue) {
            gear=newValue;
        }

        public void applyBrake(int decrement) {
            speed-=decrement;
        }

        public void speedUp(int increment) {
            speed+=increment;
        }

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
}
