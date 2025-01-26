## Platform Used: HackerRank

### Problem:
We have to create two classes Animal and Bird. Animal class has a function `walk()` which prints `I am walking` and Bird class has a function `fly()` which prints `I am flying` . 
Our task is to implement inheritence in this problem such as Bird class extends Animal class.

### Approach:
We create two classes as given in problem statement and create functions `walk()` and `fly()` in respective classes. Then we create another class with `main()` function. In this `main()` function we create the object of class Bird. Using this object only we can call both the functions of the respective classes without making the object of class Animal. This can be done because Bird class extends Animal and hence we can use functions of Animal class with the help of Bird class only.

### Code:

```
class Animal
{
    void walk()
    {
        System.out.println("I am walking");
    }
}
class Bird extends Animal
{
void fly()
{
    System.out.println("I am flying");
}
}
class Solution{
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
         bird.fly();
    }
}
```

### Output:

```
I am walking
I am flying
```
