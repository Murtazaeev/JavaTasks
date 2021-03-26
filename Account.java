public class Account {
    private String id;
    private int balance;

    Account(String id, int balance){
        this.id = id;
        this.balance = balance;
    }

    int getBalance(){
        return this.balance;
    }

    public String toString(){
        return "(" + this.id + ":" + this.balance + ")";
    }
}
