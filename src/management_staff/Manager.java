package management_staff;

import administration_staff.Employee;
import courses.Interviewer;
import courses.Trainable;

/**
 * Created by ronald on 13/09/16.
 */
public class Manager extends Employee implements Trainable, Interviewer{
    @Override
    public void attendTraining() {
        System.out.println("Manager attending training.");

    }

    @Override
    public void conductInterview() {
        System.out.println("Manager conducting interview.");

    }
}
