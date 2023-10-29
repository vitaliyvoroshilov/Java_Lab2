package Lab2;

public class MinuteClock {
    public int hour, minute;
    public String name;
    public double price;

    public MinuteClock (){
        name = "emptyName";
        price = 0.0;
        hour = minute = 0;
    }
    public MinuteClock (String _name, double _price, int _hour, int _minute){
        name = _name;
        price = _price;
        if (_hour < 0 || _hour > 24 || _minute < 0 || _minute > 60)
            throw new IllegalArgumentException();
        hour = _hour;
        minute = _minute;
    }

    public void setHour(int _hour){
        if (_hour < 0 || _hour > 24)
            throw new IllegalArgumentException();
        hour = _hour;
    }
    public void setMinute(int _minute){
        if (_minute < 0 || _minute > 60)
            throw new IllegalArgumentException();
        minute = _minute;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getHour()
    {
        return hour;
    }
    public int getMinute()
    {
        return minute;
    }
    @Override
    public String toString()
    {
        return name + " " + price + " " + hour + ":" + minute;
    }
}