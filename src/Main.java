import dependencyInjection.Calculator;
import dependencyInjection.TaxCalculator2023;
import singleton.Logger;
import singleton.Root;

import javax.naming.NamingException;

public class Main {
    public static void main(String[] args) throws NamingException {

      /*  //I will get the salary and make the calculation
        float salary = 1000f;
        dependencyInjection.Calculator calculator = getTaxCalculator();
        float tax = calculator.calculateTax(salary);
        System.out.println("the tax is : " + tax);*/

        ///Singleton

       /* singleton.Root root1 = new singleton.Root();//1
        singleton.Root root2 = new singleton.Root();//2*/

/*
        Root root1 = Root.getInstance();
        Root root2 = Root.getInstance();
        System.out.println(root2 == root1);*/

        Logger log1 = Logger.createObject("Arja");
        Logger log2 = Logger.createObject("john");
        log1.logMessage("first message");
        log2.logMessage("trying one more message");
        System.out.println(log1==log2);


    }























    public static Calculator getTaxCalculator() {
        return  new TaxCalculator2023();
    }

}