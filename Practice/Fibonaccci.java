class Fibonacci {
    public static void main(String[] args) {
        int x=0;
        int y=1;
        int z;
        for (int i=1;i<=5;i++){
           System.out.print(x);
           z=x+y;
           x=y;
           y=z;
         
        }
    }
}
