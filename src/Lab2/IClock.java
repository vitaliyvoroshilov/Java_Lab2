package Lab2;

public interface IClock {

    public void setHour(int _hour);
    public void setMinute(int _minute);
    public void setSecond(int _second);

    public String getName();
    public double getPrice();
    public int getHour();
    public int getMinute();
    public int getSecond();
    @Override
    public String toString();
}
