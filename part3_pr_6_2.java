//Created By 21CE013 ABHI BHIMANI
//Github Link : https://github.com/abhii14758/JAVA-PRACTICAL-PART-3

// Write a program that demonstrates use of packages & import statements.

import part.part3_pr_6;

public class part3_pr_6_2 {
    public static void main(String[] args) {
        double value = 99.5;
        String formattedValue = part3_pr_6.getFormattedDollar(value);
        System.out.println("formattedValue = " + formattedValue);
    }
}