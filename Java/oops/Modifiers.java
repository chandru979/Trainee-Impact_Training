package oops;

class PrivateModifiers{
    private class InnerClass{				//Nested private class is valid in java
        void display(){
            System.out.println("hi");
        }
    }

public void normalInnerClass(){				//Accessing the private class method using same public class method
    InnerClass inner = new InnerClass();
    inner.display();
}
}
public class Modifiers{
    public static void main(String[] args) {
    	PrivateModifiers outer = new PrivateModifiers();		//create object for outerclass(privatemodifiers) access using the public method.
        outer.normalInnerClass();
    }
}


