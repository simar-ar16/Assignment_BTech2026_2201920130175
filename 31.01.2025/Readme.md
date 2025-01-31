

## Platform Used: GeeksforGeeks

### Problem:
Create a class Person with firstName and lastName as data members. Override the toString() method to return the full name of the person. Define constructors to take appropriate parameters.

### Approach:
We have created a class Solution which has firstname and lastName as data members. Then we create a parametrized constructor that helps to initialize the values of the data members. Now this class also overrides the method `toString()` and this method returns the full name by concatenating firstName and lastName. Then in the main function we create the object of the class and give the values of firstName and lastName(). Then we display the fullName with the help of object and `toString()` method.  

### Code:

```java
class Solution {
    String firstName;
    String lastName;
 
    Solution(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
 
    // Override toString() method
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
 
    public static void main(String[] args) {
      
        Solution p = new Solution("Naman", "Sharma");
 
        System.out.println("Full Name: " + p.toString());
    }
 }
```

### Output:

```
Full Name: Naman Sharma
```
