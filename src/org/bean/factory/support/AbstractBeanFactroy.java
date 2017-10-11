package org.bean.factory.support;

import org.bean.context.factory.ApplicationContext;
import org.bean.factory.BeanDefinition;
import org.bean.factory.BeanFactory;
import org.bean.factory.parse.BeanDefinitionReader;
import org.bean.factory.parse.DefaultBeanDefinitionReader;

public abstract class AbstractBeanFactroy implements BeanFactory{
	
	public static String SINGLETON="singleton";
	public static String PROTOTYPE="prototype";
	public ApplicationContext applicationContext;

	@Override
	public Object getBean(String beanName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T getBean(Class<T> classType) {
		// TODO Auto-generated method stub
		return null;
	}
	

	public abstract void setBeanDefinition(BeanDefinition bean);
	
	public abstract BeanDefinition getBeanDefinition(String name);
		
	
	public abstract void putBeanDefinition(BeanDefinition bean); 

}
