/*
* <Date.java>
* This class represents a date with a month, day, and year.
* It includes methods to get and set the date components,  
* and display the date in the format MM/DD/YYYY.
*/
//CSIS 212-<WEEK 6>
public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Getter for Month
    public int getMonth() {
        return month;
    }

    // Setter for Month
    public void setMonth(int month) {
        this.month = month;
    }

    // Getter for Day
    public int getDay() {
        return day;
    }

    // Setter for month
    public void setDay(int day) {
        this.day = day;
    }

    // Getter for Year
    public int getYear() {
        return year;
    }

    // Setter for month
    public void setYear(int year) {
        this.year = year;
    }

    // Displays the seperated by forward slashes (/)
    public void displayDate() {
        System.out.printf("%02d/%02d/%04d%n", month, day, year);
    }
}
