package com.account.activity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.account.activity.bean.ActivityBean;
import com.account.activity.models.Activity;
import com.account.activity.models.ActivityMaster;
import com.account.activity.repository.ActivityMasterRepo;
import com.account.activity.service.ActivityMasterService;

//@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class FirstMockitoTest {

	@Mock
	ActivityMasterRepo activityMasterRepo;

	@InjectMocks
	ActivityMasterService activityMasterService;

	@BeforeEach
	public void init() {

	}

	@Test
	public void givenNull_AddThrows() {
		doThrow(IllegalArgumentException.class).when(activityMasterRepo).deleteById(null);

		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
			activityMasterRepo.deleteById(null);
		});
		assertThat(ex.getClass(), is(IllegalArgumentException.class));
	}

	@Test
	public void testDoReturn() {
		ActivityMasterService spy = Mockito.spy(activityMasterService);

		// when(spy.findActivityById(anyLong())).thenReturn(new Activity());

		doReturn(new Activity()).when(spy).findActivityById(1l);
	}

	@Test
	public void deleteActivityMaster_deleteWithoutId() {
		doThrow(IllegalArgumentException.class).when(activityMasterRepo).deleteById(null);

		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
			activityMasterRepo.deleteById(null);
		});

		assertThat(ex.getClass(), is(IllegalArgumentException.class));

		doNothing().when(activityMasterRepo).deleteById(10l);

		activityMasterRepo.deleteById(10l);

		verify(activityMasterRepo).deleteById(10l);

		doNothing().when(activityMasterRepo).deleteById(anyLong());

		activityMasterRepo.deleteById(1l);

		verify(activityMasterRepo).deleteById(1l);

	}

	@Test
	public void updateActivityMaster_updateWithoutId() {

		activityMasterService.updateActivityMaster(1l, new ActivityBean());

		ArgumentCaptor<Long> ac = ArgumentCaptor.forClass(Long.class);

		verify(activityMasterRepo).findById(ac.capture());

		assertThat(ac.getValue(), is(equalTo(1l)));
	}

	@Test
	public void saveActivityMaster_saveNull() {

		when(activityMasterRepo.save(null)).thenThrow(new RuntimeException("Exception"));

		RuntimeException ex = assertThrows(RuntimeException.class, () -> {
			activityMasterService.saveActivityMaster(null);
		});

		assertThat(ex.getClass(), is(RuntimeException.class));

	}

	@Test
	public void saveActivityMaster_saveModel() {

		ActivityBean bean = new ActivityBean();
		ActivityMaster actMaster = new ActivityMaster();

		when(activityMasterRepo.save(any(ActivityMaster.class))).thenReturn(actMaster);

		assertThat(activityMasterService.saveActivityMaster(bean), is(instanceOf(ActivityMaster.class)));
	}
}