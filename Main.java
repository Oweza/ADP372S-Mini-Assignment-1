package za.ac.cput.main;

import model.UndergraduateStudent;
import model.GraduateStudent;

public class Main {
    public static void main(String[] args) {

        UndergraduateStudent undergrad =
                new UndergraduateStudent.Builder()
                        .studentId("U123")
                        .name("Alice")
                        .email("alice@university.ac.za")
                        .department("Computer Science")
                        .creditHours(10)
                        .scholarshipAmount(5000)
                        .build();

        GraduateStudent graduate =
                new GraduateStudent.Builder()
                        .studentId("G456")
                        .name("Bob")
                        .email("bob@university.ac.za")
                        .department("Information Systems")
                        .researchAssistant(true)
                        .stipend(8000)
                        .build();

        undergrad.displayStudentDetails();
        graduate.displayStudentDetails();
    }
}
