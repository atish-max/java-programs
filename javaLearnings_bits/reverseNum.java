package javaLearnings_bits;

public class reverseNum {
    public static void main(String[] args) {
        System.out.println("enter the number is 1948");
        int num1=1948;

        int mod = num1%10;
        int temp=mod*10;
    int div= num1/10;

    int mod1=div%10;
    int temp1=temp*10;
    int sec=mod1*10;
    int num2=temp1+sec;
    int div2 = div/10;

    int mod2 = div2%10;
    int temp2=temp1*10;
    sec=sec*10;
    int third= mod2*10;
    int num3= temp2+sec+third;
    int div3=div2/10;
    int last = num3+div3;
        System.out.println(last);
    }
}
