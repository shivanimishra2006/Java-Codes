package Constructors_in_java;

import java.util.Scanner;

class StudentArr {
    String name;
    int marks;

    StudentArr(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class MainArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine();

        StudentArr[] stu = new StudentArr[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of student " + (i + 1) + ":");
            String name = sc.nextLine();

            System.out.println("Enter marks of student " + (i + 1) + ":");
            int marks = sc.nextInt();
            sc.nextLine(); // ✅ clear buffer again

            stu[i] = new StudentArr(name, marks);
        }

        for (int i = 0; i < n; i++) {
            total += stu[i].marks;
        }

        double avg = total / n;
        System.out.println("Average marks of students: " + avg);

    }
}