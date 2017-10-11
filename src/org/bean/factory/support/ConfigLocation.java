package org.bean.factory.support;

public class ConfigLocation {
	
	private final String location;
	private String path;
	public ConfigLocation(String location){
		this.location=location;
	}
	public String getPath(){
		
		parseLocation();
		return this.path;
	}
	private void parseLocation() {
		// TODO Auto-generated method stub classPath:
		String prefix=location.substring(0,10);
		if(!"classPath:".equals(prefix))
			throw new Error("配置文件路径错误，请以classPath:作为路径前缀！");
		String filePath=location.substring(10);
		String classPath=ConfigLocation.class.getClassLoader().getResource("").getPath();
		this.path=classPath+filePath;
		
	}
	

}
