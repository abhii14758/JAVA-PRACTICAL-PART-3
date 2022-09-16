//Created By 21CE013 ABHI BHIMANI
//Github Link : https://github.com/abhii14758/JAVA-PRACTICAL-PART-3

// Write a java program which shows importing of classes from other user define
// packages.


import newpackage.Sum;
import newpackage.Sub;
import newpackage.Mul;
import newpackage.Div;

public class calc {
    public static void main(String[] args) {
        Sum s = new Sum();
        Sub su = new Sub();
        Mul m = new Mul();
        Div d = new Div();

        int a=10,b=5;

        System.out.println(s.sum(a, b));
        System.out.println(su.sub(a, b));
        System.out.println(m.mul(a, b));
        System.out.println(d.div(a, b));
    }
}
