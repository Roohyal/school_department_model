package school_project.service.implementation;

import school_project.model.NonAcademic;
import school_project.service.NonAcademicStaff;

public class NonAcademicimpl implements NonAcademicStaff {
    @Override
    public void displayNonAcademicStaff(NonAcademic nonAcademic) {
        System.out.println("FirstName: " + nonAcademic.getFirstName() + "\n" +"LastName: " + nonAcademic.getLastName() + "\n" +
                "Age: " + nonAcademic.getAge() + "\n" +"Gender: " + nonAcademic.getPersonGender()+ "\n" + "StaffId: " + nonAcademic.getStaffId() + "\n" +
                 "Attendance: " + nonAcademic.getStaffAttendance() + "\n" + "Position: " + nonAcademic.getPosition());
    }
}