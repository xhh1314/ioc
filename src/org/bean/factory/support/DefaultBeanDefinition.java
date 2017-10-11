package org.bean.factory.support;

import org.bean.factory.BeanDefinition;
import org.bean.factory.PropertyValues;

public class DefaultBeanDefinition implements BeanDefinition{
	
	public static final String DEFAULT_SCOPE="singleton";
	static final String SINGLETON="singleton";
	static final String PROTOTYPE="prototype";
	String scope;
	String id;
	String name;
	String resource;
	PropertyValues pvs;
	Class<?> beanClass;

	@Override
	
	public String getBeanName() {
 		return null;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getBeanId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public PropertyValues getBeanPropertys() {
		// TODO Auto-generated method stub
		return this.pvs;
	}

	@Override
	public String getBeanResource() {
		// TODO Auto-generated method stub
		return this.resource;
	}
	public void setBeanClass(String resource){
		 try {
			this.beanClass=Class.forName(resource);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Class<?> getBeanClass() {
		// TODO Auto-generated method stub
		return this.beanClass;
	}
	
	

}
