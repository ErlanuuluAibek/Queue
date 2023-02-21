import java.util.*;



public class Main {
    public static void main(String[] args) {
        User user=new User("Aibek","Erlan uulu");
        User user2=new User("Aibek","Erlan uulu");
        User user3=new User("Aibek","Erlan uulu");
        User user4=new User("Aibek","Erlan uulu");
        User user5=new User("Aibek","Erlan uulu");
        User user6=new User("Aibek","Erlan uulu");
        User user7=new User("Aibek","Erlan uulu");
        User user8=new User("Aibek","Erlan uulu");
        User user9=new User("Aibek","Erlan uulu");
        User user10=new User("Aibek","Erlan uulu");
        BankAccount bankAccount=new BankAccount(2000);
        BankAccount bankAccount2=new BankAccount(1500);
        BankAccount bankAccount3=new BankAccount(200);
        BankAccount bankAccount4=new BankAccount(20000);
        BankAccount bankAccount5=new BankAccount(1222);
        BankAccount bankAccount6=new BankAccount(2332);
        BankAccount bankAccount7=new BankAccount(24322);
        BankAccount bankAccount8=new BankAccount(2342);
        BankAccount bankAccount9=new BankAccount(2313);
        BankAccount bankAccount10=new BankAccount(2029);
        Map<User,BankAccount>Bank=new HashMap<>();

        Bank.put(user,bankAccount);
        Bank.put(user2,bankAccount3);
        Bank.put(user3,bankAccount4);
        Bank.put(user4,bankAccount5);
        Bank.put(user5,bankAccount6);
        Bank.put(user6,bankAccount7);
        Bank.put(user7,bankAccount8);
        Bank.put(user8,bankAccount9);
        Bank.put(user9,bankAccount10);
        Bank.put(user10,bankAccount2);
        transaction(Bank,user4,200);

    }
    public static void transaction(Map<User,BankAccount>bank,User user,int summa){
        BankAccount bankAccount=new BankAccount(summa);
        bank.put(user,bankAccount);
        System.out.println(bank.get(user));
    }
}