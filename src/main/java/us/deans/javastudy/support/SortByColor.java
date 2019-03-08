package us.deans.javastudy.support;

import java.util.Comparator;

public class SortByColor implements Comparator<ColorDef> {
	
	public int compare(ColorDef a, ColorDef b) {
		return a.getLevel() - b.getLevel();
	}
	
}
