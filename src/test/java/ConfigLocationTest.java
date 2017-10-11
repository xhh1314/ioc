package test.java;

import java.io.File;

import org.bean.factory.support.ConfigLocation;
import org.junit.Test;

public class ConfigLocationTest {
	
	@Test
	public void test1(){
		ConfigLocation cf=new ConfigLocation("classPath:applicationContext.xml");
		String path=cf.getPath();
		File file=new File(path);
	}

}
