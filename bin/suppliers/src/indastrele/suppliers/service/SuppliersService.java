/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package indastrele.suppliers.service;

public interface SuppliersService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
