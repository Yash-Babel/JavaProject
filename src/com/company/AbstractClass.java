package com.company;
abstract class Phone1
{
    public Phone1()
    {
        System.out.println("I am a Phone1 constructor.");
    }
    public Phone1(int x)
    {
        System.out.println("I am a Phone1 constructor with X");
    }

    abstract public void call();
    abstract public void powerOn();

    public void sendMessage()
    {
        System.out.println("Sending Messages in Phone1...");
    }
}
abstract class CellPhone1 extends Phone1
{
    public CellPhone1()
    {
        System.out.println("I am a CellPhone1 constructor.");
    }
    public CellPhone1(int x,int y)
    {
        super(x);
        System.out.println("I am a CellPhone1 constructor with X and Y");
    }
    @Override
    abstract public void call();
    abstract public void playGame();

    @Override
    public void powerOn()
    {
        System.out.println("Power On in CellPhone1...");
    }

}
class Vivo1 extends CellPhone1
{
    public Vivo1() {
        super(1,2);
        System.out.println("I am a Vivo1 constructor.");
    }

    @Override
    public void call()
    {
        System.out.println("I am calling in Vivo1...");
    }
    public void playGame()
    {
        System.out.println("Let's play game in Vivo1...");
    }
    public void clickPhotos()
    {
        System.out.println("I am clicking photos in Vivo1...");
    }
}

public class AbstractClass {
    public static void main(String[] args)
    {
        Phone1 p=new Vivo1();
        p.call();
        p.powerOn();
        p.sendMessage();
//        p.playGame(); --gives error because can only use methods contained by reference.

        CellPhone1 c=new Vivo1();
        c.call();
        c.powerOn();
        c.sendMessage();
        c.playGame();
//        c.clickPhotos(); --gives error because can only use methods contained by reference.

        Vivo1 v=new Vivo1();
        v.call();
        v.powerOn();
        v.sendMessage();
        v.playGame();
        v.clickPhotos();
    }
}
