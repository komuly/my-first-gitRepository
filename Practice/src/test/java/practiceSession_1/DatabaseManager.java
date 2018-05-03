package practiceSession_1;

import java.sql.*;

public class DatabaseManager{

	private String databaseServerName="localhost";
	private String databasePort = "7777";
	private String userName="";
	private String userPassWord="";
	private String connectionURL ="jdbc:oracle:thin:hr@//" + databaseServerName + ":" + databasePort;
		private Connection connection = null;
		private Statement statement =null;
		private ResultSet resultSet = null;    
	}


