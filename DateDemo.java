public class Date
{
    private int d,m,y;

    public Date(){}
    public Date(int d,int m,int y){
        this.d=d;
        this.m=m;
        this.y=y;
    }
    public Date(Date d){
        this.d=d.d;
        this.m=d.m;
        this.y=d.y;
    }
    public void showDate(){
        System.out.println("Date:"+d + "/" + "Month"+m + "/" + "Year"+y);
    }
    public void showDate(char c){
        System.out.println(d+""+c+m+""+c+y);
    }
}
