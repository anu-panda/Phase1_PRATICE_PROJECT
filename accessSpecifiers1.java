package com.mphasis.work.project;
//File name: accessSpecifiers1.java

//Default access specifier
class DefaultAccessSpecifier {
 void display() {
     System.out.println("You are using default access specifier");
 }
}

//Private access specifier
class PrivateAccessSpecifier {
 private void display() {
     System.out.println("You are using private access specifier");
 }
}

//Protected access specifier
class ProtectedAccessSpecifier {
 protected void display() {
     System.out.println("This is protected access specifier");
 }
}

//Public access specifier
class PublicAccessSpecifier {
 public void display() {
     System.out.println("This is public access specifier");
 }
}

public class accessSpecifiers1 {

 public static void main(String[] args) {
     // Default access specifier
     System.out.println("Default Access Specifier");
     DefaultAccessSpecifier defaultObj = new DefaultAccessSpecifier();
     defaultObj.display();

     // Private access specifier
     System.out.println("\nPrivate Access Specifier");
     PrivateAccessSpecifier privateObj = new PrivateAccessSpecifier();
     // Uncommenting the line below will result in a compilation error
     // privateObj.display();

     // Protected access specifier
     System.out.println("\nProtected Access Specifier");
     ProtectedAccessSpecifier protectedObj = new ProtectedAccessSpecifier();
     protectedObj.display();

     // Public access specifier
     System.out.println("\nPublic Access Specifier");
     PublicAccessSpecifier publicObj = new PublicAccessSpecifier();
     publicObj.display();
 }
}