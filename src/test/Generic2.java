package test;
// A Simple Java program to show multiple 
// type parameters in Java Generics 

// We use < > to specify Parameter type 
class Generic2<T, U> {

    T obj1; // An object of type T 
    U obj2; // An object of type U 

    // constructor 
    Generic2(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // To print objects of T and U 
    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

// Driver class to test above 
class MainClass {

    public static void main(String[] args) {
        Generic2<String, Integer> obj
                = new Generic2<String, Integer>("GfG", 15);
        obj.print();
    }
}
