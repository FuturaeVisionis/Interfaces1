package hr_staff;

import courses.Interviewer;

/**
 * Created by ronald on 13/09/16.
 */
public class HumanRelations implements Interviewer {
    @Override
    public void conductInterview() {
        System.out.println("HR department always conducts interviews.");
    }
}
