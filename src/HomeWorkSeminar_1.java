import java.util.Arrays;

public class HomeWorkSeminar_1 {
    public static void main(String[] args) {
        divideByZero();
        accessArrayElement();
        parseInt();

        int[] arr1 = {4, 7, 9};
        int[] arr2 = {12, 2, 1};
        System.out.println(Arrays.toString(diffArrays(arr1,arr2)));
        try {
            int[] result = divideArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
    public static int divideByZero() {
        int a = 5;
        int b = 0;
        return a/b;
    }

    public static int accessArrayElement() {
        int[] arr = {1, 2, 3};
        return arr[3];
    }

    public static int parseInt() {
        String s = "abc";
        return Integer.parseInt(s);
    }

    public static int[] diffArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы не равны по длине");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    public static int[] divideArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы не равны по длине");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }

}