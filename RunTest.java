package inheritance;

public class RunTest {
    public static void main(String[] args) {
        System.out.println("Parent Class Mobile");
        Mobile m = new Mobile();
        m.startMobile();
        m.enterPin();
        m.unlockMobile();
        m.calltoFriend();
        m.lockMobile();

        System.out.println("Child Class Apple");
        Apple a = new Apple();
        a.startMobile();
        a.enterPin();
        a.unlockMobile();
        a.calltoFriend();
        a.lockMobile();

        System.out.println("Child Class Samsung");
        Samsung s = new Samsung();
        s.startMobile();
        s.enterPin();
        s.unlockMobile();
        s.calltoFriend();
        s.lockMobile();

        System.out.println("Child Class Realme");
        Realme r = new Realme();
        r.startMobile();
        r.enterPin();
        r.unlockMobile();
        r.calltoFriend();
        r.lockMobile();









    }
}

