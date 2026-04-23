package Constructors_in_java;

class StudentField {
    String name;
    int marks;

    StudentField(String name, int marks) {
        this.name = name;
        if (marks < 0 || marks > 100) {
            this.marks = 0;
        } else {
            this.marks = marks;
        }
    }

    void displayStu() {
        System.out.println("Student Name:" + name);
        System.out.println("Student Marks:" + marks);
    }
}

class FieldStuMain {
    public static void main(String[] aa) {
        StudentField sf1 = new StudentField("Rohan", 90);
        StudentField sf2 = new StudentField("Shayam", 200);

        sf1.displayStu();
        sf2.displayStu();
    }
}
