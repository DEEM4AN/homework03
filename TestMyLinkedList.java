package homework03;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.addElement("А");
        myLinkedList.addElement("Б");
        myLinkedList.addElement("В");
        myLinkedList.addElement("Г");
        myLinkedList.addElement("Д");

        myLinkedList.deleteElement("А");

        System.out.println(myLinkedList.getElement(3));

        for (String s: myLinkedList ) {
            System.out.println(s);
        }

    }
}
