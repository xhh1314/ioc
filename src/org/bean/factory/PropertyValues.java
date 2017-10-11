package org.bean.factory;

import java.util.List;

public interface PropertyValues {
	
	List<PropertyValue>  getPropertys();
	PropertyValue getProperty(String name);

}
