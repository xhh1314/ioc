package org.bean.factory.parse;

import java.io.InputStream;

import org.bean.factory.BeanFactory;
import org.bean.factory.support.AbstractBeanFactroy;
import org.dom4j.Document;
public abstract class AbstractBeanDefinitionParse {

	AbstractBeanFactroy beanFactory;
	InputStream resource;
	public abstract int parseBean(Document document); 
	public AbstractBeanDefinitionParse(AbstractBeanFactroy beanFactory,InputStream input){
		this.beanFactory=beanFactory;
		this.resource=input;
	}

}
