/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shane Yankam
 */
public class Counter {

    private int zahl;
    private boolean vrai;

    public Counter(int startingValue, boolean check) {
        this.zahl = startingValue;
        this.vrai = check;

    }

    public Counter(int startingValue) {
        this.zahl = startingValue;
    }

    public Counter(boolean check) {
        this.zahl = 0;
        this.vrai = check;

    }

    public Counter() {
        this.zahl = 0;
        this.vrai = false;
    }

//#######################################################################################################
    public int value() {
        return this.zahl;

    }

    public void increase() {
        this.zahl++;
    }

    public void decrease() {

        if (this.vrai == false) {
            this.zahl--;

        } else if (this.vrai == true) {
            if (this.zahl > 0) {
                this.zahl--;
            } else {

            }
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount < 0) {

        } else {
            this.zahl = this.zahl + increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {

        if (decreaseAmount < 0) {

        } else {
            if (this.vrai == false) {
                this.zahl = this.zahl-decreaseAmount;

            } else if (this.vrai == true) {
                
                int p = this.zahl-decreaseAmount;
                if( p< 0){
                    this.zahl = 0;
                }
                else{
                    this.zahl = p;
                }

            }
        }
    }
}
