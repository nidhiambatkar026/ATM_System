import java.util.*;
class Account_AIML{
    private int CNo;
    private int b;
    void set_Customer_Number(int a){
       CNo = a;
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
}
class Option_Menu_AIML extends Account_AIML{
    Scanner sc = new Scanner(System.in);
    HashMap<Integer,Integer> data =new HashMap();
    void get_Login(){

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
       System.out.println("Enter the Customer Number: ");
       set_Customer_Number(sc.nextInt());
       System.out.println("Enter the PIN Number: ");
       set_PIN_Number(sc.nextInt());

       int P= get_Customer_Number();
       int Q= get_PIN_Number();

       if(data.containsKey(P) && data.get(P)==Q){
          System.out.println("Login Successful");
       }
       else{
          System.out.println("Incorrect Customer Number or PIN Number");
       }

    }
}

public class ATM_aiml extends Option_Menu_AIML{
    public static void main(String args[]){
        Option_Menu_AIML obj = new Option_Menu_AIML();

        obj.get_Login();
    }
}