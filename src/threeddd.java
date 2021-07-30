public class threeddd {
    public static abstract class Shape{
        protected
        double length,breadth,height,radius;
        public
        abstract void surfaceArea();
        abstract void volume();
    }
    public static class Parallelepiped extends Shape{
        Parallelepiped(double l,double b,double h){
            this.height=h;
            this.length=l;
            this.breadth=b;
        }
        @Override
        public void surfaceArea() {
            double sa = 2*((this.length*this.breadth)+(this.breadth*this.height)+(this.height*this.length));
            System.out.println("Surface Area of Parallelepiped : "+String.format("%.2f",sa)+" sq unit");
        }
        @Override
        void volume() {
            double v = this.length*this.breadth*this.height;
            System.out.println("Volume of Parallelepiped : "+String.format("%.2f",v)+" cubic unit");
        }
    }
    public static class Sphere extends Shape{
        Sphere(double r){
            this.radius=r;
        }
        @Override
        public void surfaceArea() {
            double sa = 4*Math.PI*this.radius*this.radius;
            System.out.println("Surface Area of Sphere : "+String.format("%.2f",sa)+" sq unit");
        }
        @Override
        void volume() {
            double v = (4*Math.PI*this.radius*this.radius*this.radius)/3;
            System.out.println("Volume of Sphere : "+String.format("%.2f",v)+" cubic unit");
        }
    }
    public static class Cylinder extends Shape{
        Cylinder(double r,double h){
            this.radius=r;
            this.height=h;
        }
        @Override
        public void surfaceArea() {
            double sa = (2*Math.PI*this.radius*this.height)+(2*Math.PI*this.radius*this.radius);
            System.out.println("Surface Area of Cylinder : "+String.format("%.2f",sa)+" sq unit");
        }
        @Override
        void volume() {
            double v = Math.PI*this.radius*this.radius*this.height;
            System.out.println("Volume of Cylinder : "+String.format("%.2f",v)+" cubic unit");
        }
    }
    public static void main(String[] args) {
        Parallelepiped p = new Parallelepiped(2,5,8);
        Sphere s = new Sphere(7.12);
        Cylinder c = new Cylinder(5.45,7);
        p.surfaceArea();
        p.volume();
        s.surfaceArea();
        s.volume();
        c.surfaceArea();
        c.volume();
    }
}