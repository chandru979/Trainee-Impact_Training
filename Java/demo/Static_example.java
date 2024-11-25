package demo;
        // Static method calling without creating an object
// public class Static_example {
//     static int num = 10;
//     static String name = "chan";

//     static void display()
//     {
//         System.out.println(num);
//         System.out.println(name);
//     }

//     public static void main(String[] args)
//     {
//         display();
//     }

// }


//============================================================================================
// public class Static_example {
//     static int num = 10;
//      String name = "chan";

//     void display_1(){
//         System.out.println(num);
//         System.out.println(name);
//     }

//     static void display()
//     {
//         System.out.println(num);
//         // System.out.println(name);    //can't access instance var in static method
//     }

//     public static void main(String[] args)
//     {
//         Static_example dis = new Static_example();
//         dis.display_1();
//         display();
//     }

// }



//==================================================================================

// public class Static_example {            // static nested class
//     private static int num = 10;
//      String name = "chan";

//      public static class InnerStatic_example {
//      void display(){
//         System.out.println(num);
//      }    
//     }
//     public static void main(String[] args)
//     {                                   //Can instantiate the static nested class without creating an instance of OuterClass
//         Static_example.InnerStatic_example dis = new Static_example.InnerStatic_example();
//         dis.display();
//     }

// }

//==========================================================================


        //Abstract and interface combined

        interface Shape {
            double PI = 3.14159;  // Constant (static final)
            void draw();
        }
        
        abstract class Shape3D {
            protected String name;
            public static int numberOfEdges = 12;  // Static variable
        
            public Shape3D(String name) {
                this.name = name;
            }
        
            public abstract void draw();  // Abstract method to be implemented
        }
        
        class Cube extends Shape3D implements Shape {
            public Cube(String name) {
                super(name);
            }
        
            public void draw() {
                System.out.println(name + " is a 3D shape with " + numberOfEdges + " edges.");
                System.out.println("PI value is:"+Shape.PI);
            }
        }
        
        public class Static_example {
            public static void main(String[] args) {
                Cube cube = new Cube("Cube");
                cube.draw();  
            }
        }
        