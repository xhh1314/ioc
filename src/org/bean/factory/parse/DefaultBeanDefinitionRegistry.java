package org.bean.factory.parse;

import org.bean.factory.BeanDefinition;
import org.bean.factory.BeanFactory;

public class DefaultBeanDefinitionRegistry implements BeanDefinitionRegistry{

	@Override
	public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void registerBeanDefinition(BeanFactory beanFactory, BeanDefinitionReader reader) {
		// TODO Auto-generated method stub
		reader.setBeanFactory(beanFactory);
	}

}
