import java.util.Scanner;
class Node{
    int rollno;
    Node next;
}
public class SinglyLinkedlist {
    Node START;
    SinglyLinkedlist(){

        START =null;

    }
    void insert(){
        System.out.println("Enter Your Roll Number : ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node nn = new Node();
        nn.rollno=data;
        nn.next=null;

        if (START==null){
            START=nn;
        }else {
            Node current=START;
            while (current.next!=null){
                current=current.next;
            }
            current.next=nn;
        }
        System.out.println("Data Inserted....");
//        System.out.println("Insert Function is working");
    }
    void delete(){

        if (START==null){
            System.out.println("List empty");
        }else {
            System.out.println("Deleted : "+ START.rollno);
            if (START.next==null){
                START=null;
            } else {
                START=START.next;
            }
        }
//        System.out.println("Delete Function is working");
    }
    void traverse(){
        if (START==null){
            System.out.println("List Empty");
        }
        else {
            Node current;
            for (current=START;current!=null;current=current.next){
                System.out.println(current.rollno);
            }
        }
//        System.out.println("Traverse Function is working");
    }
    public static void main(String[] args) {
        SinglyLinkedlist obj = new SinglyLinkedlist();
        while (true){
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for display/traverse");
            System.out.println("Press 4 for exit");
            System.out.println("Enter your choice : ");
            Scanner sc = new Scanner(System.in);
            int choice= sc.nextInt();
            switch (choice){
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
