package us.deans.javastudy.operations.core10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import us.deans.javastudy.support.ColorDef;
import us.deans.javastudy.support.SortByLevel;

public class DmSortListComparator {

    ArrayList<ColorDef> alist;

    public DmSortListComparator() {

        // create and populate the list
        ColorDef rec;
        alist = new ArrayList<ColorDef>();

        rec = new ColorDef("red", 1);
        alist.add(rec);
        rec = new ColorDef("green", 5);
        alist.add(rec);
        rec = new ColorDef("blue", 3);
        alist.add(rec);

        System.out.println("Unsorted...");
        for (int i = 0; i < alist.size(); i++)
            System.out.println(alist.get(i));

    }

    public void sortListByLevel() {

// .... implements the Comparator and overrides the compare method. 
        Comparator<ColorDef> comparator = new Comparator<ColorDef>() {
            @Override
            public int compare(ColorDef a, ColorDef b) {
                return a.getLevel() - b.getLevel();
            }
        };
        Collections.sort(alist, comparator);

        System.out.println("\nSorted by level ascending...");
        for (int i = 0; i < alist.size(); i++)
            System.out.println(alist.get(i));


// .... uses an implementation of the Comparator
        Collections.sort(alist, new SortByLevel().reversed());

        System.out.println("\nSorted by level descending...");
        for (int i = 0; i < alist.size(); i++)
            System.out.println(alist.get(i));

    }


    public void sortListByColor() {

        // implements the Comparator and overrides the compare method. ( Strings are tricky )
        Collections.sort(alist, Comparator.comparing((ColorDef def) -> def.getName()));

        System.out.println("\nSorted by color...");
        for (int i = 0; i < alist.size(); i++)
            System.out.println(alist.get(i));

    }

}
	

