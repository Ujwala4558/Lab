import java.util.Scanner;

public class Student
{
    private String name;
    private int s_id;
    private int m1;
    private int m2;
    private int m3;
    private int maximum;
    private double average;

    public Student(String n, int a, int s1, 
    int s2, int s3) {
        name = n;
        m1 = s1;
        m2 = s2;
        m3 = s3;
    }
    

    public Student(int n, int a, int s1, 
    int s2, int s3) {
        s_id = n;
        s_id= s1;
        s_id= s2;
        s_id = s3;
    }

    public void accept() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = in.nextLine();
        
        System.out.print("Enter s_id: ");
        s_id;
        
        System.out.print("Enter Subject 1 Marks: ");
        m1=in.nextInt();
        System.out.print("Enter Subject 2 Marks: ");
        m2 = in.nextInt();
        System.out.print("Enter Subject 3 Marks: ");
        m3 = in.nextInt();
        
    
        System.out.print("Enter s_id1: ");
        System.out.print("Enter s_id2: ");
        System.out.print("Enter s_id3: ");
        
    }
    public void compute() {
        if (m1 > m2 && m1 > m3)
            maximum = m1;
        else if (m2 > m1 && m2 > m3)
            maximum = m2;
        else
            maximum = m3;

        average = (m1 + m2 + m3) / 3.0;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("s_id:"+ s_id);
        System.out.println("Subject 1 Marks: " + m1);
        System.out.println("Subject 2 Marks: " + m2);
        System.out.println("Subject 3 Marks: " + m3);
        
        System.out.println("s_id1: " + s1);
        System.out.println("s_id2: " + s2);
        System.out.println("s_id3: " + s3);
        System.out.println("Maximum Marks: " + maximum);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String args[]) {
        Student obj = new Student();
        obj.accept();
        obj.compute();
        obj.display();
    }
}