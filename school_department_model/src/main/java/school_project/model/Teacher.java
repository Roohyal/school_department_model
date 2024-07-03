package school_project.model;

import school_project.enums.Attendance;
import school_project.enums.Courses;
import school_project.enums.Gender;

public class Teacher extends Staff {

    private boolean taughtToday;
    private Courses TeacherCourses;

    // CONSTRUCTORS


    public Teacher(String firstName, String lastName, int age, Gender personGender, int staffId, Attendance staffAttendance, boolean taughtToday, Courses teacherCourses) {
        super(firstName, lastName, age, personGender, staffId, staffAttendance);
        this.taughtToday = taughtToday;
        TeacherCourses = teacherCourses;
    }

    //GETTERS AND SETTERS
    public boolean isTaughtToday() {
        return taughtToday;
    }

    public void setTaughtToday(boolean taughtToday) {
        this.taughtToday = taughtToday;
    }

    public Courses getTeacherCourses() {
        return TeacherCourses;
    }

    public void setTeacherCourses(Courses teacherCourses) {
        TeacherCourses = teacherCourses;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "taughtToday=" + taughtToday +
                ", TeacherCourses=" + TeacherCourses +
                ",firstName=" + getFirstName() +
                ",lastName=" + getLastName() +
                ",Gender=" + getPersonGender() +
                ",StaffID=" + getStaffAttendance() +
                ",Attendance=" + getStaffAttendance() +
                '}';
    }
}
