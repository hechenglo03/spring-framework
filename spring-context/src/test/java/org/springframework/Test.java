package org.springframework;

import java.util.HashMap;
import java.util.List;
import org.springframework.core.ResolvableType;
import org.springframework.core.convert.support.DefaultConversionService;

/**
 * @Author hechenglong
 * @Date 2019/7/27
 * @Description
 **/

public class Test {
	public HashMap<String, List<String>> map = new HashMap<>();

	interface one{
		public String inner(String one);
	}

	@org.junit.Test
	public void TestResolvableType() throws NoSuchFieldException {


		ResolvableType type = ResolvableType.forField(Test.class.getField("map"));
		System.out.println(type.getSuperType().toString());
	}


	@org.junit.Test
	public void testConverService(){
		DefaultConversionService service =
				new DefaultConversionService();
		boolean actual = service.canConvert(String.class,Boolean.class);
		System.out.println(actual);
		Object acc = service.convert("true",Boolean.class);
		System.out.println(acc.getClass().getName());
	}

	@org.junit.Test
	public void testOne(){

	}

}
