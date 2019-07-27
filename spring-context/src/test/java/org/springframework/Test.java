package org.springframework;

import java.util.HashMap;
import java.util.List;
import org.springframework.core.ResolvableType;

/**
 * @Author hechenglong
 * @Date 2019/7/27
 * @Description
 **/

public class Test {
	public HashMap<String, List<String>> map = new HashMap<>();

	@org.junit.Test
	public void TestResolvableType() throws NoSuchFieldException {


		ResolvableType type = ResolvableType.forField(Test.class.getField("map"));
		System.out.println(type.getSuperType().toString());
	}

}
