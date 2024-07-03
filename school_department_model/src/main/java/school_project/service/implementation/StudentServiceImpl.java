package school_project.service.implementation;

import school_project.model.Student;
import school_project.service.StudentService;

public class StudentServiceImpl implements StudentService {

    @Override
    public void displayStudent(Student student) {
        System.out.println("First Name: " + student.getFirstName() + "\n" + "Last Name: " + student.getLastName() +
                "\n" + "Age: " + student.getAge() + "\n" +"Gender: " + student.getPersonGender() + "\n" + "Course taken: " +
                student.getStudentCourses());
    }

    @Override
    public int countOffences(Student student) {
        boolean paidFees = false;
        boolean bullying = true;
        boolean inSchool = false;
        boolean malpractice = true;

        int offences =0;

        if(!paidFees) {
            offences++;
        }if(bullying) {
            offences++;
        }if(!inSchool){
            offences++;
        }if (malpractice){
            offences++;
        }
        return offences;
    }


}
