package kasidate.Rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle a = new Rectangle(210,3645);
        Rectangle b = new Rectangle(104,140);
        Rectangle c = new Rectangle(94,150);
        System.out.println(a.getArea());
        System.out.println(a.getPerimeter());
        System.out.println(b.getArea());
        System.out.println(b.getPerimeter());
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
    }
}
