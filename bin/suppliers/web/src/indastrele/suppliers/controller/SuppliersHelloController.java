/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package indastrele.suppliers.controller;

import static indastrele.suppliers.constants.SuppliersConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import indastrele.suppliers.service.SuppliersService;


@Controller
public class SuppliersHelloController
{
	@Autowired
	private SuppliersService suppliersService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", suppliersService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
