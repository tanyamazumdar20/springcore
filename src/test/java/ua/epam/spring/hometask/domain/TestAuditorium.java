package ua.epam.spring.hometask.domain;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

/**
 * @author Yuriy_Tkach
 */
public class TestAuditorium {
	
	@Test
	public void testCountVips() {
		Auditorium a = new Auditorium();
		a.setVipSeats(Stream.of(1L,2L,3L).collect(Collectors.toSet()));
		assertEquals("Unexpected vip seat count",0, a.countVipSeats(Arrays.asList(10L, 20L, 30L)));
		assertEquals("Unexpected vip seat count",1, a.countVipSeats(Arrays.asList(10L, 2L, 30L)));
		assertEquals("Unexpected vip seat count",2, a.countVipSeats(Arrays.asList(10L, 2L, 3L, 4L, 5L, 6L)));
	}
	
	public void testGetAllSeats() {
	    Auditorium a = new Auditorium();
	    a.setNumberOfSeats(10);
	    assertEquals("Unexpected number of seats",10, a.getAllSeats().size());
	}

}
