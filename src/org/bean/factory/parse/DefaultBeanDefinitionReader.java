package org.bean.factory.parse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.bean.factory.BeanFactory;
import org.bean.factory.support.AbstractBeanFactroy;
import org.bean.factory.support.ConfigLocation;

public class DefaultBeanDefinitionReader implements BeanDefinitionReader{


	protected InputStream resource;
	private XmlBeanDefinitionParse xmlParse;
	AbstractBeanFactroy beanContext;
	public int loadBeanDefinitions(ConfigLocation location) {
		this.resource=getInputStream(location.getPath());
		// TODO Auto-generated method stub
		xmlParse=getXmlBeanDefinitionParse();
		return xmlParse.parseBean();
	}
	
	protected InputStream getInputStream(String path){
		InputStream input=null;
		try {
			input = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			assert false:"配置文件初始化错误！文件不存在";
			e.printStackTrace();
		}
		
		return input;
		
	}
	public XmlBeanDefinitionParse getXmlBeanDefinitionParse(){
		XmlBeanDefinitionParse xml=new XmlBeanDefinitionParse(beanContext,this.resource);
		return xml;
	}

	@Override
	public void setBeanFactory(BeanFactory beanContext) {
		// TODO Auto-generated method stub
		this.beanContext=(AbstractBeanFactroy) beanContext;
	}

}
