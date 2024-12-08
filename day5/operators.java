package day5;

public class operators {
    public static void main(String[] args) {
        System.out.println("1984");
        int revnum=0;
        int num=1984;

        revnum =(revnum*10)+num%10;
        num=num/10;

        revnum =(revnum*10)+num%10;
        num=num/10;

        revnum =(revnum*10)+num%10;
        num=num/10;

        revnum =(revnum*10)+num%10;

        System.out.println(revnum);


    }
}
