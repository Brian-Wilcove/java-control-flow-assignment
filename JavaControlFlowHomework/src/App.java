import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double recentGrade = 0;
        double total = 0;
        double numberOfGrades = 0;
        
        while (recentGrade >= 0){
            System.out.println("Enter a Grade");
            recentGrade = input.nextDouble();
            if(recentGrade > 100){
                System.out.println("You can't get a grade over 100!");
            } else if(recentGrade < 0){
                System.out.println("Calculating Grade");
            } else {
                total = total + recentGrade;
                numberOfGrades++;
            }
        }
        input.close();
        double averageGrade = total/numberOfGrades;
        System.out.println("Average Grade: " + averageGrade);
        if(averageGrade>90){
            System.out.println("Excellent Work!");
        }else if(averageGrade > 80){
            System.out.println("Good Job!");
        }else if(averageGrade > 70){
            System.out.println("Keep it up!");
        }else {
            System.out.println("Let's work hard to get those Grades up!");
        }
    }
}
