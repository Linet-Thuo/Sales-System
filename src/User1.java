class User1 {
    private String month;
    private int year;
    private int sales; 
    private int purchases;
    private int profit;
    private int loss;
    
    public User1 (String month, int year, int sales, int purchases, int profit, int loss)
    {
    this.month=month;
    this.year=year;
    this.sales=sales;
    this.purchases=purchases;
    this.profit=profit;
    this.loss=loss;    
    }
    
    public String getmonth()
    {
    return month;
    }
    public int getyear()
    {
    return year;
    }
    public int getsales()
    {
        return sales;
    }
    public int getpurchases()
    {
    return purchases;
    }      
    public int getprofit()
    {
        return profit;
    }      
    public int getloss()
    {
        return loss;
    }

}
