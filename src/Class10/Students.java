package Class10;

import java.util.Arrays;

public class Students {
    static String schoolName = "ABC School";
    static String[] offeredCourses = new String[]{"QA", "Web", "PM"};
    static double[] feesCourses = new double[]{1000.0D, 2000.0D, 3000.0D};
    static int totalStudents = 0;
    String studentName = "N/A";
    String studentEnrolledCourse;
    int studentId;
    String studentAddress;
    double studentFeeBalance;

    public Students() {
    }

    public void enrollStudent(String name, String addr, String course) {
        boolean isCourseAvailable = false;

        for(int i = 0; i < offeredCourses.length; ++i) {
            if (offeredCourses[i].equalsIgnoreCase(course)) {
                ++totalStudents;
                this.studentId = totalStudents;
                isCourseAvailable = true;
                this.studentName = name;
                this.studentEnrolledCourse = offeredCourses[i];
                this.studentFeeBalance = feesCourses[i];
                this.studentAddress = addr;
                break;
            }
        }

        if (isCourseAvailable) {
            System.out.println("Enrollment done successfully. Student id -> " + this.studentId);
        } else {
            System.out.println("Requested course " + course + " is not available in the school");
        }

    }

    public void enrollStudent(String name, String course) {
        boolean isCourseAvailable = false;

        for(int i = 0; i < offeredCourses.length; ++i) {
            if (offeredCourses[i].equalsIgnoreCase(course)) {
                ++totalStudents;
                this.studentId = totalStudents;
                isCourseAvailable = true;
                this.studentName = name;
                this.studentEnrolledCourse = offeredCourses[i];
                this.studentFeeBalance = feesCourses[i];
                break;
            }
        }

        if (isCourseAvailable) {
            System.out.println("Enrollment done successfully. Student id -> " + this.studentId);
        } else {
            System.out.println("Requested course " + course + " is not available in the school");
        }

    }

    public void enrollStudent(String name, String addr, String phone, String course) {
        boolean isCourseAvailable = false;

        for(int i = 0; i < offeredCourses.length; ++i) {
            if (offeredCourses[i].equalsIgnoreCase(course)) {
                ++totalStudents;
                this.studentId = totalStudents;
                isCourseAvailable = true;
                this.studentName = name;
                this.studentEnrolledCourse = offeredCourses[i];
                this.studentFeeBalance = feesCourses[i];
                break;
            }
        }

        if (isCourseAvailable) {
            System.out.println("Enrollment done successfully. Student id -> " + this.studentId);
        } else {
            System.out.println("Requested course " + course + " is not available in the school");
        }

    }

    public void displayStudentProfile() {
        System.out.println("Student profile \nStudent id: " + this.studentId + "\nStudent name: " + this.studentName + "\nStudent course: " + this.studentEnrolledCourse + "\n\n");
    }

    public static void schoolSummary() {
        System.out.println("School Name--> " + schoolName + "\nCourses offered: " + Arrays.toString(offeredCourses) + "\nTotal number of Student: " + totalStudents);
    }



}


