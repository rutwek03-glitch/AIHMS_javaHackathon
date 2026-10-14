package aihms;
import java.util.*;
public final class CollectionsModule {
    private CollectionsModule(){}
    public static void demonstrate(List<Patient> patients){
        System.out.println("\\n=== COLLECTIONS MODULE ===");
        List<Patient> list=new ArrayList<>();
        list.addAll(patients); // addAll
        System.out.println("size="+list.size()+", isEmpty="+list.isEmpty());
        System.out.println("contains first="+(!list.isEmpty() && list.contains(list.get(0))));
        System.out.println("containsAll copy="+list.containsAll(new ArrayList<>(list)));
        Collections.sort(list); // Comparable: ID
        System.out.println("sort by ID (Comparable): "+list);
        list.sort(new PatientNameComparator()); // Comparator: name
        System.out.println("sort by name (Comparator): "+list);
        if(!list.isEmpty()){
            System.out.println("min ID="+Collections.min(list));
            System.out.println("max ID="+Collections.max(list));
            System.out.println("toArray length="+list.toArray().length);
        }
        List<String> services=new ArrayList<>(Arrays.asList("Beds","Pharmacy","Lab","Beds"));
        System.out.println("frequency(Beds)="+Collections.frequency(services,"Beds"));
        Collections.swap(services,0,1); System.out.println("swap="+services);
        Collections.reverse(services); System.out.println("reverse="+services);
        Collections.rotate(services,1); System.out.println("rotate="+services);
        Collections.replaceAll(services,"Beds","Bed Management"); System.out.println("replaceAll="+services);
        Collections.shuffle(services); System.out.println("shuffle="+services);
        List<String> target=new ArrayList<>(Arrays.asList("A","B","C"));
        Collections.copy(target,Arrays.asList("X","Y","Z")); System.out.println("copy="+target);
        System.out.println("disjoint="+Collections.disjoint(Arrays.asList("A"),Arrays.asList("X")));
        List<String> sorted=new ArrayList<>(services); Collections.sort(sorted);
        System.out.println("binarySearch Lab="+Collections.binarySearch(sorted,"Lab"));
        List<String> demo=new ArrayList<>(Arrays.asList("Beds","Lab","Beds","Pharmacy"));
        System.out.println("get(0)="+demo.get(0)+", indexOf(Beds)="+demo.indexOf("Beds")
            +", lastIndexOf(Beds)="+demo.lastIndexOf("Beds")+", subList="+demo.subList(0,2));
        demo.set(1,"Laboratory"); demo.remove("Beds");
        System.out.println("after set/remove="+demo);
        demo.removeAll(Arrays.asList("Laboratory")); demo.retainAll(Arrays.asList("Pharmacy"));
        Iterator<String> it=demo.iterator(); while(it.hasNext()) System.out.println("iterator="+it.next());
        demo.clear(); System.out.println("after clear, isEmpty="+demo.isEmpty());
        // Other common methods include add, remove, contains, iterator, toArray, size, clear, etc.
    }
}
