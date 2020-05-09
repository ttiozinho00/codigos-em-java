public enum book
{
	JHTP("Java How to Program","2010"),
	CHTP("C How to Program","2007"),
	IW3HTP("Internet & Word Wide Web How to Program","2008"),
	CPPHTP("C++ How to Program","2008"),
	VBHTP("Visual Basic 2008 How to Program","2009"),
	CSHARPHTP("Visual C# 2008 How to Program","2009");

	private final String title;
	private final String copyrightYear;

	book(String bookTitle, String year)
	{
		title = bookTitle;
		copyrightYear = year;
	}

	public String getTitle()
	{
		return title;
	}

	public String getCopyrightYear()
	{
		return copyrightYear;
	}
}