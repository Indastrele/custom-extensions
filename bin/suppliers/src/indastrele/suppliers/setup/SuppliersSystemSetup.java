/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package indastrele.suppliers.setup;

import static indastrele.suppliers.constants.SuppliersConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import indastrele.suppliers.constants.SuppliersConstants;
import indastrele.suppliers.service.SuppliersService;


@SystemSetup(extension = SuppliersConstants.EXTENSIONNAME)
public class SuppliersSystemSetup
{
	private final SuppliersService suppliersService;

	public SuppliersSystemSetup(final SuppliersService suppliersService)
	{
		this.suppliersService = suppliersService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		suppliersService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return SuppliersSystemSetup.class.getResourceAsStream("/suppliers/sap-hybris-platform.png");
	}
}
