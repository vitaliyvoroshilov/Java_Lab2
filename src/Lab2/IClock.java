package Lab2;

public interface IClock {

    void setHour(int _hour);
    void setMinute(int _minute);
    void setSecond(int _second);

    String getName();
    double getPrice();
    int getHour();
    int getMinute();
    int getSecond();
    @Override
    public String toString();
}
