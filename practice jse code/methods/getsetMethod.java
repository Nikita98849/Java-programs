public class getsetMethod {
    private int no;
    private String name;
    /*public int getNumber()
    {
          return no;
    }
    public String getName()
    {
        return name;
    }*/
    public void setNumber(int no)
    {
        this.no=no;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void disp()
    {
        System.out.println("Name = "+name);
        System.out.println("Numnber = "+no);
    }
    public static void main(String arg[])
    {
        getsetMethod g=new getsetMethod();
        g.setName("Nikita Yadav");
        g.setNumber(40);
        g.disp();
    }

    
}
