package com.company;

public class GO {
    void landOn(Player player){
        player.adjustBalance( 2);
        System.out.println("du landte på GO");
    }
    void passBy(Player player){
        super.passby(player);
        player.adjustBalance( 2);
        System.out.println("du passerede GO");
    }
    public String toString(){
        return {"GO!"}
    }
}
