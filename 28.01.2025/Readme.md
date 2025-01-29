## Platform Used: GeeksforGeeks

### Problem:
Create a class Employee with overloaded constructors to initialize employee details based on different combinations of arguments. Ensure the constructors support the creation of objects in various ways.

### Approach:
We have created a class Solution which has data members name, id and  department. We use 3 different constructors Such as `Solution(name)` , `Solution(name,id)` and `Solution(name,id,department)`. These are parametrized constructors i.e. we take values of data members when the objects are made. This class contains a function `display()` that is used to display all the parameters initialized. Then in the main function we create different objects for different parameters and print the details with help of display function.

### Code:

```java
class Solution {
   String name;
   int id;
   String department;

   Solution(String name) {
       this.name = name;
   }

   Solution(String name, int id) {
       this.name = name;
       this.id = id;
   }

  Solution(String name, int id, String department) {
       this.name = name;
       this.id = id;
       this.department = department;
   }

   void displayDetails() {
       System.out.println("Name: " + name);
       if (id != 0) {
           System.out.println("ID: " + id);
       }
       if (department != null) {
           System.out.println("Department: " + department);
       }
       System.out.println();
   }

   public static void main(String[] args) {
       Solution emp1 = new Solution("Akshay");
       emp1.displayDetails();

       Solution emp2 = new Solution("Nitin", 42);
       emp2.displayDetails();

       Solution emp3 = new Solution("Rohit", 45, "Engineering");
       emp3.displayDetails();
   }
}

```

### Output:

```
Name: Akshay
```

```
Name: Nitin
ID: 42
```

```
Name: Rohit
ID: 45
Department: Engineering
```
