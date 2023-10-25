package Lab2;

public class MinuteClock {
    public int hour, minute;
    public String name;
    public double price;

    public MinuteClock (){
        hour = minute = 0;
        name = "name";
        price = 0.0;
    }
    public MinuteClock (int _hour, int _minute){
        if (_hour < 0 || _hour > 24 || _minute < 0 || _minute > 60)
            throw new IllegalArgumentException();
        hour = _hour;
        minute = _minute;
        name = "name";
        price = 0.0;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
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
}
