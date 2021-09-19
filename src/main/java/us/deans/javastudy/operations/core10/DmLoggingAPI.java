package us.deans.javastudy.operations.core10;

import java.util.logging.Level;
import java.util.logging.Logger;

import us.deans.javastudy.base.BaseOperation;

public class DmLoggingAPI extends BaseOperation {

    private static final Logger logger = Logger.getLogger(DmLoggingAPI.class.getName());

    @Override
    public void start() {

        logger.log(Level.INFO, "Hello World!");

    }

}
