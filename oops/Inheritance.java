class Demo{
    protected int num = 3, num2 = 5;

    public void addNum(){
        System.out.println(num + num2);
    }
}

class Demo2 extends Demo{
    public void mulNum(){
        System.out.println(num * num2);
    }
}

class Solution{
    public static void main(String[] arg){
        Demo2 demo = new Demo2();
        demo.addNum();
        demo.mulNum();
    }
}