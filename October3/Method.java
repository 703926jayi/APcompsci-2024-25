public class Method {
   public static void main(String[] args) {
    int a = 2;
    if(isOdd(a)==true){
        System.out.println(a+ " is even");
    }
   }
   public static boolean isOdd(int a) {
    if(a%2==1){
        return false;
    } else {
        return true;
    }
   }
}
