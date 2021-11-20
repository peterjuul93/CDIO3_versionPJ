package com.company;

public class chance extends square {
    void landOn(Player player) {
        System.out.println("Du landte på chance"); //this needs to be transfered to csv.
        int cardnumber = (int) (Math.random * 4 + 1);
    }
    switch(cardnumber)

    {
        case1 -> {
            System.out.println("move to an orange or green blabla");
        }
        case2 -> {
            system.out.println("blabla")
            player.adjustBalance(money - 2)
        }
        case3 -> {
            System.out.println("move to pink square");
        }
// one cases missing - not important for now.
    }
}