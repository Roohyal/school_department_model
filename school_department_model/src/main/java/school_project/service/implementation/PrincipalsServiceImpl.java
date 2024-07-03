package school_project.service.implementation;


import school_project.model.Applicant;
import school_project.model.Principals;
import school_project.model.Student;
import school_project.service.PrincipalsService;

public class PrincipalsServiceImpl implements PrincipalsService {


    @Override
    public void addmissionStatus(Applicant applicant, Principals principals) {
       if (applicant.getAge()<=16) {
           System.out.println("You have been Accepted into this institution");
       } else if (applicant.getAge()==12) {
           System.out.println("You have been Waitlisted, please hold on");
       } else {
           System.out.println("You have been Rejected");
       }
    }

    @Override
    public void displinaryStatus(Student student, Principals principals) {
     if (student.getOffences()>=4){
         System.out.println("You have been Expelled from this institution");
     } else if (student.getOffences()==2) {
         System.out.println("You have been Suspended from this institution");
     } else if (student.getOffences()==1) {
         System.out.println("You have been Warned");
     }else {
         System.out.println("You are a good student");
     }
    }

    @Override
    public void displayPrincipalsData(Principals principals) {
        System.out.println("First Name: " + principals.getFirstName() + "\n" + "Last Name: " + principals.getLastName()+
                "\n" + "Age: " + principals.getAge() + "\n" + "StaffId: " + principals.getStaffId() + "\n" + "Staff Attendance:" +
                principals.getStaffAttendance() + "\n" + "Available: " + principals.getAvailable());
    }
}