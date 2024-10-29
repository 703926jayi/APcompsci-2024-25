//Finish the following methods

public class Methods {
    //This method will receive two integers and return their sum
    public int add(int a, int b)
    {
        return a+b;
    }
    //This method will receive three integers and return the smallest 
    public int findSmallest(int a, int b, int c)
    {
        if(a<b&&a<c){
        return a;
    } else if(b<a&&b<c){
        return b;
    } else{
        return c;
    }
    }
    //This method will receive three ints and return the double average of the three
    //rounded to three decimal places
    public double findAverage(int a, int b, int c)
    {
    double t=   ((double)a+(double)b+(double)c)/3.0;
        return t;
    }
    //This method receives an integer and returns the sum of its digits
    public int sumDigits(int num)
    {
        int x =0;
        while(num!=0){
            x +=num%10;
            num = num/10;
        }
        return x;
    }
    //This method receives and integer year and return true if its a leap year,
    //false if it is not.  Leap years occur every 4 year, except for every 100 years,
    //except those that are divisible by 400.  1900 is not, but 2000 is
    public boolean isLeapYear(int year)
    {
        if(year%4==0&&(year%100!=0||year%400==0)){
        return true;
        }
        else {
        return false;
        }
    }
    //This method receives an int and will output the corresponding month as a String
    //Ex:  1 --> "January".  If outside the range of 1 to 12, "Invalid" is returned.
    public String findMonth(int m)
    {
        if(m==1){
            return "January";
        } else if(m==2){
            return "Febuary";
        }else if(m==3){
            return "March";
        }else if(m==4){
            return "April";
        }else if(m==5){
            return "May";
        }else if(m==6){
            return "June";
        }else if(m==7){
            return "July";
        }else if(m==8){
            return "August";
        }else if(m==9){
            return "September";
        }else if(m==10){
            return "October";
        }else if(m==11){
            return "November";
        }else if(m==12){
            return "December";
        } else{
            return "Invalid";
        }
    }
    //This method will receive two integers.  The method will sum up the range of numbers
    //starting at the smaller number, up to and including the larger number.
    //It should work whether the smaller number is first or second.
    public int sumRange(int a, int b) {
        int range = 0;
    
        if (a < b) {
            for (int i = a; i <= b; i++) {
                range += i;
            }
        } 
        else {
            for (int i = b; i <= a; i++) {
                range += i;
            }
        }
        
        return range; 
    }

    //This method will receive two integers, pointsEarned and pointsPossible.
    //From these a percentage is calculated and the appropriate grade is returned
    // 90-100 is A, 80 to 90 is B, 70 to 80 is C, 60-70 is D, below 60 is E
    public String calculateGrade(int pointsEarned, int pointsPossible) {
        double percentage = (pointsEarned * 100.0) / pointsPossible;

        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "E";
        }
    }

    //This method will receive an integer n.  The method will return the nth number
    //of the Fibonacci sequence.  The Fibonacci sequence begins 1, 1, 2, 3, 5, 8....
    //Each successive number in the sequence is found by summing the two previous digits.
    //Example:  findNthFibonacci(4) should return 3, since 3 is the 4th number of the sequence
    public int findNthFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        
        int a = 1, b = 1, fib = 1;
        for (int i = 3; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
}

