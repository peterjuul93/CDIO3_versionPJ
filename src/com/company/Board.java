package com.company;

public class Board extends square {
    public static final square[] gameBoardList = new square[11];
    public static int length()
    {return gameBoardList.length;}
    public static square getSquare(int position)
    {
        return gameBoardList[position];
    }
    public static square makeSquares()
    {
        gameboardList[1] = new GO();
        gameboardList[2] = new chance();
        gameboardList[3] = new amusement();
        gameboardList[4] = new amusement();
        gameboardList[5] = new chance();
        gameboardList[6] = new amusement();
        gameboardList[7] = new amusement();
        gameboardList[8] = new chance();
        gameboardList[9] = new amusement();
        gameboardList[10] = new amusement();
        return gameBoardList;
    }
    @Override
    public String toString()
    {
    StringBuilder builder = new Stringbuilder();
    for(int i; i < length(); i++)
    {
        builder.append(getSquare i + "\n");
    }
    return builder.toString();
    }
}
