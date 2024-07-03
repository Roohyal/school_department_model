package school_project.model;

import school_project.enums.Attendance;
import school_project.enums.Gender;

public class Principals extends Staff {
    private Boolean available;


    //CONSTRUCTORS

    public Principals(String firstName, String lastName, int age, Gender personGender, int staffId, Attendance staffAttendance, Boolean available) {
        super(firstName, lastName, age, personGender, staffId, staffAttendance);
        this.available = available;
    }


    // GETTERS AND SETTERS


    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "available=" + available +
                ",FirstName=" + getFirstName() +
                ",LastName=" + getLastName() +
                ",Age=" + getAge() +
                ",Gender=" + getPersonGender() +
                ",StaffId=" + getStaffId() +
                ",StaffAttendance=" + getStaffAttendance() +

                '}';
    }
}
