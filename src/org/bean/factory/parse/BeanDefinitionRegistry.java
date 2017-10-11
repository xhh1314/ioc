package org.bean.factory.parse;

import org.bean.factory.BeanDefinition;
import org.bean.factory.BeanFactory;

public interface BeanDefinitionRegistry {
	
	void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
	void registerBeanDefinition(BeanFactory beanFactory,BeanDefinitionReader reader);
			
}
