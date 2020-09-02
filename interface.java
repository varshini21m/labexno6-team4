import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VARSHINI M
 */
 interface NewInterface {
    Scanner in=new Scanner(System.in);
    abstract void print();
}
public class pg2{
    public static void main(String[] args){
    NewInterface r=new Rectangles();
    r.print();
    r=new Sportscar();
    r.print();
    r=new Managers();
    r.print();
    }
}
class Rectangles implements NewInterface{
    @Override
    public void print()
    {
    int a, b;
    int area;
    System.out.println("Enter the length of the rectangle is");
    a=in.nextInt();
    System.out.println("Enter the breadth  of the rectangle is");
    b=in.nextInt();
    area=a*b;
    System.out.println("The length of the rectangle is"+a);
    System.out.println("The breadth  of the rectangle is"+b);   
    System.out.println("The area of the rectangle"+area);
    }
}
class Sportscar implements NewInterface{
    @Override
    public void print()
    {
    String brandname, model;
    int price;
    {
        System.out.println("Enter the brand name");
        brandname=in.next();
        System.out.println("Enter the model name");
        model=in.next();
        System.out.println("Enter the price");
        price=in.nextInt(); 
        System.out.println("The brand name"+brandname);
        System.out.println("The model name "+model);
        System.out.println("The price of the sports car is"+price);
        
        
    }
}
}
class Managers implements NewInterface
{
  @Override
  public void print()
  {
      int id,age;
      double salarydetails;
      String name;
       System.out.println("Enter the name");
       name=in.next();
       System.out.println("Enter the id");
       id=in.nextInt();
       System.out.println("Enter the age");
       age=in.nextInt();
       System.out.println("Enter the salary details");
       salarydetails=in.nextDouble();
       System.out.println("The details of the employee are");
       System.out.println("The name"+name);
       System.out.println("The age"+age);
       System.out.println("The id"+id);
       System.out.println("The salarydetails"+salarydetails);
  }
}
