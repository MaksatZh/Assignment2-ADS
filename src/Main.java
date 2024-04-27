import Lists.MyArrayList;
import Lists.MyLinkedList;
import Lists.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.add(1); // 0 index
        myLinkedList.add(3); // 1 index
        myLinkedList.add(5); // 2 index
        myLinkedList.add(6); // 3 index
        myLinkedList.add(7); // 4 index


        System.out.println("Index of an index 3:" + myLinkedList.get(3));
        myLinkedList.remove(3);
        System.out.println("Index of an index 3:" + myLinkedList.get(3));

        MyList<Integer> myArray = new MyArrayList<>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);

        System.out.println("Index of an index 3:" + myArray.get(3));
        myArray.remove(3);
        System.out.println("Index of an index 3:" + myArray.get(3));

    }


}
