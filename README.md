# Object-oriented programming projects and examples
Some projects from the Object-oriented programming class at Federal University of Western Pará - UFOPA.

## Introduction

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

The main program 

### Main.java

``` java
//It has to be the same as the file, with uppercase letters preferably
public class Main{ 

}
```

## Constructor
The constructor methods help in the construction of the object where to define the attributes of the object/class.

In java, the constructor is done like this:

### Triangulo.java

``` java
public class Triangulo {
    private double a; 
    private double b;
    private double c;

    //constructor has the same name as the class
    public Triangulo(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
} 
```