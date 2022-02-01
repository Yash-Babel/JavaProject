package com.company;

import java.util.Objects;

class Library
{
    String avaBooks []=new String[20];
    String issBooks[]=new String[20];
    public Library()
    {
        for(int j=0;j<10;j++)
        {
            avaBooks[j]="Book"+(j+1);
        }
    }
    void addBook(int i)
    {
        avaBooks[i-1]="Book"+(i);
        System.out.printf("Book%d is added.\n",i);
    }
    void issueBook(int i)
    {
        if(Objects.equals(avaBooks[i - 1], "Book" + i))
        {
            issBooks[i-1] = "Book" + (i);
            avaBooks[i-1] = null;
            System.out.printf("Book%d issued.\n",i);
        }
        else
        {
            System.out.printf("Book%d not found in available books.\n",i);
        }
    }
    void returnBook(int i)
    {
        issBooks[i-1]=null;
        avaBooks[i-1]="Book"+(i);
        System.out.printf("Book%d is returned.\n",i);
    }
    void showAvailableBooks()
    {
        for(int i=0;i<20;i++)
        {
            if(avaBooks[i]!=null)
            {
                System.out.print("Book"+(i+1)+" ");
            }
        }
        System.out.println();
    }
}

public class Exercise4Library
{
    public static void main(String[] args)
    {
        Library lib=new Library();
        lib.showAvailableBooks();
        lib.addBook(19);
        lib.addBook(15);
        lib.issueBook(2);
        lib.issueBook(4);
        lib.issueBook(13);
        lib.issueBook(18);
        lib.showAvailableBooks();
        lib.returnBook(4);
        lib.showAvailableBooks();
    }
}
