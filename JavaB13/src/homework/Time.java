package homework;
import java.util.*;
public class Time {
    int names, hour, minute, second, month, year;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public Time(int month, int year) {
        this.month = month;
        this.year = year;

    }

    public Time(int hour, int minute, int second, int month, int year) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.month = month;
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;

    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 24) {
            hour = 0;
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 60) {
            minute = 0;
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 60) {
            second = 0;
        }
        this.second = second;
    }

    public void setMonth(int month) {
        if (month < 0 || month > 12) {
            month = 0;
        }
        this.month = month;
    }

    public void setYear(int year) {
        if (year < 0) {
            year = 0;
        }
        this.year = year;
    }

    public String amPm(int hour) {
        if (hour < 12) {
            return "am";
        }
        return "pm";
    }

    public String season(int month) {
        if (month <= 0 || month > 12) {
            return "No season Found";
        } else if (month < 3 || month == 12) {
            return "winter";
        } else if (month > 2 || month < 6) {
            return "spring";
        } else if (month > 5 || month < 9) {
            return "summer";
        }
        return "fall";
    }
    public String timeInfo(){
        return hour+":"+minute+":"+second;
    }
    public String date(){
        return month+"/"+year;
    }
    public String toString(){
        return hour+":"+minute+":"+second+" - "+month+"/"+year;
    }

}
