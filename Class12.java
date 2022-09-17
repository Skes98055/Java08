import java.util.*;

class CWin{
    int width;
    int height;
    int width1;
    int height1;
    String name;
    String name1;
    void setW(int w){
        width=w;
    }
    void setH(int h){
        height=h;
    }
    void setName(String s){
        name=s;
    }
    void setName1(String s){
        name1=s;
    }
    void setWindows(int w,int h){
        width1=w;height1=h;
    }
    void show(){
        System.out.println("Name="+name);
        System.out.println("W="+width+", H="+height);
        System.out.println("Name="+name1);
        System.out.println("W="+width1+", H="+height1);

    }
    
}
public class Class12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CWin cw=new CWin();
        cw.setName("My Windows");
        cw.setName1(sc.nextLine());
        cw.setW(5);
        cw.setH(3);
        cw.setWindows(sc.nextInt(),sc.nextInt());
        cw.show();
        

    }
}
