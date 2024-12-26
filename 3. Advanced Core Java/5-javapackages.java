// Package declaration (this can be in a separate file)
package com.example;

// Class inside the package
public class MyClass {
    public void display() {
        System.out.println("This is MyClass inside com.example package.");
    }
}

import com.example.MyClass; // Importing the class

public class JavaPackages {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
