# Object-oriented programming projects and examples
Some projects from the Object-oriented programming class at Federal University of Western Pará - UFOPA.

## Introduction

Assuming you have prior knowledge of basic programming, some terms and knowledge will be assumed that you already know.

OOP is a paradigm that can help you write code that is modular, reusable, and easier to maintain over time.
```Object-oriented programming``` allows the abstraction of real-life elements, such as:
A program that calculates the area of a triangle.
Normally, through imperative programming, variables would be created to store the sides of a triangle. Let's call these sides 'a, b and c', then the area would be calculated and the resulting information would be stored in some variable. What would happen if you had to work with several triangles? We would have to repeat the same variables several times to create different triangles.
In view of this, it becomes necessary to use objects, so let's take everything you want and need from a triangle and put it in just one code that every time you want a new triangle, just call this object.

At the center of **OOP** is the idea of *"encapsulation"*, which means that each object contains its own data and code, and that this data and code is hidden from other objects. This helps to ensure that the data is protected and that the code is reusable, as other objects can interact with the object's data and code only through well-defined interfaces.

[Encapsulation and other concepts](https://www.devmedia.com.br/encapsulamento-polimorfismo-heranca-em-java/12991):

These "encapsulations" can be done with some common parameters of programming languages that are called access modifiers, which are 3 ```(private, protected and public)```.

**Access modifiers: Access modifiers are used to specify the visibility and accessibility of classes, methods, and variables. There are four types of access modifiers in Java:**
``` java
    
    //protected: This modifier makes the class, method, or variable accessible within its own class and any subclasses.
    private int var1 = 0;

    //private: This modifier restricts the class, method, or variable to be accessible only within its own class.
    protected int var2 = 0;

    //public: This modifier makes the class, method, or variable accessible from anywhere in the program.
    public int var3 = 0;

    //default (no modifier): This modifier makes the class, method, or variable accessible within the same package only.
    int var4 = 0;
```

### Class
Defines a set of objects that will be the same in functioning.

### Object
An object is an instance of a class.

### Methods

- Operations 
- Behavior

We can call methods like 'actions' or whatever the object does.

Some advantages:
- Reuse of code: the class/object will use its own data:
    - If you want something from the object it will give you what you need from the object. 
- Delegation of responsibility
  - That way, if you need something from a class, who will give what you want is the class through the called method. 

### Attributes 
Object data.

### Encapsulation
We can say that it is the hiding of information of a class, that way the details are hidden out of general access. That way, we just define the methods to access an object.

## Main Program

In Java, the "main" program is a special method that serves as the entry point for a Java application.  

In the Main program, the main method typically contains the main logic of the program. It is where you define the sequence of steps that the program should follow, including input and output operations, computations, and control structures such as loops and conditionals. The main method can also call other methods and classes to perform more complex tasks.

### Main.java

``` java
//the public class name has to be the same as the file, with uppercase letters preferably
public class Main{ 
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```

Let's break down what some parts of this code mean:
- ```Static``` is a non-access modifier that makes the main method a class-level method, meaning that it can be called without creating an instance of the class.

- ```main``` is the name of the method.

- ```String[] args``` is an array of String objects that holds any command-line arguments passed to the program.

## Constructor
The constructor methods help in the construction of the object where to define the attributes of the object/class.

In java, the constructor is done like this:

### Triangle.java

``` java
public class Triangle {
    private double a; 
    private double b;
    private double c;

    //constructor has the same name as the class Triangle
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
} 
```