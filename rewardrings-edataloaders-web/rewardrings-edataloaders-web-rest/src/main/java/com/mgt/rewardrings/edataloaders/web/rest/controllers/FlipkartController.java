/**
 * 
 */
package com.mgt.rewardrings.edataloaders.web.rest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vijay Kumar
 *
 */
@RestController(value = "FlipkartController")
@RequestMapping(path = {"/flipkart/products"})
public class FlipkartController {

	@RequestMapping(path = {"/"})
	public String welcome() {
		return "welcome to flipkart controller";
	}
}
