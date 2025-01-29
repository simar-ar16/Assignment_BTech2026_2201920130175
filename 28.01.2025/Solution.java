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