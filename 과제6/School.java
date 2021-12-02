package edu.pnu.admin;

import edu.pnu.collection.GenericList;

public class School {
    private final String name;
    private GenericList<Student> students = new GenericList<Student>();
    private int studentCount = 0;

    public School(String name, int limit) {
        this.name = name;
        students.setSize(limit);
    }

    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder("School Name: " + name + " Student Count: " + studentCount + "\n");
        for (int i = 0; i < studentCount; i++)
            msg.append(students.getData()[i]+"\n");
        return msg.toString();
    }

    public Student findStudent(String name, int year) {
        Student tempStudent = new Student(name, year);
        for (int i = 0; i < studentCount; i++)
            if (students.getData()[i].hashCode() == tempStudent.hashCode())
                return (Student) students.getData()[i];
        return null;
    }

    public void addStudent(Student student) {
        if (studentCount < students.getSize()) {
            students.getData()[studentCount] = student;
            studentCount++;
        }
    }

    public void removeAllStudent() {
        students = null;
        studentCount = 0;
    }

    // Student Student Student Student Student
    // Student Student Student Student Student
    // Student Student Student Student Student 
}
