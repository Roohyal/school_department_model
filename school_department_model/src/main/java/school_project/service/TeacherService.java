package school_project.service;

import school_project.enums.Courses;
import school_project.model.Teacher;

public interface TeacherService {

    void teachCourse(Teacher teacher, Courses courses);

    void displayTeacher(Teacher teacher);
}
