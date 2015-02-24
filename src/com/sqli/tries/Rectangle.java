package com.sqli.tries;

/**
 * @author Ouadie LAHDIOUI <ouadiesoft@gmail.com>
 */
public class Rectangle implements Configurable
{

	private Integer height;
	private Integer width;

	public Integer surface()
	{
		return height * width;
	}

	@Override
	public void configure(final Integer width, final Integer height) throws IllegalStateException
	{
		this.width = width;
		this.height = height;
	}

	public Integer getHeight()
	{
		return height;
	}

	public int getWidth()
	{
		return width;
	}

}
