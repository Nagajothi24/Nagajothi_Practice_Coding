import java.util.Scanner;

public class StudentSystem{

    class Node{
        String name;
        String dept;
        long phno;
        Node next;
        
        public Node(String name, String dept, long phno){
            this.name = name;
            this.dept = dept;
            this.phno = phno;
            this.next = null;
        }
    }
    Node head = null , tail = null;

    public void insert(String name, String dept, long phno)  
    {
        Node newnode = new Node(name,dept,phno);
        if(head == null)
        {
            head = newnode;
            tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }

    // helper function to compare strings manually
    boolean isSame(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    void delete(String name )
    {
        if(head==null)
        {
            System.out.println("Empty list");
            return ;
        }

        Node c = head , p = null ;

        // if head matches
        if(isSame(name, c.name))
        {
            head = head.next;
            System.out.println("Deleted: " + name);
            return;
        }

        // search in list
        while(c!=null && !isSame(name, c.name))
        {
            p = c;
            c = c.next;
        }

        if(c==null){ 
            System.out.println("Name not found: " + name);
            return;
        }

        // if found at last node
        if(c==tail){
            tail = p;
            tail.next = null;
        }
        else{
            p.next = c.next;
        }

        System.out.println("Deleted: " + name);
    }

    void display()
    {
        Node i;
        if(head==null)
        {
            System.out.println("Empty list");
            return ;
        }
        for(i=head ; i!=null ; i = i.next )
        {
            System.out.print(i.name +" ");
            System.out.print(i.dept +" ");
            System.out.print(i.phno +" ");
            System.out.println();
        }
        System.out.println("\n-------------------------------\n");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Operation;
        StudentSystem s = new StudentSystem();
        do{
            System.out.println("Enter the Operation: 1)Insert 2)Delete 3)Display 0)Exit");
            Operation = in.nextInt();
            in.nextLine(); // consume leftover newline
        switch(Operation){
            case 1:
                System.out.print("Enter name: ");
                String name = in.nextLine();
                System.out.print("Enter department: ");
                String dept = in.nextLine();
                System.out.print("Enter phone number: ");
                long phno = in.nextLong();
                in.nextLine();
                s.insert(name, dept, phno);
                break;
            case 2:
                System.out.print("Enter name to delete: ");
                String delName = in.nextLine();
                s.delete(delName);
                break;
            case 3:
                s.display();
                break;
            case 0:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid Option");
        }
       
    }while(Operation!=0);
        
    }

}
