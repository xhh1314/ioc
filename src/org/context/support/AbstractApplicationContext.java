package org.context.support;

import org.bean.context.factory.ApplicationContext;
import org.bean.factory.FactoryBeanRegistry;
import org.bean.factory.parse.BeanDefinitionReader;
import org.bean.factory.parse.BeanDefinitionRegistry;
import org.bean.factory.parse.DefaultBeanDefinitionReader;
import org.bean.factory.parse.DefaultBeanDefinitionRegistry;
import org.bean.factory.support.AbstractBeanFactroy;
import org.bean.factory.support.ConfigLocation;
import org.bean.factory.support.DefaultListableBeanFactory;

public abstract class AbstractApplicationContext implements ApplicationContext, FactoryBeanRegistry {

	AbstractBeanFactroy beanContext;
	ConfigLocation location;
	BeanDefinitionReader beanReader;
	BeanDefinitionRegistry registry;

	public AbstractApplicationContext(String location) {
		this.location = new ConfigLocation(location);
	}

	void prepareInitional() {
		this.beanContext = new DefaultListableBeanFactory();
		this.beanReader = getBeanDefinitionReader();
		registry = getBeanDefinitionRegistry();
		registry.registerBeanDefinition(beanContext, beanReader);
		
	}
	void loadBean(){
		beanReader.loadBeanDefinitions(location);
	}
	void freshSiginal(){
		
	}

	BeanDefinitionReader getBeanDefinitionReader() {
		return new DefaultBeanDefinitionReader();
	}

	BeanDefinitionRegistry getBeanDefinitionRegistry() {
		return new DefaultBeanDefinitionRegistry();
	}

}
