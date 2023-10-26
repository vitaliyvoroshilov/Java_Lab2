package Lab23;

public class Main {
    public static void main(String[] args) {
        MinuteClock minClock1 = new MinuteClock();
        System.out.println(minClock1.toString());
        minClock1.name = "minClock1";
        minClock1.price = 1.0;
        minClock1.setHour(1);
        minClock1.setMinute(1);
        System.out.println(minClock1.toString());
        System.out.println();

        MinuteClock minClock2 = new MinuteClock(23, 59);
        minClock2.name = "minClock2";
        minClock2.price = 2.0;
        System.out.println(minClock2.toString());
        minClock2.setHour(2);
        minClock2.setMinute(2);
        System.out.println(minClock2.toString());
        System.out.println();

        SecondClock secClock1 = new SecondClock();
        System.out.println(secClock1.toString());
        secClock1.name = "secClock1";
        secClock1.price = 1.0;
        secClock1.setHour(1);
        secClock1.setMinute(1);
        secClock1.setSecond(1);
        System.out.println(secClock1.toString());
        System.out.println();

        SecondClock secClock2 = new SecondClock(23, 59, 59);
        System.out.println(secClock2.toString());
        secClock2.name = "secClock2";
        secClock2.price = 2.0;
        secClock2.setHour(2);
        secClock2.setMinute(2);
        secClock2.setSecond(2);
        System.out.println(secClock2.toString());
        System.out.println();
    }
}
