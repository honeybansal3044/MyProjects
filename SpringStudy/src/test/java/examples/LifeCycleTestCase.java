package examples;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import examples.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class})
public class LifeCycleTestCase {
	
	@Autowired
	private LifeCycleTest lifeCycle;
	
	@Test
	public void testLifeCycleBeanInstance() {
		assertThat(lifeCycle, instanceOf(LifeCycleTest.class));
	}
}
