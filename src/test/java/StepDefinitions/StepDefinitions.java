package StepDefinitions;

import Manage.QueryManage;
import Utilities.JDBCReusableMethods;
import io.cucumber.java.en.Given;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StepDefinitions {

    PreparedStatement preparedStatement;
    QueryManage queryManage = new QueryManage();
    String query;
    ResultSet resultSet;
    int rowCount;

    @Given("Database connection is established")
    public void database_connection_is_established() {

        JDBCReusableMethods.getConnection();
    }
}
