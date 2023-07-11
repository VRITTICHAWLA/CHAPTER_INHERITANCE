class square
{

    float height,width,surfacearea;
    void computeSurfaceArea(float h,float w)//method overriding-method with same name,same parameter,diff class
    {
        height =h;
        width=w;
        surfacearea=height*width;
        System.out.println("Surface area of sqaure: "+surfacearea);
    }
}
    class Cube extends square//method overloading -methods with same name,same class,diff parameter
    {
        float depth;
         void computeSurfaceArea(float d)
    {
      depth=d;

    }
       void computeSurfaceArea(float h,float w)
    {
        height =h;
        width=w;
        surfacearea=height*width*depth;
        System.out.println("Surface area of cube: "+surfacearea);
    }
    
}
    public class DemoSqaure {
    public static void main(String[] args) {
        
        square s=new square();
        Cube c=new Cube();
        s.computeSurfaceArea(12,3);
        c.computeSurfaceArea(3);
        c.computeSurfaceArea(12,3);


    
}
    }
