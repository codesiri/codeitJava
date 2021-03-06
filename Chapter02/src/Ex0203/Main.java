package Ex0203;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("김신의");
        p1.setAge(28);
        p1.setCashAmount(30000);

        BankAccount a1 = new BankAccount();
        a1.setBalance(100000);

        p1.setAccount(a1);
        a1.setOwner(p1);

        Person p2 = new Person();
        p2.setName("김성실");
        p2.setAge(29);
        p2.setCashAmount(100000);

        BankAccount a2 = new BankAccount();
        a2.setBalance(500000);

        p2.setAccount(a2);
        a2.setOwner(p2);

        System.out.println(a2.deposit(30000));
        System.out.println(a2.withdraw(170000));
        System.out.println(a2.deposit(500000));
        System.out.println(a2.withdraw(970000));
    }
}
