import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name; 
        System.out.print("What is your name: ");
        name = scanner.nextLine();
        
        
        int num;
        System.out.print("what is your age: ");
        num = scanner.nextInt();
        
        int num1;
        System.out.print("what is your weight: ");
        
        num1 = scanner.nextInt();
        
        Boolean bool;
        System.out.print("Do you smoke (true or false) : ");
        
        bool = scanner.nextBoolean();
        
        System.out.print(name + " " + num + " " + num1 + " " + bool);
    }
}