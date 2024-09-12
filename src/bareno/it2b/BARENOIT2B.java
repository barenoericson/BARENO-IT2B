
package bareno.it2b;
import java.util.Scanner;
import java.util.ArrayList;
public class BARENOIT2B {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       ArrayList<AddView> tasks = new ArrayList<>();
       
       System.out.println("---- Class Implementor ----");

        System.out.print("Enter No. of Tasks: ");
        int not = sc.nextInt();
        sc.nextLine(); // Consume newline left-over

        for (int x = 0; x < not; x++) {
            System.out.println("\nEnter Details of Task " + (x + 1) + ":");

            System.out.print("Task ID: ");
            String ID = sc.nextLine();

            System.out.print("Task Name 1: ");
            String Tname = sc.nextLine();

            System.out.print("Task Name 2: ");
            String Tname2 = sc.nextLine();

            System.out.print("Assigned To (please put last name of the person 1): ");
            String assign = sc.nextLine();

            System.out.print("Assigned To (please put last name of the person 2): ");
            String assign2 = sc.nextLine();

            System.out.print("Due Date: ");
            int due = sc.nextInt();
            sc.nextLine(); // Consume newline left-over

            System.out.print("Priority: ");
            String prio = sc.nextLine();

            System.out.print("Status 1: ");
            String stat = sc.nextLine();

            System.out.print("Status 2: ");
            String stat2 = sc.nextLine();

            // Create a new AddView instance with the input values
            AddView task = new AddView();
            task.add(ID, Tname, Tname2, assign, assign2, due, prio, stat, stat2);

            // Add the task to the list
            tasks.add(task);
        }

        // Display all tasks
        System.out.println("\n---- Task Details ----");
        for (AddView task : tasks) {
            task.view();
        }

        sc.close();
    }
}
  
        
    
