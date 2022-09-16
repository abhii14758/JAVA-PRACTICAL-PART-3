//Created By 21CE013 ABHI BHIMANI
//Github Link : https://github.com/abhii14758/JAVA-PRACTICAL-PART-3

// Write a program to create a default method in an interface IPrinter. Create
// an interface IPrinter and IScanner. You can assume variables and methods for both
// interfaces. Create a concrete class to implement both the interfaces. Create 5 objects of the
// class, store it in Vector and display the result of the vector.


import java.util.Vector; interface iprinter{
    String ip(); default void show()
    {
    System.out.println("Default iprinter");
    }
    }
    interface iscanner{ String isc();
    default void show()
    {
    System.out.println("Default testinterface2");
    }
    }
    class defaultmethod implements iprinter,iscanner { @Override
    public String ip() { return "iprinter";
    }
    
    @Override
    public String isc() { return "iscanner";
    }		public void show() { iprinter.super.show();
    iscanner.super.show();
    
    } }
    public class practical_2 {
    public static void main(String[] args) { Vector<String> s = new Vector<>(); defaultmethod d = new defaultmethod(); s.add(d.ip());
    s.add(d.isc());
    s.add(d.ip());
    s.add(d.isc());
    s.add(d.ip());
    
    d.show();
    for (int i = 0; i < s.size(); i++) { System.out.println(s.get(i));
    }
    
    }
    }
    