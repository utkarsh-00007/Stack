import java.util.Scanner;
// Topic : Stack using array

public class StackDemo1 {
    int ar[];
    int top;
    StackDemo1() {
        ar = new int[5];
        top =-1;
    }
    void push(){
        if (top == ar.length-1){
            System.out.println("Stack Full");
        }else {
            System.out.println("Enter Data : ");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            top = top+1;
            ar[top]=data;
            System.out.println("Data Inserted....");


        }
//        System.out.println("Push function is working");
    }
    void pop(){
        if (top==-1){
            System.out.println("Stack Empty");
        } else {
            System.out.println(" Deleted...."+ ar[top]);
            top=top-1;

        }
//        System.out.println("Pop function is working");
    }
    void traverse(){
        if (top ==-1){
            System.out.println("Stack Empty");
        }else {
            System.out.println("-------- Stack Element --------");
            for (int i = top; i>=0 ; i--) {
                System.out.println(ar[i]);
            }
        }
//        System.out.println("Display Function is working");
    }
    public static void main(String[] args) {
        StackDemo1 obj1 = new StackDemo1();
        while (true){
            System.out.println("Press 1 for Push");
            System.out.println("Press 2 for Pop");
            System.out.println("Press 3 for Display/Traverse");
            System.out.println("Press 4 for Exit");
            System.out.println("Enter Your Choice : ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    obj1.push();
                    break;
                case 2:
                    obj1.pop();
                    break;
                case 3:
                    obj1.traverse();
                    break;
                case 4:
                    System.exit(0); //To Terminate (only 0 or 1)
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }

    }
}
