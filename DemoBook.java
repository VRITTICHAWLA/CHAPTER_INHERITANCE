class Book
{
    String title;
    int noofpages;
    public void setTitle(String s)
    {
        title=s;
    }
    public void setNoOfPages(int n)
    {
        noofpages=n;
    }
    public String getTitle()
    {
        return title;
    }
    public int getNoOfPages()
    {
        return noofpages;
    }
}
class TextBook extends Book
{
    String gradelevel;
    public void setGradeLevel(String g)
    {
        gradelevel=g;
    }
    public String getGradeLevel()
    {
        return gradelevel;
    }
}



public class DemoBook {
    public static void main(String[] args) {
        
        TextBook b=new TextBook();
        b.setTitle("mehula");
        b.setNoOfPages(400);
        b.setGradeLevel("religious");
       System.out.println("Textbook Name: "+b.getTitle());
       System.out.println("No of pages: "+b.getNoOfPages());
       System.out.println("Grade Level: "+b.getGradeLevel());
    }
    
}
