package org.springframework;

import org.springframework.beans.factory.parsing.*;

/**
 * @Author: hechenglo03
 * @Date:2019/9/7
 * @Description:
 */
public class MyReaderEventListener implements ReaderEventListener {
	@Override
	public void defaultsRegistered(DefaultsDefinition defaultsDefinition) {
		System.out.println("defaultsDefintions");
	}

	@Override
	public void componentRegistered(ComponentDefinition componentDefinition) {
		System.out.println("componentDefintion");
	}

	@Override
	public void aliasRegistered(AliasDefinition aliasDefinition) {
		System.out.println("aliasDefintion");
	}

	@Override
	public void importProcessed(ImportDefinition importDefinition) {
		System.out.println("importDefinition");
	}
}
