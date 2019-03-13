package us.deans.javastudy.operations.core10;

import java.util.logging.Level;
import java.util.logging.Logger;

import us.deans.javastudy.base.BaseOperation;

public class LoggingAPI extends BaseOperation {

	private static final Logger logger = Logger.getLogger(LoggingAPI.class.getName());
	
	@Override
	public void start() {

		logger.log(Level.INFO, "Hello World!");

	}
	
}
