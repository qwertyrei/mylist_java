//Операционная система: Ubuntu 18.04
//Код пишется в: IntelliJ IDEA
//openjdk-17.0.1

import java.util.*;

public class Main{
    public static void main(String[] args) {
        try {
            int ch, value;
            myList<Integer> q = new myList<>();
            System.out.println("Нажмите:");
            System.out.println("1, чтобы ввести элемент в начало списка");
            System.out.println("2, чтобы ввести элемент в конец списка");
            System.out.println("3, чтобы удалить элемент из начала списка");
            System.out.println("4, чтобы удалить элемент по значению (удаляются все элементы с этим значением)");
            System.out.println("5, чтобы узнать размер списка");
            System.out.println("6, чтобы удалить все элементы из списка");
            System.out.println("7, чтобы просмотреть все элементы списка");
            System.out.println("8, если хотите выйти");
            while (true) {
                System.out.println("Enter your choice:");
                Scanner s = new Scanner(System.in);
                ch = s.nextInt();
                if (ch == 1) {
                    System.out.println("Enter value:");
                    Scanner s1 = new Scanner(System.in);
                    value = s1.nextInt();
                    q.addFirst(value);
                } else if (ch == 2) {
                    System.out.println("Enter value:");
                    Scanner s2 = new Scanner(System.in);
                    value = s2.nextInt();
                    q.addLast(value);
                } else if (ch == 3) {
                    q.delFirst();
                } else if (ch == 4) {
                    System.out.println("Enter value:");
                    Scanner s3 = new Scanner(System.in);
                    value = s3.nextInt();
                    for(int i=0; i<q.size(); i++)
                        q.delEl(value);
                    q.delEl(value);
                } else if (ch == 5) {
                    System.out.println("Size:\t" + q.size());
                } else if (ch == 6) {
                    q.delAll();
                } else if (ch == 7) {
                    q.printing();
                } else if (ch == 8) {
                    System.exit(0);
                } else {
                    System.out.println("Wrong number!");
                }
            }
        }
        catch (Exception InputMismatchException){		//если пользователь ввел не int ch, то программа заканчивает свою работу
            System.out.println ("Wrong enter!");
            System.exit(0);
        }
    }
}
