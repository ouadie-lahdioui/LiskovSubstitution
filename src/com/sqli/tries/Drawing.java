package com.sqli.tries;

/**
 * @author Ouadie LAHDIOUI <ouadiesoft@gmail.com>
 */
public class Drawing
{
	public static void main(final String[] args)
	{

		final Rectangle rectangle = Drawing.getRectangle();

		/*
		 * rectangle.setHeight(10);
		 * rectangle.setWidth(2);
		 */
		rectangle.configure(10, 2);

		System.out.println(rectangle.surface());

	}

	private static Rectangle getRectangle()
	{
		return new Carre();
	}
}
