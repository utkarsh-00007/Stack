import java.util.Scanner;
class Node2{
    int rollno;
    Node2 next ;
    Node2 previous;
}
public class DoublyLinkedList {
    Node2 START;

    DoublyLinkedList() {
        START = null;
    }

    void insert() {
        System.out.println("Enter Roll Number : ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        Node2 nn= new Node2();
        nn.rollno=data;
        nn.next=null;
        nn.previous=null;

        if (START==null)
        {
            START=nn;
        }
        else
        {
            Node2 current =START;
            while (current.next!=null)
            {
                current=current.next;
            }
            current.next=nn;
            nn.previous=current;


        }
        System.out.println("Data inserted...");

    }

    void delete() {
        if (START==null){
            System.out.println(" Doubly List Empty");
        }
        else {
            if (START.next==null){
                START=null;
            }
            else {
                System.out.println("Deleted : "+ START.rollno);
                START=START.next;
                START.previous=null;
            }
        }
    }

    void traverse() {
        if (START == null) {
            System.out.println("Doubly list Empty");
        } else {

            Node2 current;
            for (current = START; current != null; current = current.next) {
                System.out.println(" " + current.rollno);
            }
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        while (true) {
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for display/traverse");
            System.out.println("Press 4 for exit");
            System.out.println("Enter your choice : ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    System.out.println("Wrong Choice");

            }


        }
    }
}
