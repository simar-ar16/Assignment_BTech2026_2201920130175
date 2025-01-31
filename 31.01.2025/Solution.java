class Solution {
    String firstName;
    String lastName;
 
    Solution(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
 
    // Overriding the toString() method
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
 
    public static void main(String[] args) {
      
        Solution p = new Solution("Naman", "Sharma");
 
        System.out.println("Full Name: " + p.toString());
    }
 }