class CSphere{
    private int x;
    private int y;
    private int z;
    private int radius;
    private double aa;
    
    void setLocation(int x1,int y1,int z1){
        x=x1;y=y1;z=z1;
    }
    void setRadius(int r){
        radius=r;
    }
    double surfaceArea(){
        return(Math.PI*4*radius*radius);
    }
    double volume(){
        return(4*Math.PI*Math.pow(radius,3)/3);
    }
    void showCenter(){
        System.out.printf("圓心座標:(%d,%d,%d)\n",x,y,z);
        System.out.printf("圓球半徑:%d\n",radius);
        System.out.printf("圓球表面積:%.2f\n",surfaceArea());
        System.out.printf("球體體積:%.2f\n",volume());
    }

}
class Class16 {
    public static void main(String[] args) {
       CSphere ans=new CSphere();
       ans.setLocation(3,4,5);
       ans.setRadius(1);
       ans.showCenter();
    }
}
