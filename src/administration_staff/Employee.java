package administration_staff;

import hr_staff.HumanRelations;
import ict_staff.Programmer;
import management_staff.Manager;

/*
So what's the thing with interfaces and classes? You can have different methods in a class
and this class can then be extended (inherited) throughout other classes. We then use the implication " class A extends B "
Nice feature, but what if you want certain classes NOT to inherit certain methods? Well, then you use interfaces. See the
example. The package courses contains 2 interfaces. Both are used by the class Manager and only one is used by the class Programmer.
Now, if I were to put both the methods in the class Employee and I had extended the classes Manager and Programmer with it, these
methods would automatically have been inherited in BOTH the classes. Perhaps this was not my plan! Managers get training and conduct
interview, but programmers only follow training.
 */

/**
 * Created by ronald on 13/09/16.
 */
public class Employee {

    String name = "Joseph";
    String address;
    String phoneNumber;
    float experience;

    public String name(String name){
        System.out.println(name);
        return name;
    }


    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.attendTraining();
        manager.conductInterview();
        manager.name("Manager's name: Bill Gates");

        System.out.println();

        Programmer programmer = new Programmer();
        programmer.attendTraining();
        programmer.name("Programmer's name: Barak Obama");

        System.out.println();

        HumanRelations humanRelations = new HumanRelations();
        humanRelations.conductInterview();

    }
}
