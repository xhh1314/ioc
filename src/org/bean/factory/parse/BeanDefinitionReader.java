package org.bean.factory.parse;

import org.bean.factory.BeanFactory;
import org.bean.factory.support.ConfigLocation;

public interface BeanDefinitionReader {
	int loadBeanDefinitions(ConfigLocation location);
	void setBeanFactory(BeanFactory beanContext);
	

}
