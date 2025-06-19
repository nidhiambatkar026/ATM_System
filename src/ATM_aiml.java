import java.util.*;
class Account_AIML{
    private int CNo;
    void set_Customer_Number(int a){
       CNo = a;
       System.out.println(CNo);
    }
}
class Option_Menu_AIML extends Account_AIML{
    Scanner sc = new Scanner(System.in);
    void get_Login(){
       System.out.println("Welcome To the ATM");
       System.out.println("Enter the Customer Number: ");
       
       set_Customer_Number(sc.nextInt());

    }
}


public class ATM_aiml extends Option_Menu_AIML{
    public static void main(String args[]){
        Option_Menu_AIML obj = new Option_Menu_AIML();

        obj.get_Login();
    }
}