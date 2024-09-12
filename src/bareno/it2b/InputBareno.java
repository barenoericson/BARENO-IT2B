
package bareno.it2b;

import java.util.Scanner;

public class InputBareno {
    public void input(){
        
             
        Scanner sc = new Scanner(System.in);
        
        int not;
        
        System.out.println("---- Class Implementor ----");
        
        System.out.println("Enter No. of Task: ");
        not = sc.nextInt();
                
        for (int x = 0; x < not; x++){
            System.out.println("Enter Details of Task ");
            System.out.println("Task ID: ");
            String ID = sc.next();
            System.out.println("Task Name: ");
            String Tname = sc.next();
            String Tname2 = sc.next();
            System.out.println("Assigned To(please put last name of the person): ");
            String assign = sc.next();
            String assign2 = sc.next();
            System.out.print("Due Date: ");
            int due = sc.nextInt();
            System.out.println("Priority: ");
            String prio = sc.next();
            System.out.println("Status: ");
            String stat = sc.next();
            String stat2 = sc.next();
            
        
            
        }
    }
    
}
