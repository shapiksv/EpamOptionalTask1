import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Epam {
//    Для успешного выполнения задания достаточно реализовать 2-4 пункта.
//
//    Задание. Ввести n чисел с консоли.
//1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
//
//            2.     Вывести числа в порядке возрастания (убывания) значений их длины.
//
//            3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
//
//            4.     Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
//
//5.     Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
//
//6.     Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
//
//7.     Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
    private static boolean isNum(String s){
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }

    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList <Integer> arr = new ArrayList<>();
    boolean boo = true;
    while (boo){
        String ss = sc.nextLine();
        boo = isNum(ss);
        if(boo){
            arr.add(Integer.parseInt(ss));
        }
    }
    System.out.println("1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");
    int lonMax = 0;
    int linMin = arr.get(0);
    for(Integer i : arr){
        String s = i + "";
        if(lonMax < s.length()){
            lonMax = s.length();
        }
    }

    for(Integer i : arr){
        String s = i + "";
        if(lonMax > s.length()){
            lonMax = s.length();
        }
    }
    for (Integer f : arr) {
        String d = f + "";
        if(linMin == d.length()){
            System.out.print(d + " ");
            System.out.println(d.length());
        }

    }

    for (Integer f : arr) {
        String d = f + "";
        if(lonMax == d.length()){
            System.out.print(d + " ");
            System.out.println(d);
        }
    }

    System.out.println("2.     Вывести числа в порядке возрастания (убывания) значений их длины.");
    for (int i = 0; i <= lonMax ; i++) {
        for(Integer d : arr){
            String s =  d + "";
            if(i == s.length()){
                System.out.println(s);
            }
        }

    }
    System.out.println("3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.");
    int srd = lonMax - linMin;
    srd +=linMin;

    for (Integer d : arr){
        String s = d + "";
        if(s.length()< srd){
            System.out.print(s + " ");
            System.out.println(s.length());
        }
    }
    for (Integer d : arr){
        String s = d + "";
        if(s.length() > srd){
            System.out.print(s + " ");
            System.out.println(s.length());
        }
    }
//            4.     Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
    System.out.println("5. Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.");
    List<Integer> even = new ArrayList<>();
    List<Integer> vev = new ArrayList<>();

    for (Integer d : arr){
        String s = d + "";
        char[] a =s.toCharArray();
        int koef = 0;
        int evv = 0;
        int vve = 0;
        for (char f : a){
            String g = f + "";
            int h = Integer.parseInt(g);
            if(h%2 != 0){
                koef +=1;
            }
        }
        if(koef==0){
            even.add(Integer.parseInt(s));
        }

        for (char f : a) {
            String g = f + "";
            int h = Integer.parseInt(g);
            if(h%2 == 0){
                evv +=1;
            }else {
                vve +=1;
            }
        }
        if(evv == vve){
            vev.add(Integer.parseInt(s));
        }
    }
    for (Integer d : vev) {
        System.out.println(d);
    }
    for (Integer d : even){
        System.out.println(d);
    }

    System.out.println("6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.");
    List<Integer> inOrder = new ArrayList<>();
    for (Integer d : arr) {
        String s = d + "";
        char[] a = s.toCharArray();
        int rr = a[0];
        int yy = 0;
        if (a.length >1) {
            for (int i = 1; i < a.length; ) {
                rr +=1;
                int b = a[i];
                if(rr != b){
                   break;
                }
                i +=1;
                if(i==a.length){
                    System.out.println(s);
                    break;
                }

            }
        }
    }
//
    System.out.println("7.     Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.");
    for (Integer d : arr) {
        String s = d + "";
        int rr = 0;
        char[] a = s.toCharArray();
        for(char c : a){
            int tt = -1;
            for(char v : a){
                if(c==v){
                    tt +=1;
                }
            }
            rr +=tt;
        }
        if(rr == 0){
            System.out.println(s);
        }
    }
    }
}
