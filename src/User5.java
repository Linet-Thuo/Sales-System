
import java.sql.Time;
import java.util.Date;

class User5 {
    private String attid;
    private String password;
    private String name;
    private Date dob;
    private String address; 
    private int phonenumber;
    private String email;
    private int salary;
    
    public User5 (String attid, String password, String name, Date dob,
            String address, int phonenumber, String email, int salary)
    {
    this.attid=attid;
    this.password=password;
    this.name=name;
    this.dob=dob;
    this.address=address;
    this.phonenumber=phonenumber;
    this.email=email;
    this.salary=salary;
    
    }
    
    public String getattid()
    {
    return attid;
    }
    public String getpassword()
    {
    return password;
    }
    public String getname()
    {
    return name;
    }
    public Date getdob()
    {
        return dob;
    }    
    public String getaddress()
    {
    return address;
    }
    public int getphonenumber()
    {
        return phonenumber;
    }
    public String getemail()
    {
        return email;
    }        
    public int getsalary()
    {
    return salary;
    }
    
}
