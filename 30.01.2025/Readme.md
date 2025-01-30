## Platform Used: GeeksforGeeks

### Problem:
Create a class Rectangle with private attributes length and width, each defaulting to 1. The class should include setter and getter methods for both attributes, and a method to calculate the area of the rectangle.

### Approach:
We have created a class Solution which has length and width as private data members.We create a default constructor to initialize the value of both data members to 1.0. Then we make getter and setter methods for both attributes [`getLength()`, `setLength(length)`,`getWidth()`, `setWidth(width)`]. Getter methods are used to get the value of attributes and Setter methods are used to set the values of the dat amembers. This also class contains a method `calculateArea()` that calculates and returns the area of the rectangle. Then in the main function we create the object of the class set values of its data members using setter methods. We display the values of length and width with the help of getter methods. Then we call `calculateArea()` function with the help of object and area of Rectangle is displayed. 

### Code:

```java
class Solution {

    private double length;
    private double width;
 
    Solution() {
        this.length = 1;
        this.width = 1;
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
 
    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Solution rectangle = new Solution();
        System.out.println("Default Area: " + rectangle.calculateArea());
 
        rectangle.setLength(5);
        rectangle.setWidth(4);

        System.out.println("Length is: "+rectangle.getLength());
        System.out.println("Width is: "+rectangle.getWidth());

        System.out.println("Updated Area: " + rectangle.calculateArea());
    }
 }
```

### Output:

```
Default Area: 1.0
Length is: 5.0
Width is: 4.0
Updated Area: 20.0
```
