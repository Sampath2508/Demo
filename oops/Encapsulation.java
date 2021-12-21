class Demo{
    private String name;
    
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}

class Solution{
    public static void main(String[] arg){
        Demo demo = new Demo();
        demo.setName("sampath");
        System.out.println(demo.getName());
    }
}