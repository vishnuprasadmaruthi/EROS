/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Initializer;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Network.Person;
import Business.Network.PersonDirectory;

/**
 *
 * @author Vishnu
 */
public class Data {

    public Data(EcoSystem system) {

        for (Network network : system.getNetworkList()) {
            if (network.getName().equalsIgnoreCase("boston")) {

                //Person(String name, int age, int mobileNo, String email)
                Person person1 = new Person("John", 23, 890, "vp@gmail.com");
                Person person2 = new Person("Brad", 25, 123, "vp@gmail.com");
                Person person3 = new Person("Jim", 27, 655, "vp@gmail.com");
                Person person4 = new Person("Robert", 28, 899, "vp@gmail.com");
                Person person5 = new Person("Justin", 21, 148, "vp@gmail.com");

                network.getPersonDirectory().getPersonDirectory().add(person1);
                network.getPersonDirectory().getPersonDirectory().add(person2);
                network.getPersonDirectory().getPersonDirectory().add(person3);
                network.getPersonDirectory().getPersonDirectory().add(person4);
                network.getPersonDirectory().getPersonDirectory().add(person5);
            }
        }

    }

}
