package us.deans.javastudy.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.Test;

import us.deans.javastudy.base.BaseTest;
import us.deans.javastudy.model.EmployeeContractModel;
import us.deans.javastudy.model.EmployeeModel;
import us.deans.javastudy.operations.core10.StreamAPI_Combine;

public class StreamAPI_CombineTest extends BaseTest {

    @Test
    public void test_StreamCombine() {

        StreamAPI_Combine sct = new StreamAPI_Combine();
        List<EmployeeModel> el = sct.getPlm();
        List<EmployeeContractModel> ec = sct.getPtc();

        List<EmployeeModel> cl = sct.combine(el, ec);
        assertTrue(true);

    }


}
