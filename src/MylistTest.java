import java.util.Arrays;

public class MylistTest {
    public static void main(String[] args) {
        Mylist<String> myList = new Mylist<>();
        myList.add(0, "a");
        myList.add(1, "b");
        myList.add(2, "c");
        myList.add(3, "d");
        System.out.println(myList.size());
        System.out.println(myList.indexOf("f"));
        System.out.println(myList.contains("c"));
        Mylist<String> myListClone = myList.clone();
        myListClone.add(4, "e");
        System.out.println(Arrays.toString(myListClone.elements));
        System.out.println(Arrays.toString(myList.elements));
        myList.ensureCapacity(15);
        System.out.println(Arrays.toString(myList.elements));
//        myList.clear();
//        System.out.println(Arrays.toString(myList.elements));
        System.out.println(myList.get(3));

    }
}
