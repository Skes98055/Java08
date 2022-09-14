class CBox{
    int length;
    int width;
    int height;
    int volume(){
        return (length*height*width);
    }
    int surfaceArea(){
        return (length*height*2+width*height*2+width*length*2);
    }
    void showData(){
        System.out.printf("%d %d %d\n",length,width,height);
    }
    void showAll(){
        System.out.printf("%d %d %d %d %d",length,width,height,surfaceArea(),volume());
    }
}
public class Main {
    public static void main(String[] args) {
        CBox box=new CBox();
        box.length=1;
        box.width =1;
        box.height=1;
        box.showData();
        box.showAll();
    }
}
       
