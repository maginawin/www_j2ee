package com.maginawin.wwd.test;

import com.maginawin.wwd.model.Customer;
import com.maginawin.wwd.service.CustomerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.*;

public class CustomerServiceTest {

	private final CustomerService customerService;
	
	public CustomerServiceTest() {
		customerService = new CustomerService();
	}
	
	@Before
	public void init() {
		// TODO init database
	}
	
	@Test
	public void getCustomerListTest() throws Exception {
		List<Customer> customerList = customerService.getCustomerList("customer1");
		Assert.assertEquals(2, customerList.size());
	}
	
	@Test
	public void getCustomerTest() throws Exception {
		long id = 1;
		Customer customer = customerService.getCustomer(id);
		Assert.assertNotNull(customer);
	}
	
	@Test
	public void createCustomerTest() throws Exception {
		Map<String, Object> fieldMap = new HashMap<String, Object>();
		fieldMap.put("name", "customer100");
		fieldMap.put("contact", "John");
		fieldMap.put("telephone", "13737003700");
		boolean result = customerService.createCustomer(fieldMap);
		Assert.assertTrue(result);
	}
	
	@Test
	public void updateCustomerTest() throws Exception {
		long id = 1;
		Map<String, Object> fieldMap = new HashMap<String, Object>();
		fieldMap.put("contact", "Eric");
		boolean result = customerService.updateCustomer(id, fieldMap);
		Assert.assertTrue(result);
	}
	
	@Test
	public void deleteCustomerTest() throws Exception {
		long id = 1;
		boolean result = customerService.deleteCustomer(id);
		Assert.assertTrue(result);
	}
}
