class Demo{
    String name;
    public Demo(String name){
        this.name = name;
    }
}

class Solution{
    public static void main(String[] arg){
        Demo demo = new Demo("sampath");
        System.out.println(demo.name);
    }
}