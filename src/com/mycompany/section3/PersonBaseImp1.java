/**
 * 
 */
package com.mycompany.section3;

/**
 * @author tconti97
 *
 */
public abstract class PersonBaseImp1 implements Person 
{
	private String name;
	public PersonBaseImp1(String _name)
	{
		name=_name;
	}
	/* (non-Javadoc)
	 * @see com.mycompany.section3.Person#getName()
	 */
	@Override
	public String getName() 
	{
		return name;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.section3.Person#getDetails()
	 */
	//@Override
	/*public String getDetails() 
	{
		return details;
	}*/

}
