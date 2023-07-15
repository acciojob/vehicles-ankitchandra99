package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //comstructor of parent class
        super(name,4,2,5,isManual,"Racing",2);
        //Use arbitrary values for parameters which are not mentioned

    }

    public void accelerate(int rate){
        int newSpeed = rate+getCurrentSpeed(); //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            stop();
            changeGear(1);
            //Stop the car, set gear as 1
        }
        //for all other cases, change the gear accordingly
        else if (newSpeed<=40) {
            changeGear(1);
        }
        else if(newSpeed<=80){
            changeGear(2);
        }
        else if(newSpeed<=120){
            changeGear(3);
        }
        else if(newSpeed<=180){
            changeGear(4);
        }
        else if(newSpeed<=250){
            changeGear(5);
        }
        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }


}
