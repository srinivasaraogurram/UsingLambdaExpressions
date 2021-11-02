import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//Todo
/* We have a List of store items called myStoreList. 
We want to print out all of the items in our List 
using a specific format.
Task:


In printStoreInventory(), print all of the items in myStoreList using 
the forEach() method with a Lambda Expression. Each item should be 
printed on a separate line using System.out.println() with the string 
My Store item: concatenated with the item's value.

Run your program by clicking the Run button below the Terminal. 
OR navigate to the source code directory with cd ~/workspace/src/main/java/ 
in the Terminal. Then enter javac Main.java to compile. Finally, enter java
 Main to run your program.

*/
public class StoreInventory {
    Set<String> superCycleSet = new TreeSet<>();
    List<String> myStoreList = new ArrayList<>();

    public StoreInventory() {
        myStoreList.add("Bicycle");
        myStoreList.add("Tricycle");
        myStoreList.add("Scooter");
    }

    public void printStoreInventory() {
        myStoreList.forEach(item -> System.out.println("My Store item:" + item+ "\n"));
    }

    public static void main(String[] args) {
        StoreInventory storeInventory  = new StoreInventory();
        storeInventory.printStoreInventory();

    }
}
