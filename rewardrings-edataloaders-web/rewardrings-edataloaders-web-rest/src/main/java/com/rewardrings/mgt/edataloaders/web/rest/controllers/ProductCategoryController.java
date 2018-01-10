/**
 * 
 */
package com.rewardrings.mgt.edataloaders.web.rest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vijay Kumar
 *
 */
@RestController(value = "ProductCategoryController")
@RequestMapping(path = {"/"})
public class ProductCategoryController {

	@RequestMapping(path = {"/"})
	public String welcome() {
		return "welcome to flipkart controller";
	}
}
