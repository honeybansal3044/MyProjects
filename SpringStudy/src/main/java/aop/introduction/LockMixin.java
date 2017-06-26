package aop.introduction;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class LockMixin extends DelegatingIntroductionInterceptor implements Lockable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4395900929323353967L;
	private boolean locked;

	@Override
	public void lock() {
		this.locked = true;

	}

	@Override
	public void unlock() {
		this.locked = false;
	}

	@Override
	public boolean locked() {
		return this.locked;
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		if (locked() && invocation.getMethod().getName().indexOf("set") == 0) {
			throw new Exception();
		}
		return super.invoke(invocation);
	}
}
