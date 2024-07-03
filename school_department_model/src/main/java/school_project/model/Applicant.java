package school_project.model;

import school_project.enums.ApplicantStatus;
import school_project.enums.Gender;

public class Applicant extends Person {
    private ApplicantStatus applicantStatus;

    // CONSTRUCTORS
    public Applicant(String firstName, String lastName, int age, Gender personGender) {
        super(firstName, lastName, age, personGender);
    }




    //GETTERS AND SETTERS
    public ApplicantStatus getApplicantStatus() {
        return applicantStatus;
    }

    public void setApplicantStatus(ApplicantStatus applicantStatus) {
        this.applicantStatus = applicantStatus;
    }

     //TO STRING
    @Override
    public String toString() {
        return "Applicant{" +
                "ApplicantApplicantStatus=" + applicantStatus +
                ",firstName=" + getFirstName() +
                ",lastName=" + getLastName() +
                ",Age=" + getAge() +
                ",Gender=" + getPersonGender() +
                '}';
    }
}
