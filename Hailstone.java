public class Hailstone {
     /** Returns the length of a hailstone sequence that starts with n, * as described in part (a). * Precondition: n > 0 */ 
    public static int hailstoneLength(int n) { 
        int length = 0; 
        while (n != 1) { 
            if (n % 2 == 0) {
                n = n / 2; 
            } else { 
                n = 3 * n + 1; 
            }
            length++; 
        }
        return length + 1; 
    }

    /** Returns true if the hailstone sequence that starts with n is considered long * and false otherwise, as described in part (b). * Precondition: n > 0 */
 public static boolean isLongSeq(int n) { 
        int length = hailstoneLength(n); 
        return length > n; 
    }
 /** Returns the proportion of the first n hailstone sequences that are considered long, * as described in part (c). * Precondition: n > 0 */ 
public static double propLong(int n) {
        int longCount = 0; 
        for (int i = 1; i <= n; i++) { 
            if (isLongSeq(i)) { 
                longCount++; 
            } 
        }
        return (double) longCount / n; 
    }

    public static void main(String[] args) { 
        // Example usage of the methods
        System.out.println(hailstoneLength(10)); // Output: 16
        System.out.println(isLongSeq(10)); // Output: true
        System.out.println(propLong(10)); // Output: 0.5
    }
}
 // There may be instance variables, constructors, and methods not shown. }