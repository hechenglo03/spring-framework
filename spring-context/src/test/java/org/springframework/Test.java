package org.springframework;

import java.beans.MethodDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import org.springframework.core.ResolvableType;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.env.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;
import org.springframework.core.convert.support.DefaultConversionService;


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

	@org.junit.Test
	public void ConversionTest(){
		DefaultConversionService service =
				new DefaultConversionService();
		Long value = service.convert("1",Long.class);
		System.out.println(value);
	}

	@org.junit.Test
	public void ClassPathResourceTest(){
		ClassPathResource resource = new ClassPathResource("/bean.xml");
		System.out.println(resource.getDescription());
	}

	@org.junit.Test
	public void descriptorTest() throws NoSuchMethodException {

	}



}
