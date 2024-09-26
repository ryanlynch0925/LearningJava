/*
* <Rectangle.java>
* This class represents a rectangle with attributes for length and width.
* It provides methods to set and get the dimensions, ensuring that the values
* are within the range of 0.0 to 20.0. Additionally, it includes methods to 
* calculate and return the perimeter and area of the rectangle.
*
*/

//CSIS 212 - <WEEK 6>
package Rectangle;

//CSIS 212-<WEEK 6>
public class Rectangle {
    private float length = 1;
    private float width = 1;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length > 0.0 && length <= 20.0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be greater than 0.0 and less than or equal to 20.0!");
        }
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if (width > 0.0 && width <= 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be greater than 0.0 and less than or equal to 20.0!");
        }
    }

    public void calculatePerimeter() {
        float perimeter = 2 * (length + width);
        System.out.println("The perimeter is " + perimeter);
    }

    public void calculateArea() {
        float area = length * width;
        System.out.println("The area is " + area);
    }
}
