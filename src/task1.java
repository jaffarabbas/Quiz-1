//package com.company;

import java.util.Scanner;

class Employes{
    private final String firstname;
    private final String lastname;
    private final String socialsecuritynumber;

    Employes(String firstname,String lastname,String socialsecuritynumber){
        this.firstname = firstname;
        this.lastname = lastname;
        this.socialsecuritynumber = socialsecuritynumber;
    }

   public String toString(){
        return firstname+"\n"+lastname+"\n"+socialsecuritynumber;
    }
}

 class ComissionEmployee extends Employes{

    private double grosssales;
    private double comissionrate;

    public ComissionEmployee(String firstname, String lastname, String socialsecuritynumber, double grossSales, double comissionrate) // Five argument constructor
    {

       super(firstname,lastname,socialsecuritynumber);
        this.grosssales = grossSales;
        this.comissionrate = comissionrate;

        System.out.println(toString());
    } // end Constructor


    public void setGrossSales(double grossSales)
    {
        this.grosssales = grossSales;
    }
    public double getGrossSales()
    {
        return grosssales;
    }
    public void setComissionRate(double commissionRate)
    {
        this.comissionrate = commissionRate;
    }
    public double getComissionRate()
    {
        return comissionrate;
    }
    public double earnings(){
        return comissionrate * grosssales;
    }

    @Override
    public String toString()
    {
        return super.toString()+"\nGross Sales "+grosssales +"\nComission rate "+comissionrate+"\n Earning : "+earnings();
    }

}


public class task1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String fname,lname,ssn;
        double gsale,crate;
        System.out.println("First Name");
        fname=ob.next();
        System.out.println("Last Name");
        lname=ob.next();
        System.out.println("Social Security Number");
        ssn=ob.next();
        System.out.println("Gross Sale");
        gsale=ob.nextDouble();
        System.out.println("Comission Rate");
        crate=ob.nextDouble();
        ComissionEmployee obj = new ComissionEmployee(fname,lname,ssn,gsale,crate);
    }
}
