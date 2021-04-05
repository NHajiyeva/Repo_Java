package Class10;

public class School {
    public School() {
    }

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.enrollStudent("Happy", "NY", "PM");
        Students s2 = new Students();
        s2.enrollStudent("Happy", "NY", "qa");
        s1.displayStudentProfile();
        Students s3 = new Students();
        s3.enrollStudent("Fun", "FL", "web");
        s3.displayStudentProfile();
        s2.displayStudentProfile();
        Students s4 = new Students();
        s4.enrollStudent("King", "qa");
    }
}

