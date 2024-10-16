public class PageNum {
    public static void main(String[] args) {
        int p = 1;
        int d =2989;
        while(d>0){
            if(p>=1000){
                d=d-4;
            } else if(p>=100){
                d = d-3;
            } else if(p>=10){
                d = d-2;
            } else{
                d=d-1;
            }
            p++;
        }
        System.out.println(p-1);
    }
}
