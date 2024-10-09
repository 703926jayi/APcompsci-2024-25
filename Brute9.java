public class Brute9 {
    public static void main(String[] args) {
        int largestNumber = 0;
        int multiplier = 0;
        int result = 0;


        for (int num = 99999; num >= 10000; num--) {
            for (int mul = 1; mul <= 9; mul++) {
                int tempResult = num * mul;
                int tempResultCopy = tempResult;
                boolean identicalDigits = true;
                int lastDigit = tempResult % 10;
                while (tempResultCopy != 0) {
                    if (tempResultCopy % 10 != lastDigit) {
                        identicalDigits = false;
                        break;
                    }
                    tempResultCopy /= 10;
                }
                if (identicalDigits && num > largestNumber) {
                    largestNumber = num;
                    multiplier = mul;
                    result = tempResult;
                }
            }
        }
        System.out.println("The largest number is: " + largestNumber);
        System.out.println("The multiplier is: " + multiplier);
        System.out.println("The result is: " + result);
    }
}
