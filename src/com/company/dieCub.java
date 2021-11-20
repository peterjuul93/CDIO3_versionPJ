package com.company;

public class dieCup {
    Die[] dice;

    //this is a method
    public dieCub(int numOfDice) {
        this.dice = new Die[numOfDice];
        for (int i = 0; i < numOfDice; i++){
            dice[i] = new die();
    }

    public void rollDice() {
       for(Die die : Dice)
           die.roll();
        }

        public int getSum () {
            int result = 0;
            for (int i = 0; i < this.dice.length; i++) {
                result += dice.getEyes();
            }
            return result;
        }
    }
