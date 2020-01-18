
import java.sql.Time;
import java.util.Date;

class User4 {
    private String name;
    private int quantity;
    private int cost; 
    private int total;
    private Date date;
    private String month; 
    private Time time;
    private int year;
    private String attendant;
    
    public User4 (String name, int quantity, int cost, int total, Date date, String month, Time time, int year, String attendant)
    {
    this.name=name;
    this.quantity=quantity;
    this.cost=cost;
    this.total=total;
    this.date=date;
    this.month=month;
    this.time=time;
    this.year=year;
    this.attendant=attendant;
    
    }
    
    public String getname()
    {
    return name;
    }
    public int getquantity()
    {
    return quantity;
    }
    public int getcost()
    {
        return cost;
    }
    public int gettotal()
    {
        return total;
    }
    public Date getdate()
    {
        return date;
    }    
    public String getmonth()
    {
    return month;
    }
    public Time gettime()
    {
        return time;
    }
    public int getyear()
    {
        return year;
    }
    public String getattendant()
    {
        return attendant;
    }        

}
