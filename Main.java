public class Main {
    public static void main(String[] args) {
        // Question 1
        System.out.println("Hello World");


        // Question 2
        System.out.println("Y.D.T.P.Premarathne");
        System.out.println("BSc (Hons) In Software Engineering");


        // Question 3
        for (int i = 0; i < 5; i++) {
            System.out.println("Executing Loop " + i);
        }

        int i = 0;
        while (i < 5) {
            System.out.println("Executing Loop " + i);
            i++;
        }


        // Question 4
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.println(x);
        }
        System.out.println("I'm out of the Loop now");

        for (int x : numbers) {
            if (x == 30) {
                continue;
            }
            System.out.println(x);
        }
        System.out.println("I'm out of the Loop now");


        // Question 5
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);

        if (grade == 'A') {
            System.out.println("Excellent!");
        } else if (grade == 'D') {
            System.out.println("You passed");
        } else if (grade == 'F') {
            System.out.println("Better try again");
        } else {
            System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);


        // Question 6
        int[] numbersArray = {10, 20, 30, 40, 50};
        for (int x : numbersArray) {
            System.out.print(x + ",");
        }
        System.out.println();
        String[] namesArray = {"Lakshan", "Charith", "Ravindu", "Sandun"};
        for (String name : namesArray) {
            System.out.print(name + ",");
        }
    }
}