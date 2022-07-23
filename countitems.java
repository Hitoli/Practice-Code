import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class countitems {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> items
                = new ArrayList<ArrayList<String> >();
        items.add(new ArrayList<String>());
        items.add(new ArrayList<String>());
        items.add(new ArrayList<String>());
        items.get(0).add(0,"phone");
        items.get(0).add(1,"blue");
        items.get(0).add(2,"pixel");
        items.get(1).add(0,"computer");
        items.get(1).add(1,"silver");
        items.get(1).add(2,"lenovo");
        items.get(2).add(0,"phone");
        items.get(2).add(1,"gold");
        items.get(2).add(2,"iphone");
        System.out.println(items);
        String rulevalue="silver";
        String rulekey = "color";

        System.out.println(isItems(items,rulekey,rulevalue));

    }
    static int isItems(ArrayList<ArrayList<String>>items,String rulekey,String rulevalue){
       int index=0;
        if(rulekey.equals("color")){
           index=1;
       }
        if(rulekey.equals("name")){
            index=2;
        }
        int count=0;
        for(int i=0; i<=items.size(); i++){
            if(items.get(index).equals(rulevalue)){
                count++;
            };
        }
        return count;

    }
}
