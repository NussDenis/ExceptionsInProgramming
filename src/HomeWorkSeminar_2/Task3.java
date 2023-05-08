package HomeWorkSeminar_2;

public class Task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }  catch (Throwable ex) { //надо поменять блоки местами, иначе код просто не пойдет дальше, так как это базовый класс
            System.out.println("Что-то пошло не так...");
        }
     }
    public static void printSum(Integer a, Integer b) { //throws FileNotFoundException лишнее, мы не обращаемся ни к каким файлам
        System.out.println(a + b);
    }
     
}