package school_project.service;


import school_project.model.Applicant;
import school_project.model.Principals;
import school_project.model.Student;

public interface PrincipalsService {

     void addmissionStatus(Applicant applicant, Principals principals);


     void displinaryStatus(Student student, Principals principals);

     void displayPrincipalsData(Principals principals);
}
