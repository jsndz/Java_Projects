import java.util.*;
import java.util.Scanner;
class employee{
    String empName,empAddress,mailId;
    int mobileNo,empId;
    double BP,DA,HRA,PF,SF,GP,NP;
    Scanner sc=new Scanner(System.in);
    void getdata(){
        
        System.out.println("Enter the Employee Name");
        empName = sc.nextLine();
         System.out.println("Enter the Employee Address");
        empAddress = sc.nextLine();
         System.out.println("Enter the Employee Mail Id");
        mailId= sc.nextLine();
         System.out.println("Enter the Employee mobile no");
        mobileNo = sc.nextInt();
         System.out.println("Enter the Employee Id");
        empId = sc.nextInt();
        System.out.println("Enter the Employee Basic Pay");
        BP = sc.nextDouble();
    }
}
class professor extends employee{
    void calculate(){
        DA= BP*0.97;
        HRA= BP*0.10;
        PF= BP*0.12;
        SF=BP*0.01;
        GP= BP+DA+HRA+PF;
        NP=GP-PF-SF;
    }
    void display(){
        System.out.println("The Gross pay of employee is :"+GP);
        System.out.println("The Net pay of employee is :"+NP);
    }
}
class associateProfessor extends employee{
    void calculate(){
        DA= BP*0.70;
        HRA= BP*0.10;
        PF= BP*0.12;
        SF=BP*0.01;
        GP= BP+DA+HRA+PF;
        NP=GP-PF-SF;
    }
    void display(){
        System.out.println("The Gross pay of employee is :"+GP);
        System.out.println("The Net pay of employee is :"+NP);
    }
}
class assistantProfessor extends employee{
    void calculate(){
        DA= BP*0.60;
        HRA= BP*0.10;
        PF= BP*0.12;
        SF=BP*0.01;
        GP= BP+DA+HRA+PF;
        NP=GP-PF-SF;
    }
    void display(){
        System.out.println("The Gross pay of employee is :"+GP);
        System.out.println("The Net pay of employee is :"+NP);
    }
}
public class paySlip {
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        System.out.println("1.Professor 2.Associate Professor 3.Assistant Professor");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                professor p1 = new professor();
                p1.getdata();
                p1.calculate();
                p1.display();
                break;
            case 2:
                associateProfessor p2 = new associateProfessor();
                p2.getdata();
                p2.calculate();
                p2.display();
                
                break;
            case 3:
                assistantProfessor p3 = new assistantProfessor();
                p3.getdata();
                p3.calculate();
                p3.display();
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
}
}

