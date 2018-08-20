package comparators;

import java.util.Comparator;
import record_classes.ColorDef;

public class SortByLevel implements Comparator<ColorDef>{

	public int compare(ColorDef a, ColorDef b) {
		return a.getLevel() - b.getLevel();
	}
	 
}
