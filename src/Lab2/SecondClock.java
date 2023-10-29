package Lab2;

public class SecondClock extends MinuteClock{
    public int second;

    public SecondClock(){
        hour = minute = second = 0;
        name = "emptyName";
        price = 0.0;
    }
    public SecondClock (String _name, double _price, int _hour, int _minute, int _second){
        name = _name;
        price = _price;
        if (_hour < 0 || _hour > 24 || _minute < 0 || _minute > 60 || _second < 0 || _second > 60)
            throw new IllegalArgumentException();
        hour = _hour;
        minute = _minute;
        second = _second;
    }

    public void setSecond(int _second){
        if (_second < 0 || _second > 60)
            throw new IllegalArgumentException();
        second = _second;
    }

    public int getSecond()
    {
        return second;
    }
    @Override
    public String toString()
    {
        return name + " " + price + " " + hour + ":" + minute + ":" + second;
    }
}
