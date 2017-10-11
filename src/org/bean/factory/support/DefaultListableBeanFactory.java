package org.bean.factory.support;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.bean.factory.BeanDefinition;
import org.bean.factory.FactoryBeanRegistry;
import org.bean.factory.parse.BeanDefinitionReader;

public class DefaultListableBeanFactory extends AbstractBeanFactroy{
	
	
     private final Map<Class<?>,String> beanType=new ConcurrentHashMap<Class<?>,String>(64);
     private final Map<String,Object> beanContext=new ConcurrentHashMap<String,Object>(64);

	@Override
	public void setBeanDefinition(BeanDefinition bean) {
		// TODO Auto-generated method stub
		
		beanType.put(bean.getClass(), bean.getBeanId());
	}

	@Override
	public BeanDefinition getBeanDefinition(String  name) {
		// TODO Auto-generated method stub
		throw new RuntimeException("method don't implement");
	}

	@Override
	public void putBeanDefinition(BeanDefinition bean) {
		// TODO Auto-generated method stub
		beanType.put(bean.getBeanClass(), bean.getBeanId());
	}


     
	

}
