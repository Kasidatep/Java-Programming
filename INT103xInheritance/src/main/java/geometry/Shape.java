package geometry;

public abstract class Shape implements Measurable, Drawable {
    private static final String DEFAULT_COLOR = "BLACK";
    public String color;
    
    public Shape(String color){
        setColor(color);
    }
    
    @Override
    public void setColor(String color){
        this.color = color == null || color.isBlank() ? DEFAULT_COLOR : color;
    }

    @Override
    public String getColor() {
        return color;
    }
    
}



