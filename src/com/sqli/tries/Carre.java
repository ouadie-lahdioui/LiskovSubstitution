package com.sqli.tries;

import com.sqli.tools.Tools;


/**
 * @author Ouadie LAHDIOUI <ouadiesoft@gmail.com>
 */
public class Carre extends Rectangle
{

	@Override
	public void configure(final Integer width, final Integer height) throws IllegalStateException
	{
		if (width != height)
		{
			throw new IllegalStateException(Tools.CARRE_CONFIGURE_ERROR);
		}

		super.configure(width, height);
	}
}
