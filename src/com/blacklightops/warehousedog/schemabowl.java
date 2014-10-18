package com.blacklightops.warehousedog;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
public class schemabowl {
	static final Logger logger = Logger.getLogger(schemabowl.class);
	public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.debug("Hello World!");
	}

}
