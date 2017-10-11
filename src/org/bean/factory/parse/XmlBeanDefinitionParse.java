package org.bean.factory.parse;

import java.io.InputStream;

import org.bean.factory.support.AbstractBeanFactroy;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;


public class XmlBeanDefinitionParse  extends AbstractBeanDefinitionParse{

	
	private  Document document;
	private  SAXReader sAXReader=new SAXReader();
    private  AbstractBeanFactroy beanFactory;
    private  final XmlBeanDefinitionParseDelegate delegate;
    
    public XmlBeanDefinitionParse(AbstractBeanFactroy beanFactory, InputStream resource){
    	super(beanFactory,resource);
		this.document=getDocument();
    	delegate=new XmlBeanDefinitionParseDelegate(beanFactory,resource);
    }
    
	public final  int parseBean() {
		// TODO Auto-generated method stub
       return parseBean(document);
		
	}
	private Document getDocument(){
		Document document=null;
		try {
			document=sAXReader.read(resource);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return document;
	}

	@Override
	public int parseBean(Document document) {
		// TODO Auto-generated method stub
		return delegate.parseBean(document);
	}
	
	public void setBeanFactory(AbstractBeanFactroy beanFactory) {
		this.beanFactory = beanFactory;
	}
	

}
