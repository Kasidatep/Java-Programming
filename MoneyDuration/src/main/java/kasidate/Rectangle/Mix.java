package kasidate.Rectangle;

    public class Mix {
        private double width;
        private double height;

        public Mix(double width, double height){
            this.width = width;
            this.height = height;
        }

        public double getArea(){
            double area = width*height;
            return area;
        }

        public double getPerimeter(){
            double perimeter = 2*(width+height);
            return perimeter;
        }
    }

    class Test {
    public static void main(String[] args) {
        Mix a = new Mix(210,3645);
        Mix b = new Mix(104,140);
        Mix c = new Mix(94,150);
        System.out.println("a.getArea()");
        System.out.println(a.getArea());
        System.out.println(a.getPerimeter());
        System.out.println(b.getArea());
        System.out.println(b.getPerimeter());
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
    }
}


