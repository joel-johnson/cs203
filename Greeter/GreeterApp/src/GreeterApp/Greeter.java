/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GreeterApp;

/**
 *
 * @author joejohnson
 */
public class Greeter {
    /**
      Constructs a Greeter object that can greet a person or 
      entity.
      @param aName the name of the person or entity who should
      be addressed in the greetings.
   */
   public Greeter(String aName)
   {
      name = aName;
   }

   /**
      Greet with a "Hello" message.
      @return a message containing "Hello" and the name of
      the greeted person or entity.
   */
   public String sayHello()
   {
      return "Hello, " + name + "!";
   }
   
    /**
     *
     * @param newName
     */
    public void setName(String newName){
       name = newName;
   }
    
    public void swapNames(Greeter other){
        String temp = name;
        name = other.name;
        other.name = temp;
    }

   private String name;
    
}
