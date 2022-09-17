import java.util.*;
class CTest{
     void ans(int a1,int b1,int c1){
        if(a1==0){
            System.out.println("此數為0");
        }
        else if(a1%2==0){
            System.out.println("此數為偶數");
        }
        else if(a1%2!=0){
            System.out.println("此數為奇數");
        }
        if(b1==0){
            System.out.println("此數為0");
        }
        else if(b1%2==0){
            System.out.println("此數為偶數");
        }
        else if(b1%2!=0){
            System.out.println("此數為奇數");
        }
        if(c1==0){
            System.out.println("此數為0");
        }
        else if(c1%2==0){
            System.out.println("此數為偶數");
        }
        else if(c1%2!=0){
            System.out.println("此數為奇數");
        }
    }
}
public class Class7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CTest run=new CTest();
        run.ans(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
    }
}
