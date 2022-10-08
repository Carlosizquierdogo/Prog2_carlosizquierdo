import java.util.Scanner;
public class Example15 {
    public static void main(String[] argv) {
        int grade;
        System.out.println("Enter your second value:");
        Scanner inputgrade;
        inputgrade = new Scanner(System.in);
        grade = inputgrade.nextInt();
        {
            if (grade >= 0 && grade < 3) {
                System.out.println("Muy Deficiente");
            }
            if (grade >=3 && grade < 5) {
                System.out.println("INSUFICIENTE");
            }
            if (grade == 5 ) {
                System.out.println("SUFICIENTE");
            }
            if (grade ==6 ) {
                System.out.println("BIEN");
            }
            if (grade >= 7  && grade < 9 ){
                System.out.println("NOTABLE");
            }
            else if (grade >= 9 && grade <= 10) {
                System.out.println("SOBRESALIENTE");
            }
        }
    }
}






