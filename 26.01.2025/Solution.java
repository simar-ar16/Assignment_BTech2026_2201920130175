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