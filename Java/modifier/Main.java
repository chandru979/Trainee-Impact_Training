package modifier;
public class Main{
    private class InnerClass{
        void display(){
            System.out.println("hi");
        }
    }
}

public void normalInnerClass(){
    InnerClass inner = new InnerClass();
    inner.display();
}

public class Modifiers{
    public static void main(String[] args) {
        Modifiers outer = new Modifiers();
        outer.normalInnerClass();
    }
}