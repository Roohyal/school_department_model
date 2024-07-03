package school_project.model;

import school_project.enums.Classes;
import school_project.enums.Courses;
import school_project.enums.Gender;
import school_project.enums.StudentStatus;

public class Student extends Person {
    private boolean inSchool;
    private boolean malpractice;
    private boolean bullying;
    private boolean paidFees;
    private int offences;
    private Classes StudentClasses;
    private Courses StudentCourses;
    private StudentStatus StudentStatus;

    // CONSTRUCTORS
    public Student(String firstName, String lastName, int age, Gender personGender, boolean inSchool, boolean malpractice, boolean bullying, boolean paidFees, int offences, Classes studentClasses, Courses studentCourses, school_project.enums.StudentStatus studentStatus) {
        super(firstName, lastName, age, personGender);
        this.inSchool = inSchool;
        this.malpractice = malpractice;
        this.bullying = bullying;
        this.paidFees = paidFees;
        this.offences = offences;
        StudentClasses = studentClasses;
        StudentCourses = studentCourses;
        StudentStatus = studentStatus;
    }



  // GETTERS AND SETTERS
    public boolean isInSchool() {
        return inSchool;
    }

    public void setInSchool(boolean inSchool) {
        this.inSchool = inSchool;
    }

    public boolean isMalpractice() {
        return malpractice;
    }

    public void setMalpractice(boolean malpractice) {
        this.malpractice = malpractice;
    }

    public boolean isBullying() {
        return bullying;
    }

    public void setBullying(boolean bullying) {
        this.bullying = bullying;
    }

    public boolean isPaidFees() {
        return paidFees;
    }

    public void setPaidFees(boolean paidFees) {
        this.paidFees = paidFees;
    }

    public int getOffences() {
        return offences;
    }

    public void setOffences(int offences) {
        this.offences = offences;
    }

    public Classes getStudentClasses() {
        return StudentClasses;
    }

    public void setStudentClasses(Classes studentClasses) {
        StudentClasses = studentClasses;
    }

    public Courses getStudentCourses() {
        return StudentCourses;
    }

    public void setStudentCourses(Courses studentCourses) {
        StudentCourses = studentCourses;
    }

    public school_project.enums.StudentStatus getStudentStatus() {
        return StudentStatus;
    }

    public void setStudentStatus(school_project.enums.StudentStatus studentStatus) {
        StudentStatus = studentStatus;
    }

 //TO STRING

    @Override
    public String toString() {
        return "Student{" +
                "inSchool=" + inSchool +
                ", malpractice=" + malpractice +
                ", bullying=" + bullying +
                ", paidFees=" + paidFees +
                ", offences=" + offences +
                ", StudentClasses=" + StudentClasses +
                ", StudentCourses=" + StudentCourses +
                ", StudentStatus=" + StudentStatus +
                '}';
    }
}









