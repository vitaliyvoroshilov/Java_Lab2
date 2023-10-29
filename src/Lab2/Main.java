package Lab2;

public class Main {
    public static void main(String[] args) {

        MinuteClock minClock1 = new MinuteClock("minClock1", 2.0, 23, 59);
        System.out.println(minClock1.toString());
        minClock1.setHour(2);
        minClock1.setMinute(2);
        System.out.println(minClock1.toString());

        System.out.println();

        SecondClock secClock1 = new SecondClock("secClock1", 2.0, 23, 59, 59);
        System.out.println(secClock1.toString());
        secClock1.setHour(2);
        secClock1.setMinute(2);
        secClock1.setSecond(2);
        System.out.println(secClock1.toString());
    }
}
