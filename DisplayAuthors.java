import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DisplayAuthors
{
	public static void main(String[] args) 
	{
		final String DATABASE_URL = "jdbc:mongodb//localhost:27017";
		final String SELECT_QUERY = "SELECT authorID, firstName, lastName FROM authors";

		try
		{
			Connection connection = DriverManager.getConnection(DATABASE_URL, "Douglas", "Douglas123");
			Statement statement = connection.createStatement();ResultSet resultSet = statement.executeQuery(SELECT_QUERY);
			ResultSetMetaData metaData = resultSet.getMetaData();
			int numberOfColumns = metaData.getColumnCount();

			System.out.printf("Authors Table of Books Database:%n%n");

			for (int i = 1; i <= numberOfColumns; i++)
			{
				System.out.printf("%-8s\t",metaData.getColumnName(i));
			}
			System.out.println("");	

			while(resultSet.next())
			{
				for (int i = 1; i <= numberOfColumns; i++)
				{
					System.out.printf("%-8s\t",resultSet.getObject(i));
				}
				System.out.println("");
			}
		}

		catch(SQLException sqlException)
		{
			sqlException.printStackTrace();
		}	
	}
}