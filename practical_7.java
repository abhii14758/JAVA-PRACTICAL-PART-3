//Created By 21CE013 ABHI BHIMANI
//Github Link : https://github.com/abhii14758/JAVA-PRACTICAL-PART-3

// Write a program that illustrates the significance of interface default method.

interface Sayable{  
    // Default method   
    default void say(){  
        System.out.println("Hello, this is default method");  
    }  
    // Abstract method  
    void sayMore(String msg);  
}  
public class practical_7 implements Sayable{  
    public void sayMore(String msg){        // implementing abstract method   
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        practical_7 dm = new practical_7();  
        dm.say();   // calling default method  
        dm.sayMore("Work is worship");  // calling abstract method  
  
    }  
}  
