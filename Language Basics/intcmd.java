public class intcmd {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int sum=a+b;
        System.out.printf("The sum of %d and %d is %d",a,b,sum); 
    }
}
