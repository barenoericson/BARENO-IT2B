
package bareno.it2b;

public class AddView {
    String ID;
    String Tname;
    String Tname2;
    String assign;
    String assign2;
    int due;
    String prio;
    String stat;
    String stat2;
    
    public void add(String ID,String Tname,String Tname2,String assign,String assign2,int due,String prio,String stat,String stat2){
        
         this.ID = ID;
        this.Tname = Tname;
        this.Tname2 = Tname2;
        this.assign = assign;
        this.assign2 = assign2;
        this.due = due;
        this.prio = prio;
        this.stat = stat;
        this.stat2 = stat2;
        
    }
    public void view() {
        System.out.println("ID: " + ID);
        System.out.println("Tname: " + Tname);
        System.out.println("Tname2: " + Tname2);
        System.out.println("Assign: " + assign);
        System.out.println("Assign2: " + assign2);
        System.out.println("Due: " + due);
        System.out.println("Priority: " + prio);
        System.out.println("Status: " + stat);
        System.out.println("Status2: " + stat2);
    }
}
