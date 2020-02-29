package net.lecousin.framework.log.bridges;

import net.lecousin.framework.core.test.LCCoreAbstractTest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class TestApacheCommonsLogging  extends LCCoreAbstractTest {

	@Test
	public void test() {
		Log l = LogFactory.getLog("test");
		l = LogFactory.getLog("test");
		Object o1 = Integer.valueOf(11);
		Object o2 = Integer.valueOf(22);
		Object o3 = Integer.valueOf(33);
		l.isTraceEnabled();
		l.trace("test");
		l.trace(null);
		l.trace("test", new Exception());
		l.trace(null, new Exception());
		l.isDebugEnabled();
		l.debug("test");
		l.debug(null);
		l.debug("test", new Exception());
		l.debug(null, new Exception());
		l.isInfoEnabled();
		l.info("test");
		l.info(null);
		l.info("test", new Exception());
		l.info(null, new Exception());
		l.isWarnEnabled();
		l.warn("test");
		l.warn(null);
		l.warn("test", new Exception());
		l.warn(null, new Exception());
		l.isErrorEnabled();
		l.error("test");
		l.error(null);
		l.error("test", new Exception());
		l.error(null, new Exception());
		l.isFatalEnabled();
		l.fatal("test");
		l.fatal(null);
		l.fatal("test", new Exception());
		l.fatal(null, new Exception());
	}
	
}
