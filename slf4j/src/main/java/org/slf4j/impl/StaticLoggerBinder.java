package org.slf4j.impl;

import net.lecousin.framework.log.bridges.slf4j.LCLoggerFactory;

import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

public class StaticLoggerBinder implements LoggerFactoryBinder {
    /**
     * The unique instance of this class.
     */
    private static final StaticLoggerBinder SINGLETON = new StaticLoggerBinder();

    /**
     * Return the singleton of this class.
     * 
     * @return the StaticLoggerBinder singleton
     */
    public static final StaticLoggerBinder getSingleton() {
        return SINGLETON;
    }

    /**
     * Declare the version of the SLF4J API this implementation is compiled against. 
     * The value of this field is modified with each major release. 
     */
    // to avoid constant folding by the compiler, this field must *not* be final
    @SuppressWarnings({"squid:S1444", "squid:S3008"}) // !final && naming convention
    public static String REQUESTED_API_VERSION = "1.7.25"; // !final

    private static final String LOGGER_FACTORY_CLASS_STR = LCLoggerFactory.class.getName();

    /**
     * The ILoggerFactory instance returned by the {@link #getLoggerFactory}
     * method should always be the same object
     */
    private final ILoggerFactory loggerFactory;

    private StaticLoggerBinder() {
        loggerFactory = new LCLoggerFactory();
    }

	@Override
    public ILoggerFactory getLoggerFactory() {
        return loggerFactory;
    }

	@Override
    public String getLoggerFactoryClassStr() {
        return LOGGER_FACTORY_CLASS_STR;
    }

}
