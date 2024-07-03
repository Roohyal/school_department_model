package school_project.organization_work;

import school_project.enums.*;
import school_project.model.*;
import school_project.service.implementation.*;

public class Organization {
    public static void main(String[] args) {
        Applicant applicant1 = new Applicant("Peace", "Mathias", 11, Gender.FEMALE);
        Applicant applicant2 = new Applicant("Divine", "Mathias", 16, Gender.MALE);
        ApplicantServiceimpl applicantServiceimpl1 = new ApplicantServiceimpl();
        ApplicantServiceimpl applicantServiceimpl2 = new ApplicantServiceimpl();


        NonAcademic nonAcademic = new NonAcademic("David", "Okoro", 32, Gender.MALE, 123, Attendance.PRESENT, "Driver");
        NonAcademic nonAcademic2 = new NonAcademic("Mary", "Ojo", 28, Gender.MALE, 312, Attendance.PRESENT, "Receptionist");
        NonAcademicimpl nonAcademicimpl = new NonAcademicimpl();
        NonAcademicimpl nonAcademicimpl1 = new NonAcademicimpl();

        Student student = new Student("Goodness", " Nathan", 17, Gender.FEMALE, true, false, true, true, 1, Classes.SENIOR, Courses.ENGINEERING, StudentStatus.WARNING);
        Student student2 = new Student("Roland", " Nwonye", 18, Gender.MALE, true, false, true, false, 2, Classes.SENIOR, Courses.ENGINEERING, StudentStatus.SUSPENDED);
        StudentServiceImpl studentServiceimpl1 = new StudentServiceImpl();
        StudentServiceImpl studentServiceimpl2 = new StudentServiceImpl();

        Teacher teacher1 = new Teacher("Royal", "Mathias", 25, Gender.FEMALE, 546, Attendance.PRESENT, true, Courses.ENGLISH);
        Teacher teacher2 = new Teacher("Philip", "Martin", 25, Gender.MALE, 367, Attendance.ABSENT, false, Courses.HUMANITIES);


        TeacherServiceimpl teacherServiceimpl1 = new TeacherServiceimpl();
        TeacherServiceimpl teacherServiceimpl2 = new TeacherServiceimpl();

        Principals principals1 = new Principals("John", "Nwonye", 43, Gender.MALE, 100, Attendance.PRESENT, true);
        PrincipalsServiceImpl principalsService1 = new PrincipalsServiceImpl();
        PrincipalsServiceImpl addmissionService1 = new PrincipalsServiceImpl();

        System.out.println("Teacher's Data");
        teacherServiceimpl1.displayTeacher(teacher1);
        System.out.println("************************");

        System.out.println("Teacher's Data ");
        teacherServiceimpl2.displayTeacher(teacher2);
        System.out.println("*************************");


        System.out.println("Applicants Data");
        applicantServiceimpl1.displayApplicationData(applicant1);
        addmissionService1.addmissionStatus(applicant1, principals1);
        System.out.println("**********************");

        System.out.println("Student's Data");
        studentServiceimpl1.displayStudent(student);
        addmissionService1.displinaryStatus(student, principals1);
        System.out.println("*************************");

        System.out.println("Student's Data");
        studentServiceimpl2.displayStudent(student2);
        addmissionService1.displinaryStatus(student2, principals1);
        System.out.println("**********************");

        System.out.println("Applicants Data");
        applicantServiceimpl1.displayApplicationData(applicant2);
        addmissionService1.addmissionStatus(applicant2, principals1);
        System.out.println("******************************");

        System.out.println("Principal's Data");
        principalsService1.displayPrincipalsData(principals1);
        System.out.println("**************************");

        System.out.println("Non Academic Staff's Data");
        nonAcademicimpl.displayNonAcademicStaff(nonAcademic);
        System.out.println("*****************************");

        System.out.println("Non Academic Staff's Data");
        nonAcademicimpl1.displayNonAcademicStaff(nonAcademic2);
        System.out.println("***********************");



    }

}
