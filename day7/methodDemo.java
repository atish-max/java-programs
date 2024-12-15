package day7;

public class methodDemo {
    public static void main(String[] args) {
        System.out.println("Method demo");
        methodDemo m1= new methodDemo();
       int n= m1.add(23,34);
        int x= m1.sub(23,34);
        int y= m1.mul(23,34);
        int z= m1.div(23,34);


    }
    int add(int a,int b){
        int c= a+b;
        System.out.println(c);
return 0;
    }
    int sub(int a,int b){
        int c= a-b;
        System.out.println(c);
        return 0;
    }
    int mul(int a,int b){
        int c= a*b;
        System.out.println(c);
        return 0;
    }
    int div(int a,int b){
        int c= a/b;
        System.out.println(c);
        return 0;
    }
}
