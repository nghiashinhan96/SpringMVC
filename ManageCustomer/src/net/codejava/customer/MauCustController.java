package net.codejava.customer;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MauCustController {
	@Autowired
	private ShowCustomerService customerService;

	@RequestMapping("/")
	public ModelAndView getModelAndView() {
		ModelAndView modelAndView = new ModelAndView("index");
		List<Customer> customerList = customerService.getListCust();
		modelAndView.addObject("listCustomer", customerList);
		return modelAndView;
	}

	@RequestMapping("/homepage")
	public ModelAndView getHomepage() {
		ModelAndView modelAndView = new ModelAndView("index");
		List<Customer> customerList = customerService.getListCust();
		modelAndView.addObject("listCustomer", customerList);
		return modelAndView;
	}

	@RequestMapping("/new")
	public String createNewCustomer(Map<String, Object> argModel) {
		argModel.put("customer", new Customer());
		return "new_customer";
	}

	@RequestMapping(value = "/save")
	public String saveNewCustomer(@ModelAttribute("customer") Customer argCustomer) {
		customerService.saveCustomer(argCustomer);
		return "redirect:/";
	}

	@RequestMapping(value = "/edit")
	public ModelAndView editCustomer(@RequestParam("id") long argCustomerID) {
		ModelAndView modelAndView = new ModelAndView("edit_customer");
		Customer customer = customerService.getCustomerById(argCustomerID);
		modelAndView.addObject(customer);
		return modelAndView;
	}

	@RequestMapping(value = "/delete")
	public String deleteCustomer(@RequestParam("id") long argCustomerId) {
		customerService.deleteCustomerById(argCustomerId);
		return "redirect:/";

	}

	@RequestMapping(value = "/search")
	public ModelAndView searchCustomerWithKeyWord(@RequestParam("keyword") String argKeyWord) {
		ModelAndView mav = new ModelAndView("search");
		List<Customer> result = customerService.searchCustomer(argKeyWord);
		mav.addObject("result", result);
		return mav;
	}
}
