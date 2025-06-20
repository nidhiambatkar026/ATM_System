import java.util.*;
class Account_AIML{
    private int CNo;
    private int b;

    double CB = 2000;

    void set_Customer_Number(int a){
       CNo = a;//setter method(the value is assigned)
    }
    void set_PIN_Number(int b){
        this.b = b;
    }
    int get_Customer_Number(){
        return CNo;
    }
    int get_PIN_Number(){
        return b;
    }
    void getCurrentBalance(){
       System.out.println("Current account Balance: " + CB);
    }
}
class Option_Menu_AIML extends Account_AIML{
    Scanner sc = new Scanner(System.in);
    HashMap<Integer,Integer> data =new HashMap();
    
    void get_Login(){
       
      do{
        try {
       data.put(11111, 111);
       data.put(11112, 222);
       data.put(11113, 333);
       data.put(11114, 444);
       data.put(11115, 555);
       data.put(11116, 666);
       data.put(11117, 777);
       data.put(11118, 888);
       data.put(11119, 999);
       data.put(11110, 101);

       System.out.println("Welcome To the ATM");
       System.out.print("\nEnter the Customer Number : ");
       set_Customer_Number(sc.nextInt());
       System.out.print("\nEnter the PIN Number : ");
       set_PIN_Number(sc.nextInt());

       int P= get_Customer_Number();
       int Q= get_PIN_Number();

       if(data.containsKey(P) && data.get(P)==Q){
          get_Account_Type();
       }
       else{
          System.out.println("Incorrect Customer Number or PIN Number");
       }
      } catch (InputMismatchException obj) {
        System.out.println("\nPlease Enter only Numbers");
        System.out.println("Characters and Symbols are not allowed");
        sc.next();
        get_Login();
      }
      }while(true);
    }


    void get_Account_Type(){
      System.out.println("\nSelect the Account type you want to access: ");
      System.out.println("\nType 1: Current Account");
      System.out.println("Type 2: Saving Account");
      System.out.println("Type 3: Exit");
      System.out.println("\nChoice: ");
      Scanner sc = new Scanner(System.in);
      int Ch = sc.nextInt();
      switch (Ch) {
        case 1:
            getCurrent();
            System.out.println("Current Account");
            break;

        case 2: 
            getSaving();
            System.out.println("Savings Account");
            break;

        case 3: 
            System.out.println("\nThank you for Visiting");
            System.out.println("Visit Again");
            break;
      
        default:
            System.out.println("Invalid Choice");
            System.out.println("Please Enter the Valid Choice: ");
            get_Account_Type();
            break;
      }
    }
    void getCurrent(){
        System.out.println("\nCURRENT ACCOUNT");
        System.out.println("\nType 1: Check Balance");
        System.out.println("\nType 2: Withdraw Money");
        System.out.println("\nType 3: Deposit Money");
        System.out.println("\nExit");
        System.out.print("\nChoice : ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                getCurrentBalance();
                break;

            case 2: 
                System.out.println("Withdraw Money");
                break;

            case 3: 
                System.out.println("Deposit Money");
                break;

            case 4:
                System.out.println("\nThank you for Visiting");
                System.out.println("Visit Again");
                break;
        
            default:
                System.out.println("Invalid Choice");
                System.out.println("Please Enter the Valid Choice: ");
                get_Account_Type();
                break;
        }
    }
    void getSaving(){
        System.out.println("\nSAVINGS ACCOUNT");
        System.out.println("\nType 1: Check Balance");
        System.out.println("\nType 2: Withdraw Money");
        System.out.println("\nType 3: Deposit Money");
        System.out.println("\nExit");
        System.out.print("\nChoice : ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                getCurrentBalance();
                break;

            case 2: 
                System.out.println("Withdraw Money");
                break;

            case 3: 
                System.out.println("Deposit Money");
                break;

            case 4:
                System.out.println("\nThank you for Visiting");
                System.out.println("Visit Again");
                break;
        
            default:
                System.out.println("Invalid Choice");
                System.out.println("Please Enter the Valid Choice: ");
                get_Account_Type();
                break;
        }
    }
}
public class ATM_aiml extends Option_Menu_AIML{
    public static void main(String args[]){
        Option_Menu_AIML obj = new Option_Menu_AIML();

        obj.get_Login();
    }
}