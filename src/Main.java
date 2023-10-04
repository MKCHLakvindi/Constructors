public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Student 1 Information:");
        student1.displayInfo();
        System.out.println();

        Student student2 = new Student("Alice", 18, 'A');
        System.out.println("Student 2 Information:");
        student2.displayInfo();
        System.out.println();

        Student student3 = new Student("Bob", 20);
        System.out.println("Student 3 Information:");
        student3.displayInfo();
    }
}

