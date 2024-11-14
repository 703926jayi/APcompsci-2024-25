public class ArraysClass {
    //Return the number of elements in the array.
public int countElements(int [] n)
{
    return n.length;
}
//Return the largest integer in the array
public int findLargest(int [] n)
{ 
int largest = n[0]; 
for(int i = 1; i < n.length; i++){
    if(n[i] > largest){
        largest = n[i];
        
    }
    
}
    return largest;
}

//Return the number of odd integers in the array
public int numOdd(int [] n){
    int count = 0;
    for(int i = 0; i < n.length; i++){
        if(n[i] % 2 != 0){
            count++;
        }
       
    }
    return count;
}
//Return the number of negative even numbers in the array
public int countNegEven(int [] n){
   int count = 0;
   for(int i = 0; i < n.length; i++){
       if(n[i] < 0 && n[i] % 2 == 0 ){
           count++;
       }
   }
   return count++;
}
//Return the index of the first number greater than 90 or -1 if there is none
public int indexGreater100 (int [] n){
    for(int i = 0; i < n.length; i++){
        if(n[i] > 90){
            return i;
        }
    }
    return -1;
}
// Return true if all values from 1 to 10 appear somewhere in the array, otherwise return false.
public boolean oneToTenPresent(int [] n){
    boolean[] f = new boolean[10];
    for (int i = 0; i < n.length; i++){
        if(n[i] >= 1 && n[i] <= 10){
            f[n[i] - 1] = true;
        }
    }
    for(int i = 0; i < f.length; i++){
        if(!f[i]){
            return false;
        }
    }
    return true;
}
//This boolean method will return true if there are no repeated values in the array, otherwise 
//false is returned.  Have it output an appropriate message before it returns the value.
 public boolean noRepeats(int [] n){
   for(int i = 0; i < n.length; i++){
       for(int a = i + 1; a < n.length; a++){
           if(n[i] == n[a]){
               System.out.println("There are multiple of the same number");
               return false;
           }
       }
   } 
   System.out.println("There are not multiple of the same number");
   return true;
}
//This receives the integer array and two additional integers.  The method will swap the values
 //at the two indices provided, unless the indices are outside of the range of valid array indices,
 //in which case nothing is swapped.
public int[] swap(int [] n, int a, int b){
   if( a >= 0 && a < n.length && b >= 0 && b < n.length){
       int t = n[a];
       n[a] = n[b];
       n[b] = t;
   }
   return n;
}
//This method will receive an integer n.  The method first build a int array filled with the first 50 numbers
//in the Fibonacci sequence.  It will then return the value stored at index n-1 in that array.  If n is 
//greater than 50 or less than 1, a value of -1 should be returned.
public int findNthFibonacciUsingArrays(int n){
    if(n < 1 || n > 50){
        return -1;
    }
    int[] fb = new int [50];
    fb[0] = 0;
    fb[1] = 1;
    for(int i = 2; i < 50; i++){
        fb[i] = fb[i - 1] + fb[i - 2];
    }
    return fb[n - 1];
}
}


