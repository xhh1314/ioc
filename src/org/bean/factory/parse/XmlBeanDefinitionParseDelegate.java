package org.bean.factory.parse;

import java.io.InputStream;
import java.util.List;

import org.bean.factory.support.AbstractBeanFactroy;
import org.bean.factory.support.DefaultBeanDefinition;
import org.bean.util.Assert;
import org.bean.util.StringUtils;
import org.dom4j.Document;
import org.dom4j.Element;

public class XmlBeanDefinitionParseDelegate extends AbstractBeanDefinitionParse{

	public XmlBeanDefinitionParseDelegate(AbstractBeanFactroy beanFactory, InputStream input) {
		super(beanFactory, input);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	@Override
	public int parseBean(Document document) {
		// TODO Auto-generated method stub
		if(!"beans".equals(document.getRootElement().getName()))
			throw new Error("配置文件必须以beans开头！");
		List<Element> beans=document.getRootElement().elements("bean");
		if(beans.isEmpty())
			return 0;
		int count=0;
		for(Element el:beans){
			String id=el.attributeValue("id");
			Assert.hasText(id, el.attributeValue("class")+"id不能为空");
			String resource=el.attributeValue("class");
			String ref=el.attributeValue("ref");
			Assert.hasText(resource+ref, "类路径不能为空！");
			DefaultBeanDefinition bean=new DefaultBeanDefinition();
			String scope=el.attributeValue("scope");
			if(!StringUtils.hasText(scope)){
				bean.setScope(DefaultBeanDefinition.DEFAULT_SCOPE);
			}else{
				bean.setScope(scope);
			}
			bean.setId(id);
			bean.setResource(resource);
			bean.setBeanClass(resource);
			beanFactory.putBeanDefinition(bean);
			count++;
		}
		return count;
	}

	

	

}
