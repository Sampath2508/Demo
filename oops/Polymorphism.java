class Demo{
    public void printClassName(){
        System.out.println("Demo class");
    }
}

class Demo2 extends Demo{
    public void printClassName(){
        System.out.println("Demo2 class");
    }
}

class Demo3 extends Demo2{
    public void printClassName(){
        System.out.println("Demo3 class");
    }
}

class Solution{
    public static void main(String[] arg){
        Demo  demo = new Demo();
        Demo2 demo2 = new Demo2();
        Demo3 demo3 = new Demo3();
        demo3.printClassName();
        demo2.printClassName();
        demo.printClassName();
    }
}