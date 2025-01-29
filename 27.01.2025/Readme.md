## Platform Used: HackerRank

### Problem:
We have to create two classes Arithmetic and Adder. Arithmetic class has a function `add()` which takes two numbers as inputs and returns their sum and Adder class has no function. Our task is to implement inheritence in this problem such as Adder class extends Arithmetic class. Also print the superclass name with the help of the object of subclass

### Approach:
We create two classes as given in problem statement and create function `add()` in Arithmetic class. Then we create another class with `main()` function. In this `main()` function we create the object of class Adder. Using this object only we can call the function of the Arithmetic class without making the object of class Arithmetic. This can be done because Adder class extends Arithmetic and hence we can use functions of Arithmetic class with the help of Adder class only. Also we use `getClass()`, `getSuperclass()` and `getName()` function to print name of superclass with help of subclass object.

### Code:

```java
public class Solution {
    public static void main(String[] args) {
        Adder obj=new Adder();
        System.out.println("My superclass is " +obj.getClass().getSuperclass().getName());
        System.out.println("Sum is "+obj.add(5,10));
    }
}
class Arithmetic{
    int add(int a,int b)
    {
        return a+b;
    }
}
class Adder extends Arithmetic
{
//no additional method
}

```

### Output:

```
My superclass is Arithmetic
Sum is 15
```
