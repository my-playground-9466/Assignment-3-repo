import java.util.Scanner;

public class Assignment3 {

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

                                        double total =marks1+marks2+marks3;
                                        double avg = total/3;


                                        System.out.printf("Name : %s%s%s \n", "\033[34;1m",name.toUpperCase(),"\033[0;0m");
                                        System.out.printf("Age : %s years old",age);
                                        System.out.println();

                                        if(avg>=75){
                                            System.out.printf("Status : %s%s%s \n", "\033[34;1m","Distinguished Pass(DP)".toUpperCase(),"\033[0;0m");

                                        }else if(avg>=65 && avg<75){
                                            System.out.printf("Status : %s%s%s\n", "\033[32;1m","Credit Pass(CP)".toUpperCase(),"\033[0;0m");

                                        }else if(avg>=55 && avg <65){
                                            System.out.printf("Status : %s%s%s \n", "\033[33;1m","Pass(P)".toUpperCase(),"\033[0;0m");
                                        }else{
                                            System.out.printf("Status : %s%s%s \n", "\033[31;1m","Fail(F)".toUpperCase(),"\033[0;0m");
                                        }

                                        System.out.printf("Total : %.2f \n",total);
                                        System.out.printf("Avg : %.2f \n",avg);

                                        System.out.printf("%s+%s+%s \n","-".repeat(10),"-".repeat(10),"-".repeat(15));
                                        System.out.printf("%10s|%10s|%10s \n","Subject","Marks","Status");
                                        System.out.printf("%s+%s+%s \n","-".repeat(10),"-".repeat(10),"-".repeat(15));

                                    
                                        if(marks1>=75){

                                            System.out.printf("%10s|%10.2f|%s%15s%s \n",sub1,marks1,"\033[34;1m","Distinguished Pass(DP)".toUpperCase(),"\033[0;0m");

                                        }else if(marks1>=65){
                                            System.out.printf("%10s|%10.2f|%s%15s%s \n",sub1,marks1,"\033[32;1m","Credit Pass(CP)".toUpperCase(),"\033[0;0m");

                                        }else if(marks1>=55 && marks1 <65){
                                            System.out.printf("%10s|%10.2f|%s%15s%s \n",sub1,marks1,"\033[33;1m","Pass(P)".toUpperCase(),"\033[0;0m");
                                        }else {
                                            System.out.printf("%10s|%10.2f|%s%15s%s \n",sub1,marks1,"\033[31;1m","Fail(F)".toUpperCase(),"\033[0;0m");

                                        }
                                        System.out.println();

                                        if(marks2>=75){
                                            System.out.printf("%10s|%10.2f|%s%15s%s \n",sub2,marks2,"\033[34;1m","Distinguished Pass(DP)".toUpperCase(),"\033[0;0m");

                                        }else if(marks2>=65 && marks1<75){
                                            System.out.printf("%10s|%10.2f|%s%15s%s \n",sub2,marks2,"\033[32;1m","Credit Pass(CP)".toUpperCase(),"\033[0;0m");

                                        }else if(marks2>=55 && marks1 <65){
                                            System.out.printf("%10s|%10.2f|%s%15s%s \n",sub2,marks2,"\033[33;1m","Pass(P)".toUpperCase(),"\033[0;0m");
                                        }else {
                                            System.out.printf("%10s|%10.2f|%s%15s%s \n",sub2,marks2,"\033[31;1m","Fail(F)".toUpperCase(),"\033[0;0m");

                                        }
                                        System.out.println();

                                        if(marks3>=75){
                                            System.out.printf("%10s|%10.2f|%s%15s%s \n",sub3,marks3,"\033[34;1m","Distinguished Pass(DP)".toUpperCase(),"\033[0;0m");

                                        }else if(marks3>=65 && marks1<75){
                                            System.out.printf("%10s|%10.2f|%s%15s%s \n",sub3,marks3,"\033[32;1m","Credit Pass(CP)".toUpperCase(),"\033[0;0m");

                                        }else if(marks3>=55 && marks3<65){
                                            System.out.printf("%10s|%10.2f|%s%15s%s \n",sub3,marks3,"\033[33;1m","Pass(P)".toUpperCase(),"\033[0;0m");
                                        }else {
                                            System.out.printf("%10s|%10.2f|%s%15s%s \n",sub3,marks3,"\033[31;1m","Fail(F)".toUpperCase(),"\033[0;0m");
                                        }

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
