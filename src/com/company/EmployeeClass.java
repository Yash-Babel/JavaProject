package com.company;
class Employee
{
    int salary;
    String name;
    public void getSalary()
    {
        System.out.println(salary);
    }
    public void getName()
    {
        System.out.println(name);
    }
    public void setName(String str)
    {
       name=str;
    }
}
public class EmployeeClass
{

    public static void main(String[] args)
    {
        Employee mukesh=new Employee();
        mukesh.name="Mukesh";
        mukesh.salary=3000;
        mukesh.getSalary();
        mukesh.getName();
        mukesh.setName("Raj");
        mukesh.getName();
    }
}
