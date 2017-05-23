package ict_staff;

import administration_staff.Employee;
import courses.Trainable;

/**
 * Created by ronald on 13/09/16.
 */
public class Programmer extends Employee implements Trainable {
    @Override
    public void attendTraining() {
        System.out.println("Programmer attending training.");

    }
}
