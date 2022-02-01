package com.company;
class CellPhone
{
    public void ring()
    {
        System.out.println("Cellphone is ringing");
    }
    public void vibrate()
    {
        System.out.println("Cellphone is vibrating");
    }
}
public class CellPhoneClass
{
    public static void main(String[] args)
    {
        CellPhone asus = new CellPhone();
        asus.ring();
        asus.vibrate();
    }
}
