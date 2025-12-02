/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package indastrele.sweets.setup;

import static indastrele.sweets.constants.SweetsConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import indastrele.sweets.constants.SweetsConstants;
import indastrele.sweets.service.SweetsService;


@SystemSetup(extension = SweetsConstants.EXTENSIONNAME)
public class SweetsSystemSetup
{
	private final SweetsService sweetsService;

	public SweetsSystemSetup(final SweetsService sweetsService)
	{
		this.sweetsService = sweetsService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		sweetsService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return SweetsSystemSetup.class.getResourceAsStream("/sweets/sap-hybris-platform.png");
	}
}
