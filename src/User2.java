
class User2 {
    private int year;
    private int profit;
    private int loss;
    private int yeargain;
    private int yearloss;

    
    public User2 (int year, int profit, int loss, int yeargain, int yearloss)
    {
    this.year=year;
    this.profit=profit;
    this.loss=loss; 
    this.yeargain=yeargain;
    this.yearloss=yearloss;
    }
    public int getyear()
    {
        return year;
    }
    public int getprofit()
    {
    return profit;
    }
    public int getloss()
    {
        return loss;
    }
    public int getyeargain(){
        return yeargain;
    }
    public int getyearloss(){
        return yearloss;
    }
}
