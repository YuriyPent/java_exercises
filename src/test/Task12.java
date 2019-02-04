/*
Создайте метод, который в качестве аргумента получает число и полностью 
обнуляет столбец, который соответствует заданному числу.
 */
package test;

public class Task12 {
    
    public static void deleteRow(int[][] rows, int index){ 
	if (index >0 && index <rows.length) 
		for (int i = 0; i<rows[index].length; i++) 
                    rows[index][i] = 0; 
}
    public static void main(String[] args) {
//        deleteRow([2],1);
    }
}
