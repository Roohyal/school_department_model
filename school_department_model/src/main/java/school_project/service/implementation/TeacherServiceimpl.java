package school_project.service.implementation;

import school_project.enums.Courses;
import school_project.model.Teacher;
import school_project.service.TeacherService;

public class TeacherServiceimpl implements TeacherService {
    @Override
    public void teachCourse(Teacher teacher, Courses courses) {
        System.out.println("FirstName: " + teacher.getFirstName() + "LastName: " + teacher.getLastName() + "\n" +
                "Age: " + teacher.getAge() + "\n" +"Gender: " +teacher.getPersonGender()+ "\n" + "StaffId: " + teacher.getStaffId() + "\n" + "Courses taught: " +
                teacher.getTeacherCourses() + "\n"+ "Attendance: " + teacher.getStaffAttendance());
    }

    @Override
    public void displayTeacher(Teacher teacher) {
        System.out.println("FirstName: " + teacher.getFirstName() + "\n" + "LastName: " + teacher.getLastName() + "\n" +
                "Age: " + teacher.getAge() + "\n" +"Gender: " +teacher.getPersonGender()+ "\n" + "StaffId: " + teacher.getStaffId() + "\n" + "Courses taught: " +
                teacher.getTeacherCourses() + "\n"+ "Attendance: " + teacher.getStaffAttendance());
    }
}
