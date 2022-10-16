import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args)  {
       /* ArrayList<String> array1 = new ArrayList<>(); //  создать два листа типа стринг
        array1.add(" Привет");
        array1.add(" Аривет1");
        array1.add(" Вривет2");
        array1.add(" Рривет3");
        array1.add(" Лррр");
        ArrayList<String> array2 = new ArrayList<>();
        array2.add("Пока");
        array2.addAll(array1);// добавит во второй лист все элементы первого листа
      //System.out.println(array2);
        array2.remove(3); //  и удалить элемент по 3 индексу
        Collections.sort(array2); // отсортировать  2 лист  по алфавиту и напечатать
        System.out.println(array2);
        array1.removeAll(array1);// очистить первый лист и добавить в него все элементты  из второго
       //System.out.println(array1);
        array1.addAll(array2);
        System.out.println(array1);
        Collections.reverse(array1);// перевернуть элементы
        System.out.println(array1);*/

        ArrayList<String> A = new ArrayList<>();
        A.add("Дом");
        A.add(" там");
        A.add(" ты родился");
        A.add(" там");
        A.add(" уютно ");
        for (int i = 0; i < A.size() ; i++) {
            System.out.println(A.get(i));   }

        ArrayList<String> B = new ArrayList<>();
        B.add(" и тепло");
        B.add(" где");
        B.add(" а");
        B.add(" где");
        B.add(" не");
        Collections.reverse(B);

        ArrayList<String> C = new ArrayList<>();
        C.addAll(A);
        C.addAll(B);
        for(int i =0; i<5; i++) {            //Объединить Список А со Списком Б в новый список С..
            C.set(i, A.get(i) + B.get(i));   //..следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}(с помощью цикла)
            System.out.print(C.get(i));
        }
       C.sort(new Comparator<String>() {                         //сортирует список по размеру ,  по длине
           @Override
           public int compare(String o1, String o2) {
               return o1.length()- o2.length();
           }
       });
        System.out.println();
        System.out.println(C);

        }
        }






