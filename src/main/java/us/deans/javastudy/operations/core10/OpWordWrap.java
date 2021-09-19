package us.deans.javastudy.operations.core10;

import java.util.ArrayList;

import us.deans.javastudy.base.BaseOperation;
import us.deans.javastudy.support.LogPrinter;
import us.deans.javastudy.support.WordWrapException;

public class OpWordWrap extends BaseOperation {

    static LogPrinter LP = LogPrinter.getInstance();

    public OpWordWrap() {
    }

    public Boolean under13(String in) throws WordWrapException {

        String[] words = in.split(" ");

        ArrayList<String> lineList = new ArrayList<String>();

        String line = "";
        int i = 0;

        // until all the words are processed
        while (i < words.length - 1) {

            // until line is filled.
            while (line.length() < 13) {

                if ((words[i].length() + 1) >= 13) {
                    throw new WordWrapException("'" + words[i] + "' is over 13 characters.");
                }

                if ((line.length() + words[i].length() + 1) < 13) {
                    // add word to line
                    if (line.isEmpty()) line = words[i];
                    else line = line + " " + words[i];
                    i++;
                } else {
                    // save word for next line
                    lineList.add(line);
                    LP.printMsg(line);
                    line = "";
                    break;
                }
            }

        }
        // add last word
        line = words[i];
        lineList.add(line);
        LP.printMsg(line);

        return true;
    }
}
