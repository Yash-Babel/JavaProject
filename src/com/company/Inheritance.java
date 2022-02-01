package com.company;
class Base
{
    public int x;
    public Base()
    {
        System.out.println("I am in Base constructor");
    }
    public Base(int x)
    {
        System.out.println("I am in Base constructor with : "+x);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends Base
{
    int y;
    public Derived()
    {
        super(5);                                                           //call to super must be first statement in constructor otherwise it will give error!!
        System.out.println("I am a Derived constructor");
    }
    public Derived(int x)
    {
        System.out.println("I am a Derived constructor with : "+x);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //Base b=new Base();
        Derived d=new Derived();

    }
}
