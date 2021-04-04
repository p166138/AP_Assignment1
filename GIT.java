import java.util.ArrayList;
import java.util.List;
  
public class GIT{
  
    public static void main(String args[])
    {
        List<String> al = new ArrayList<>();
  
        al.add("Git");
        al.add("Assignment");
        al.add(1, "Push");
  
        // Using the Get method and the
        // for loop
        for (int i = 0; i < al.size(); i++) {
  
            System.out.print(al.get(i) + " ");
        }
  
        System.out.println();
  
        // Using the for each loop
        for (String str : al)
            System.out.print(str + " ");
    }
}