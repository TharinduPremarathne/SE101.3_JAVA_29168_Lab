
package com.mycompany.q1;

public class IntefaceImplemented implements MyFirstInterface 
{
   public void display()
    {
        //Trying to change the value
        /*If there were final, we can not chnage the value. 
        But if there is not final, we can change the value*/
       int x=20;
        
        System.out.println("The value of x is " +x);
    } 
}