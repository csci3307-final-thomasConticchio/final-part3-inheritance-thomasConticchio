/**
 * 
 */
package com.mycompany.section3;

/**
 * @author tconti97
 *
 */
public class TeacherImp1 extends PersonBaseImp1 implements Teacher 
{
	private String thoughtCourseTitle;
	public TeacherImp1(String _name, String _thoughtCourseTitle)
	{
		super(_name);
		thoughtCourseTitle=_thoughtCourseTitle;
	}
	
	/* (non-Javadoc)
	 * @see com.mycompany.section3.Teacher#teachesFor()
	 */
	@Override
	public String teachesFor() 
	{
		return thoughtCourseTitle;
	}

	@Override
	public String getDetails() 
	{
		//
		return "teacher";
	}

}
