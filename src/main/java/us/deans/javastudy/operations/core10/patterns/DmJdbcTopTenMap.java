package us.deans.javastudy.operations.core10.patterns;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import us.deans.javastudy.base.BaseOperation;

public class DmJdbcTopTenMap extends BaseOperation implements IDataAdapter_TopTen_Map {

    Connection conn;

    public DmJdbcTopTenMap() {
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "system", "!code");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Map<Integer, String> getMapOfRecords() {

        Map<Integer, String> map = new HashMap<>();

        try {

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from hr.top_ten_list");

            int i = 101;
            while (rs.next()) {

                DataRecord data = new DataRecord();
                data.FIRST_NAME = rs.getString(1);
                data.LAST_NAME = rs.getString(2);
                data.SALARY = rs.getLong(3);
                data.DEPARTMENT_NAME = rs.getString(4);
                data.CITY = rs.getString(5);

                String record = data.getString();
                lp.printMsg(i + ", " + record);
                map.put(i, record);
                i++;
                record = null;
                data = null;
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return map;
    }

}
