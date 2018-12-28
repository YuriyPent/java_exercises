/*
Напишите рекурсивный метод отображающий строку задом на перед.
 */
package test;

public class Task9 {

    String s;

    Task9(String s) {
        this.s = s;
    }

    void recursionString(int i) {
        if (i != s.length() - 1) {
            recursionString(i + 1);
        }
        System.out.print(s.charAt(i));
    }

    public static void main(String args[]) {
        Task9 s = new Task9("\nЭтот сайт");
        s.recursionString(0);
    }

}
