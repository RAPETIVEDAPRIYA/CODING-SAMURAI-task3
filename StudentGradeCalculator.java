import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input grades for different components
        System.out.print("Assignments grade: ");
        double assignmentsGrade = scanner.nextDouble();
        
        System.out.print("Quizzes grade: ");
        double quizzesGrade = scanner.nextDouble();
        
        System.out.print("Midterm exam grade: ");
        double midtermExamGrade = scanner.nextDouble();
        
        System.out.print("Final exam grade: ");
        double finalExamGrade = scanner.nextDouble();
        
        // Calculate the overall course grade
        double overallGrade = calculateOverallGrade(assignmentsGrade, quizzesGrade, midtermExamGrade, finalExamGrade);
        
        // Display the final course grade
        System.out.println("Your overall course grade is: " + overallGrade);
        
        // Determine and display the letter grade
        String letterGrade = determineLetterGrade(overallGrade);
        System.out.println("Your letter grade is: " + letterGrade);
        
        scanner.close();
    }
    
    // Function to calculate the overall course grade
    public static double calculateOverallGrade(double assignments, double quizzes, double midterm, double finalExam) {
        // You can use weighted averages for different components if needed
        // For example, assignments might be worth 30%, quizzes 20%, midterm 25%, and final exam 25%
        double overallGrade = (0.3 * assignments) + (0.2 * quizzes) + (0.25 * midterm) + (0.25 * finalExam);
        return overallGrade;
    }
    
    // Function to determine the letter grade based on the overall grade
    public static String determineLetterGrade(double overallGrade) {
        // Define your grading scale with corresponding grade ranges and letter grades
        // For example: A (90-100), B (80-89), C (70-79), D (60-69), F (0-59)
        if (overallGrade >= 90) {
            return "A";
        } else if (overallGrade >= 80) {
            return "B";
        } else if (overallGrade >= 70) {
            return "C";
        } else if (overallGrade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}