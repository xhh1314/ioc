package org.bean.factory;



public interface BeanDefinition {
	
	String getBeanName();
	String getBeanId();
	String getBeanResource();
	PropertyValues getBeanPropertys();
	Class<?> getBeanClass();

}
