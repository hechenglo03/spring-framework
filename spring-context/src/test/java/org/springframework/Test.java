package org.springframework;

import java.util.HashMap;
import java.util.List;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.*;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.util.StringUtils;

/**
 * @Author hechenglong
 * @Date 2019/7/27
 * @Description
 **/

public class Test {

	private static class Property extends PropertySource{


		public Property(String name, Object source) {
			super(name, source);
		}

		@Override
		public Object getProperty(String name) {
			if(name.equals(this.getName())){
				return this.getSource();
			}
			return "null";
		}
	}

	public HashMap<String, List<String>> map = new HashMap<>();

	@org.junit.Test
	public void TestResolvableType() throws NoSuchFieldException {
		ResolvableType type = ResolvableType.forField(Test.class.getField("map"));
		System.out.println(type.getSuperType().toString());
	}

	@org.junit.Test
	public void testOne(){

		DefaultResourceLoader loader = new DefaultResourceLoader();
		Resource resource = loader.getResource("/Factory.java");
		System.out.println(resource.getFilename());
	}

	@org.junit.Test
	public void testTwo(){
		System.out.println(StringUtils.cleanPath("/1/2/3/../one/two"));
	}

}
