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
