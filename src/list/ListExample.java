package list;
import java.util.*;

public class ListExample {
    public static void main(String[] args){
        List<String> fruit= new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Cherry");
        fruit.add("pears");
        System.out.println("\n"+fruit);
        System.out.println("\n*Elements in the list");
        for(String f: fruit){
            System.out.println(f);
        }
        System.out.println("\n *Elements in the list using iterator");
        Iterator<String> obj=fruit.iterator();
        while(obj.hasNext()) {
            String i = obj.next();
            System.out.println(i);
        }
        System.out.println("\n *some of the method in the iterator function, iterator.remove()");
        obj.remove();
        for (String i : fruit) {
            System.out.println(i);
        }
        fruit.add("Pears");
        System.out.println(fruit);
        System.out.println("\n* Adding at particular index");
        fruit.addFirst("Watermelon");

//        or fruit.add(1,"Watermelon");
        fruit.add(2,"Pineapple");
        System.out.println(fruit);

//        Creating one more list
        List<String> veg=new ArrayList<>();
        veg.add("Tomato");
        veg.add("Onion");
        veg.add("Potato");
        fruit.addAll(veg);
        System.out.println("\n *Updated using adAll()\n"+fruit);

//        Using boolean addAll(int index,collection<? extends E>c)
        boolean y= fruit.addAll(1,veg);
        System.out.println("\n"+y);
        System.out.println(fruit);

//        using E get(int index)
        System.out.println("\n element at a particular index, eg: at index 5"+fruit.get(5));

//        using E indexOf(obj)
        System.out.println("\n index of a particular element : "+fruit.indexOf("Onion"));

//        Since there are two onions, declaration for finding the last occurrence index
        System.out.println("\n index of last occurrence of repeating element: "+fruit.lastIndexOf("Onion"));

//        Using iterator on a particular index ListIterator<E> listIterator(int index)
        ListIterator<String> obj1=fruit.listIterator(4);
        System.out.println("\n Iterator from a particular index");
        while(obj1.hasNext()){
            String e=obj1.next();
            System.out.println(e);
        }

//        Creating an immutable List
        List<String> cons=List.of("cucumber","Chilli","Capsicum");
        fruit.addAll(cons);
        fruit.set(2,"Gua");
        System.out.println("\n"+fruit);
        System.out.println(fruit.size());

//        Using sort function
       Collections.sort(fruit);
       System.out.println(fruit);

//           Creating a sublist
        List<String> a=fruit.subList(0,3);
        System.out.println("\n"+a);
    }
}
