abstract class Demo{
    public abstract void printName();
}

class Demo2 extends Demo{
    private String name;
    public Demo2(String name){
        this.name = name;
    }
    public void printName(){
        System.out.println(name);
    }
}

class Solution{
    public static void main(String[] arg){
        Demo2  demo = new Demo2("sampath");
        demo.printName();
    }
}