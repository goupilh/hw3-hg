// Hunter Goupil, November 8, 2026, This program calculates a student's exam average and determines their letter grade.

import java.util.Scanner;

public class GradeTools {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Student name: ");
        String name = scanner.nextLine();

        System.out.print("How many exams (2 or 3)? ");
        int exams = scanner.nextInt();

        if (exams == 2) {

            System.out.print("Score 1: ");
            double score1 = scanner.nextDouble();

            System.out.print("Score 2: ");
            double score2 = scanner.nextDouble();

            double avg = average(score1, score2);

            printReport(name, avg);
        }

        else if (exams == 3) {

            System.out.print("Score 1: ");
            double score1 = scanner.nextDouble();

            System.out.print("Score 2: ");
            double score2 = scanner.nextDouble();

            System.out.print("Score 3: ");
            double score3 = scanner.nextDouble();

            double avg = average(score1, score2, score3);

            printReport(name, avg);
        }

        else {
            System.out.println("Please enter 2 or 3 exams.");
        }

        scanner.close();
    }

    public static double average(double a, double b) {
        return (a + b) / 2;
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static char letterGrade(double score) {

        if (score < 0 || score > 100) {
            return '?';
        }
        else if (score >= 90) {
            return 'A';
        }
        else if (score >= 80) {
            return 'B';
        }
        else if (score >= 70) {
            return 'C';
        }
        else if (score >= 60) {
            return 'D';
        }
        else {
            return 'F';
        }
    }

    public static void printReport(String name, double avg) {
        System.out.printf("%s: average %.1f, grade %c%n",
                name, avg, letterGrade(avg));
    }
}
