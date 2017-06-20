package examples;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class CustomScope implements Scope {

	public Object get(String name, ObjectFactory<?> objectFactory) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object remove(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void registerDestructionCallback(String name, Runnable callback) {
		// TODO Auto-generated method stub

	}

	public Object resolveContextualObject(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getConversationId() {
		// TODO Auto-generated method stub
		return null;
	}

}
