import java.util.*;

public class ebill{
    int Cno;
    String Cname;
    double pmr,cmr,units;
    double tbill;
    char TC;
    String connection;
    Scanner sc = new Scanner(System.in);
    void getdata(){
        System.out.println("Enter the Customer Name");
        Cname = sc.nextLine();
        System.out.println("Enter the previous meter reading");
        pmr = sc.nextInt();
        System.out.println("enter the current meter reading");
        cmr = sc.nextInt();
        System.out.println("enter the type of connection");
        TC= sc.next().charAt(0);
        if (TC=='d'){
            connection= "domestic";
        }
        else if(TC== 'c'){
            connection= "commercial";
        }
    }
    void calculate(){
        units= cmr-pmr;
        if(TC=='d'){
            if(units<100){
                tbill= units*1;
            }
            else if(units>100 && units<200){
                tbill = (100*1) + ((units-100)*2.5);
            }
            else if(units>200 && units<500){
                tbill = (100*1) + ((100)*2.5)+((units-200)*4);
            }
            else {
                tbill = (100*1) + ((100)*2.5)+((300)*4)+((units-500)*6);
            }
        }
        else if(TC=='c'){
            if(units<100){
                tbill= units*2;                                                                                                                                                
            }
            else if(units>100 && units<200){
                tbill = (100*2) + ((units-100)*4.5);
            }
            else if(units>200 && units<500){
                tbill = (100*2) + ((100)*4.5)+((units-200)*6);
            }
            else {
                tbill = (100*2) + ((100)*4.5)+((300)*6)+((units-500)*7);
            }
        }
        else{
            System.out.println("Invalid Option");
            System.exit(0);
        }
    }
    void display(){
        System.out.println("The customer name is "+Cname+" units :"+units+"Type of connection: "+connection+" Total ammount is: "+tbill);
    }
    public static void main(String[]args){
        ebill c = new ebill();
        c.getdata();
        c.calculate();
        c.display();
    }

}