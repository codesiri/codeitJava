// 접근 제어자 연습

public class BankDriver01 {
    public static void main(String[] args) {
        // 사람 선언
        Person01 p1 = new Person01();
        p1.setName("김신의");
        p1.setAge(28);
        p1.setCashAmount(30000);

        // 은행 계좌 생성
        BankAccount01 a1 = new BankAccount01();
        a1.setBalance(10000);

        p1.setAccount(a1);
        a1.setOwner(p1);

        Person01 p2 = new Person01();
        p2.setName("김성실");
        p2.setAge(29);
        p2.setCashAmount(100000);

        BankAccount01 a2 = new BankAccount01();
        a2.setBalance(500000);

        p2.setAccount(a2);
        a2.setOwner(p2);

        System.out.println(a2.deposit(30000));
        System.out.println(a2.withdraw(170000));
        System.out.println(a2.deposit(300000));
        System.out.println(a2.withdraw(450000));


    }
}
