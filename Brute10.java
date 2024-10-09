public class Brute10 {
    public static void main(String[] args) {
        int totalLegs = 1440;
        for (int children = 0; children <= totalLegs; children++) {
            int puppies = children - 20; 
            int ants = children * 10;   
            int teacher = 1;            
            int childrenLegs = children * 2; 
            int puppiesLegs = puppies * 4;  
            int antsLegs = ants * 6;         
            int teacherLegs = teacher * 2;   
            int totalCalculatedLegs = childrenLegs + puppiesLegs + antsLegs + teacherLegs;

            if (totalCalculatedLegs == totalLegs && puppies >= 0) {
                System.out.println("Number of children: " + children);
                System.out.println("Number of puppies: " + puppies);
                System.out.println("Number of ants: " + ants);
                System.out.println("Number of legs calculated: " + totalCalculatedLegs);
                break; // Exit once the solution is found
            }
        }
    }
}



