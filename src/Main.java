import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args)  {
       /* ArrayList<String> array1 = new ArrayList<>(); //  ������� ��� ����� ���� ������
        array1.add(" ������");
        array1.add(" ������1");
        array1.add(" ������2");
        array1.add(" ������3");
        array1.add(" ����");
        ArrayList<String> array2 = new ArrayList<>();
        array2.add("����");
        array2.addAll(array1);// ������� �� ������ ���� ��� �������� ������� �����
      //System.out.println(array2);
        array2.remove(3); //  � ������� ������� �� 3 �������
        Collections.sort(array2); // �������������  2 ����  �� �������� � ����������
        System.out.println(array2);
        array1.removeAll(array1);// �������� ������ ���� � �������� � ���� ��� ���������  �� �������
       //System.out.println(array1);
        array1.addAll(array2);
        System.out.println(array1);
        Collections.reverse(array1);// ����������� ��������
        System.out.println(array1);*/

        ArrayList<String> A = new ArrayList<>();
        A.add("���");
        A.add(" ���");
        A.add(" �� �������");
        A.add(" ���");
        A.add(" ����� ");
        for (int i = 0; i < A.size() ; i++) {
            System.out.println(A.get(i));   }

        ArrayList<String> B = new ArrayList<>();
        B.add(" � �����");
        B.add(" ���");
        B.add(" �");
        B.add(" ���");
        B.add(" ��");
        Collections.reverse(B);

        ArrayList<String> C = new ArrayList<>();
        C.addAll(A);
        C.addAll(B);
        for(int i =0; i<5; i++) {            //���������� ������ � �� ������� � � ����� ������ �..
            C.set(i, A.get(i) + B.get(i));   //..��������� ������� {A1,B5,�2,�4,�3,�3,�4,�2,�5,�1}(� ������� �����)
            System.out.print(C.get(i));
        }
       C.sort(new Comparator<String>() {                         //��������� ������ �� ������� ,  �� �����
           @Override
           public int compare(String o1, String o2) {
               return o1.length()- o2.length();
           }
       });
        System.out.println();
        System.out.println(C);

        }
        }






