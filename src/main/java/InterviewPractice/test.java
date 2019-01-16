package InterviewPractice;

public class test {
//        public static void main(String[] args) {
//            String a = new String("ab"); // a 为一个引用
//            String b = new String("ab"); // b为另一个引用,对象的内容一样
//            String aa = "ab"; // 放在常量池中
//            String bb = "ab"; // 从常量池中查找
//            if (aa == bb) // true
//                System.out.println("aa==bb");
//            if (a == b) // false，非同一对象
//                System.out.println("a==b");
//            if (a.equals(b)) // true
//                System.out.println("aEQb");
//            if (42 == 42.0) { // true
//                System.out.println("true");
//            }
//        }

//    public static void main(String[] args) {
//        int num1 = 10;
//        int num2 = 20;
//
//        swap(num1, num2);
//
//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);
//    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] array) {
        // 将数组的第一个元素变为0
        array[0] = 0;
    }
}
