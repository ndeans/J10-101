package us.deans.javastudy.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import us.deans.javastudy.support.LogPrinter;
import us.deans.javastudy.support.WordWrapException;
import us.deans.javastudy.operations.core10.OpWordWrap;

public class OpWordWrapTest {
	
	static LogPrinter LP = LogPrinter.getInstance();
	static OpWordWrap pinto13 = new OpWordWrap();
	String text1 = "Four score and seven years ago our fathers brought forth upon this continent a new nation, conceived in liberty and dedicated to the proposition that all men are created equal";
	String text2 = "coding this word wrap excercise was quite an accomplishment, don't you think?";
	
	@Test
	void testOpWordWrap_Under13_Text1() {
		LP.printHead("OpWordWrap.under13(Text1)");
		Boolean test = false;
		try {
			test = pinto13.under13(text1);
		} catch (WordWrapException e) {
			LP.printMsg(e.toString());
		}
		assertTrue(test);
	}
	
	@Test
	void testOpWordWrap_Under13_Text2() {
		LP.printHead("OpWordWrap.under13(Text2)");
		Boolean test = false;
		try {
			test = pinto13.under13(text2);
		} catch (WordWrapException e) {
			LP.printMsg(e.toString());
		}
		assertFalse(test);
	}
}
