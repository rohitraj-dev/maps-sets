import java.util.*;
import java.util.HashSet;
import java.util.TreeSet;

import javax.swing.ScrollPaneConstants;

class SetsSTL
{
    public static void main(String[] args)
    {
        TreeSet<Integer> set = new TreeSet<>();
        HashSet<Integer> set = new HashSet<>();
        set.add(77);
        set.add(65);
        set.add(2);
        set.add(2);
        set.add(11);
        set.add(45);
        set.add(3);
        set.add(77);
        for(int ele : set)
        {
            set.remove(ele);
        }
        for(int ele : set)
        {
            System.out.print(ele+" ");
        }
        set.clear();
        System.out.println();
        for(int ele : set)
        {
            System.out.print(ele+" ");
        }
        System.out.println(set.size());
        System.out.println(set);
        System.out.println(set.contains(21)+" "+set.contains(10));
        set.remove(21);
        System.out.println(set.contains(21));
        System.out.println(set.size());
    }
}