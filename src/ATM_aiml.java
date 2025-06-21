import java.util.*;
import java.text.*;

class Account_AIML
{
    Scanner sc = new Scanner(System.in);
    DecimalFormat DF1 = new DecimalFormat("###,##0.00 'Rupee'");
    private int CN;
    private int b;

    double CB=2000;
    double SB=2000;

    void set_Customer_Number(int a)
    {
       CN = a;  
    }
    void set_PIN_Number(int b)
    {
        this.b=b;
    }
    int get_Customer_Number()
    {
        return CN;
    }
    int get_PIN_Number()
    {
        return b;
    }
    void get_CurrentBalanace()
    {
      // System.out.println("Current Account BAlance : " + CB);
         System.out.println("Current Account BAlance : " + DF1.format(CB));
    }
    void get_SavingsBalanace(){
        System.out.println("Savings Account BAlance : " + DF1.format(SB));
    }
    void get_CurrentWithdrawInput(){
        System.out.println("\nCurrent Account BAlance : " + DF1.format(CB));
        System.out.println("Enter the Amount You want to withdraw : ");
        double amount = sc.nextDouble();
        if((CB - amount)>= 0){
           calciCurrentWithdraw(amount);
           System.out.println("\nTranscation Successful");
           System.out.println("Current Account BAlance : " + DF1.format(CB));
        }
        else{
           System.out.println("Insufficient Balance");
        }
    }
    double calciCurrentWithdraw(double amount){
         CB = CB-amount;
         return CB;
    }
    void get_SavingWithdrawInput(){
          System.out.println("Savings Account BAlance : " + DF1.format(SB));
          System.out.println("Enter the Amount You want to withdraw : ");
        double amount = sc.nextDouble();
        if((SB - amount)>= 0){
           calciSavingsWithdraw(amount);
           System.out.println("\nTranscation Successful");
           System.out.println("Saving Account BAlance : " + DF1.format(SB));
        }
        else{
           System.out.println("Insufficient Balance");
        }
    }
    double calciSavingsWithdraw(double amount){
         SB = SB-amount;
         return SB;
    }
}
class Option_Menu_AIML extends Account_AIML
{
    Scanner sc = new Scanner(System.in);
    HashMap<Integer,Integer> data=new HashMap();
    void get_Login()
    {
       do{
        try 
       {
        data.put(1111, 111);
       data.put(1112, 222);
       data.put(1113, 333);
       data.put(1114, 444);
       data.put(1115, 111);

       System.out.println("Welcome To the ATM");
       System.out.print("\nEnter the Customer Number : ");
       set_Customer_Number(sc.nextInt());
       System.out.println("Enter the PIN Number : ");
       set_PIN_Number(sc.nextInt());

       int P= get_Customer_Number();
       int Q= get_PIN_Number();

       if (data.containsKey(P) && data.get(P)==Q) 
       {
      // System.out.println("Login Successfully"); 
      get_AccountType();
       }
       else{
        System.out.println("\nWrong Customer OR PIN Number"); 
       }
       }
       catch(InputMismatchException obj)
       {
         System.out.println("\nPlease Enter only Number");
         System.out.println("Character and Symbol are not allowed: ");
        // break;
        sc.next();
        get_Login();
       }
       }while(true);

    }
    void get_AccountType()
    {
       System.out.println("\nSelect the Account Type you want to Access");
       System.out.println("\nType 1 : Current Account");
       System.out.println("Type 2 : Saving Account");
       System.out.println("Type 3 : Exit");
       System.out.print("\nChoice : ");
       
       int ch=sc.nextInt();


       switch (ch) {
        case 1:
        get_Current();
           // System.out.println("\nCurrent Account");
            break;
       case 2:
       get_Saving();
           // System.out.println(" Saving Account");
            break;
      case 3:
            System.out.println("\nThankYou for Visting");
            System.out.println("Visit Again");
            break;
        default:
        System.out.println("\n Invalid Choice");
        System.out.println("Please Enter The Valid choice");
        get_AccountType();
            break;
       }
    }
    void get_Current()
    {
        System.out.println("\nCurrent Account");
        System.out.println("\nType 1 : View Balance");
        System.out.println("\nType 2 : Withdraw Money");
        System.out.println("\nType 3 : Deposit");
        System.out.println("\nType 4 : Exit");
        System.out.print("\nEnter Your Choice : ");
        int ch =sc.nextInt();

        switch (ch) {
            case 1:
                get_CurrentBalanace();
                get_AccountType();
                break;
            case 2:
                get_CurrentWithdrawInput();
                get_AccountType();
                break;
            case 3:
                
                break;
            case 4:
             System.out.println("\nThankYou for Visting");
             System.out.println("Visit Again");
                break;    
        
            default:
            System.out.println("\n Invalid Choice");
            System.out.println("Please Enter The Valid choice");
            get_Current();
                break;
        }
    }
    void get_Saving()
    {
      System.out.println("\nSaving Account"); 
      System.out.println("\nType 1 : View Balance");
      System.out.println("\nType 2 : Withdraw Money");
      System.out.println("\nType 3 : Deposit");
      System.out.println("\nType 4 : Exit");
      System.out.print("\nEnter Your Choice : "); 

      int ch = sc.nextInt();

      switch (ch) {
        case 1:
            get_SavingsBalanace();
            get_AccountType();
            break;
            case 2:
            get_SavingWithdrawInput();
            get_AccountType();
            break;
            case 3:
            
            break;
            case 4:
             System.out.println("\nThankYou for Visting");
             System.out.println("Visit Again");
             break;    
        
            default:
            System.out.println("\n Invalid Choice");
            System.out.println("Please Enter The Valid choice");
            get_Saving();
            break;
      }
    }

}

public class ATM_aiml extends Option_Menu_AIML
{
    public static void main(String args[]){
        Option_Menu_AIML obj = new Option_Menu_AIML();

        obj.get_Login();
    }
}