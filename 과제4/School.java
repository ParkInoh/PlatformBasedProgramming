public class School {
    private String name;
    private int limit;

    private Student[] students;
    private int studentCount;

    public School(String name, int limit) {
        this.name = name;
        this.limit = limit;
        this.students = new Student[limit];
    }

    @Override
    public String toString() {
        String msg = "School Name: " + name + " Student Count: " + studentCount + "\n";
        for (int i = 0; i < studentCount; i++)
            msg += "\t" + students[i] + "\n";
        return msg;
    }

    public Student findStudent(String name, int year) {
        Student tempStudent = new Student(name, year);
        for (int i = 0; i < studentCount; i++)
            if (students[i].hashCode() == tempStudent.hashCode())
                return students[i];
        return null;
    }

    public void addStudent(Student student) {
        if (studentCount < limit)
        students[studentCount++] = student;
    }

    public void removeAllStudent() {
        students = null;
        studentCount = 0;
    }
}
