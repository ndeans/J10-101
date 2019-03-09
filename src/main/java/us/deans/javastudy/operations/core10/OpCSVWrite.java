package us.deans.javastudy.operations.core10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import us.deans.javastudy.base.BaseOperation;
import us.deans.javastudy.support.DsCustomer;

public class OpCSVWrite extends BaseOperation {

    private static final String CSV_HEADER = "id,name,address.age";

    List<DsCustomer> customers = Arrays.asList(
            new DsCustomer("1", "Jack Smith", "Massachusettes", 23),
            new DsCustomer("2", "Adam Johnson", "New York", 27),
            new DsCustomer("3", "Katherine Carter", "Washington DC", 26),
            new DsCustomer("4", "Jack London", "Nevada", 33),
            new DsCustomer("5", "Jason Bourne", "California", 36));

    FileWriter fw = null;
    
    public OpCSVWrite() {

        try {

            fw = new FileWriter("customer.csv");

            fw.append(CSV_HEADER);
            fw.append('\n');

            for (DsCustomer customer : customers) {
                fw.append(customer.getId());
                fw.append(',');
                fw.append(customer.getName());
                fw.append(',');
                fw.append(customer.getAddress());
                fw.append(',');
                fw.append(String.valueOf(customer.getAge()));
                fw.append('\n');
            }

            System.out.println("Write CSV successfully!");

        } catch(IOException x2) {
            System.out.println("Writing CSV error!");
            x2.printStackTrace();
        } catch(Exception x1){
            System.out.println("Writing CSV error!");
            x1.printStackTrace();
        } finally {

            try {
                fw.flush();
                fw.close();
            } catch (IOException x) {
                System.out.println("flushing/closing error!");
                x.printStackTrace();
            }

        }

    }
    
	
}
