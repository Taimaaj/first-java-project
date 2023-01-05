    import java.util.Date;
    public class Vehicle extends Automobile{  
    public double   length;
    public double   width;
    public String   color;
    
    public void setGearType(GearType gearType) {
        this.gearType = gearType;
    }
    
    public GearType getGearType() {
        return gearType;
    }
    
     public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    }