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
        System.out.println("Updated Area: " + rectangle.calculateArea());
    }
 }