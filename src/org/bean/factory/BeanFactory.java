package org.bean.factory;

public interface BeanFactory {

	Object getBean(String beanName);
	
	<T> T getBean(Class<T> classType);

	
}
