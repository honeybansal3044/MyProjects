package jaas;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import hello.LoginForm;

public class JAASCallBackHandler implements CallbackHandler {

	private LoginForm form;
	
	public JAASCallBackHandler(LoginForm form) {
		this.form = form;
	}
	
	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		// TODO Auto-generated method stub

	}

}
