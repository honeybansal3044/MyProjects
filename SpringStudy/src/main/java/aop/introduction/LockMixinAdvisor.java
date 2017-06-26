package aop.introduction;

import org.springframework.aop.support.DefaultIntroductionAdvisor;

public class LockMixinAdvisor extends DefaultIntroductionAdvisor {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3946752911151668596L;

	public LockMixinAdvisor() {
        super(new LockMixin(), Lockable.class);
    }
}
