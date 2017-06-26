package aop.introduction;

public interface Lockable {
	void lock();

	void unlock();

	boolean locked();
}
