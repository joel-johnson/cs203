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
public class GreeterApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** 
         * @return a message containing "Hello World"
         */
      Greeter worldGreeter = new Greeter("World");
      Greeter worldGreeter2 = worldGreeter;
      worldGreeter.setName("Universe");
      String greeting = worldGreeter2.sayHello();
      System.out.println("This demonstrates setName:");
      System.out.println(greeting + "\n\n");
      
      Greeter planetGreeter = new Greeter("Planet");
      Greeter universeGreeter = new Greeter("Universe");
      planetGreeter.swapNames(universeGreeter);
      String planetGreeting = planetGreeter.sayHello();
      String universeGreeting = universeGreeter.sayHello();
      System.out.println("This demonstrates swapNames:");
      System.out.println(planetGreeting);
      System.out.println(universeGreeting);
    }
    
}
