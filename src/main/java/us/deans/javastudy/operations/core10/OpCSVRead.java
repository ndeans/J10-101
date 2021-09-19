package us.deans.javastudy.operations.core10;

import us.deans.javastudy.base.BaseOperation;
import us.deans.javastudy.model.DsCustomer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OpCSVRead extends BaseOperation {

    private static final int CUSTOMER_ID_IDX = 0;
    private static final int CUSTOMER_NAME_IDX = 1;
    private static final int CUSTOMER_ADDRESS_IDX = 2;
    private static final int CUSTOMER_AGE = 3;

    BufferedReader fr = null;

    public void start() {

        try {

            List<DsCustomer> customers = new ArrayList<DsCustomer>();
            String line = "";
            fr = new BufferedReader(new FileReader("customer.csv"));
            fr.readLine();

            while ((line = fr.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length > 0) {
                    DsCustomer customer = new DsCustomer(tokens[CUSTOMER_ID_IDX], tokens[CUSTOMER_NAME_IDX], tokens[CUSTOMER_ADDRESS_IDX], Integer.parseInt(tokens[CUSTOMER_AGE]));
                    customers.add(customer);
                }
            }

            for (DsCustomer customer : customers) {
                System.out.println(customer);
            }

        } catch (IOException x1) {
            System.out.println("Reading CSV Error!");
            x1.printStackTrace();
        }
    }
}
