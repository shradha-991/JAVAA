interface A {
    int[] calculate(int a);
}

public class func_inte {
    public static void main(String[] args) {
       
        A sc = (x) -> new int[] { x * x};

        int[] result = sc.calculate(4);
        System.out.println(result[0]);
    
       
    }
}



