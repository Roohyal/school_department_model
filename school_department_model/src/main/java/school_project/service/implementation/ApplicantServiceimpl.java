package school_project.service.implementation;

import school_project.model.Applicant;
import school_project.service.ApplicantService;

public class ApplicantServiceimpl implements ApplicantService {
    @Override
    public void displayApplicationData(Applicant applicant) {
        System.out.println("First Name : "  + applicant.getFirstName() +"\n" + "Last Name : " + applicant.getLastName()+ "\n" +
                "Age : " + applicant.getAge() +"\n" + "Gender: " + applicant.getPersonGender() );



    }
}
