package ca.sheridancollege.project;
/*
*
*@author Devansh,Nadir and Asim
*/
public enum CardNum {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    private int num;
    private String name;

    public int getNum() {
        return num;
    }

    /**
     *
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }

}
