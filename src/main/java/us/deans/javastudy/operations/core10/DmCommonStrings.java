/**
 * This one answers the Common Names question I found on TestDome
 */
package us.deans.javastudy.operations.core10;

import java.util.HashSet;

import us.deans.javastudy.base.BaseOperation;

public class DmCommonStrings extends BaseOperation {

    String[] names1 = new String[]{"Ava", "Emma", "Olivia"};
    String[] names2 = new String[]{"Olivia", "Sophia", "Emma"};

    public DmCommonStrings() {
    }

    public void start() {
        System.out.println(String.join(", ", allNamesNoDuplicates(names1, names2)));            // should print Ava, Emma, Olivia, Sophia
        System.out.println(String.join(", ", commonNamesNoDuplicates(names1, names2)));        // should print Emma, Olivia

    }


    private String[] allNamesNoDuplicates(String[] names1, String[] names2) {

        HashSet<String> hset = new HashSet<String>();

        for (int i = 0; i < names1.length; i++) {
            hset.add(names1[i]);
        }

        for (int j = 0; j < names2.length; j++) {
            hset.add(names2[j]);
        }

        String[] answer = new String[hset.size()];
        hset.toArray(answer);
        return answer;

    }

    private String[] commonNamesNoDuplicates(String[] names1, String[] names2) {

        HashSet<String> hset = new HashSet<String>();

        for (int i = 0; i < names1.length; i++) {
            for (int j = 0; j < names2.length; j++) {

                if (names1[i].equals(names2[j])) {
                    hset.add(names1[i]);
                }
            }
        }

        String[] answer = new String[hset.size()];
        hset.toArray(answer);
        return answer;

    }

}
