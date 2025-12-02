/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package indastrele.sweets.service;

public interface SweetsService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
