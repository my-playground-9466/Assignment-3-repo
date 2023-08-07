import java.util.Scanner;

public class Demo10 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner scanner2 = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter your name :");
        String name = scanner.nextLine();
        String stripName = name.strip();

        if (stripName.length() > 0) {
            System.out.print("Enter your age:");
            int age = scanner.nextInt();

            if (age >= 10 && age <= 18) {

                System.out.print("Enter your subject 1 :");
                scanner.skip(System.lineSeparator());
                String sub1 = scanner.nextLine();

                if (sub1.startsWith("SE-")) {
                    System.out.print("Enter your Marks 1 :");
                    double marks1 = scanner.nextDouble();

                    if (marks1 <= 100 && marks1 >= 0) {

                        System.out.print("Enter your subject 2 :");
                        scanner.skip(System.lineSeparator());
                        String sub2 = scanner.nextLine();

                        if (sub2.startsWith("SE-") && !sub2.equals(sub1)) {

                            System.out.print("Enter your Marks 2 :");
                            double marks2 = scanner.nextDouble();

                            if (marks1 <= 100 && marks1 >= 0) {

                                System.out.print("Enter your subject 3 :");
                                scanner.skip(System.lineSeparator());
                                String sub3 = scanner.nextLine();

                                if (sub2.startsWith("SE-") && !sub3.equals(sub1) && !sub3.equals(sub2)) {

                                    System.out.print("Enter your Marks 3 :");
                                    double marks3 = scanner.nextDouble();


                                    if(marks1 <= 100 && marks1 >= 0){


                                        System.out.printf("Name : %s%s \n", "\033[34;1m",name);
                                        













                                    }else{
                                      System.out.println("Invalid marks.");  
                                    }








                                } else {
                                    System.out.println("Invalid subject or existing.");
                                }

                            } else {

                                System.out.println("Invalid marks.");

                            }

                        } else {
                            System.out.println("Invalid subject or existing");
                        }

                    } else {
                        System.out.println("Invalid marks.");
                    }

                } else {
                    System.out.println("Invalid Subject.");
                }

            } else {
                System.out.println("Invalid age");
            }

        } else {
            System.out.println("Invalid name");
        }

    }

}
