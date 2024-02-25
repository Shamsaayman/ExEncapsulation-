public class Account {
    private String id ;
    private String name ;
    private int balance = 0 ;


    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int credit){
        this.balance= this.balance + credit;
        return this.balance;
    }
    public int debit(int debit){
        if(checkBalance(debit))
        this.balance= this.balance - debit;
        return this.balance;
    }
    public boolean checkBalance(int n){
        if (n<balance){
            return true;
        }
        return false;
    }
    public  int transferTo(Account a ,int credit){
    if(checkBalance(credit)){
        a.balance= a.balance+credit;
        this.balance=this.balance-credit;
    }
    return a.balance;
    }

}
