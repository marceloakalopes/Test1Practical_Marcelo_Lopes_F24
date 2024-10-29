package org.q19;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Course> courses = new ArrayList<>();

    public static void run(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("-----------------------");
            System.out.println("1. Add a Course");
            System.out.println("2. Edit a course");
            System.out.println("3. List courses");
            System.out.println("Enter a choice:");
            System.out.println("------------------------");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addCourse(scanner);
                    break;
                case 2:
                    editCourse(scanner);
                    break;
                case 3:
                    listCourses();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addCourse(Scanner scanner) {
        System.out.println("Enter course name:");
        String name = scanner.nextLine();
        System.out.println("Enter course code:");
        String code = scanner.nextLine();
        System.out.println("Enter start date (dd/MM/yyyy):");
        String startDate = scanner.nextLine();
        System.out.println("Enter number of students:");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        Course course = new Course(name, code, startDate, numberOfStudents);
        courses.add(course);
        System.out.println("Course added successfully.");
    }

    private static void editCourse(Scanner scanner) {
        System.out.println("Enter course code to edit:");
        String code = scanner.nextLine();

        for (Course course : courses) {
            if (course.getCode().equals(code)) {
                System.out.println("Enter new course name:");
                course.setName(scanner.nextLine());
                System.out.println("Enter new start date (dd/MM/yyyy):");
                course.setStartDate(scanner.nextLine());
                System.out.println("Enter new number of students:");
                course.setNumberOfStudents(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Course updated successfully.");
                return;
            }
        }
        System.out.println("Course not found.");
    }

    private static void listCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            for (Course course : courses) {
                System.out.println(course);
            }
        }
    }
}