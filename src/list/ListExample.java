package list;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListExample {
    public static void main(String[] args){
        List<String> fruit= new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Cherry");
        fruit.add("pears");
        System.out.println(fruit);
        System.out.println("Elements in the list");
        for(String f: fruit){
            System.out.println(f);
        }
        System.out.println("Elements in the list using iterator");
        Iterator<String> obj=fruit.iterator();
        while(obj.hasNext()) {
            String i = obj.next();
            System.out.println(i);
        }
        System.out.println("some of the method in the iterator function");
        System.out.println("Remove function");
        obj.remove();
        for (String i : fruit) {
            System.out.println(i);
        }
    }

}
