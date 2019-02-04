package test;

// A Simple Java program to show working of user defined 
// Generic classes 
// We use < > to specify Parameter type 
class Generic<T> {

    // An object of type T is declared 
    T obj;

    Generic(T obj) {
        this.obj = obj;
    }  // constructor 

    public T getObject() {
        return this.obj;
    }
}

// Driver class to test above 
class Main {

    public static void main(String[] args) {
        // instance of Integer type 
        Generic<Integer> iObj = new Generic<Integer>(75);
        System.out.println(iObj.getObject());
 
        // instance of String type 
        Generic<String> sObj
                = new Generic<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }
}
