class User3 {
    private String item;
    private int quantity;
    private int cost; 
    private String month;   
    private int year;
    
    public User3 (String item, int quantity, int cost, String month, int year)
    {
    this.item=item;
    this.quantity=quantity;
    this.cost=cost;
    this.month=month;
    this.year=year;
    
    }
    
    public String getitem()
    {
    return item;
    }
    public int getquantity()
    {
    return quantity;
    }
    public int getcost()
    {
        return cost;
    }
    public String getmonth()
    {
    return month;
    }      
    public int getyear()
    {
        return year;
    }

}
