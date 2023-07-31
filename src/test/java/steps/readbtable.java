package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import database.utils.JDBC;
import utilities.Config;

import java.sql.*;

public class readbtable {
    @Given("^This function allows to read a given table$")
    public void thisFunctionAllowsToReadAGivenTable() {
    }

    @And("^User should be able to return the output of the table \"([^\"]*)\"$")
    public void userShouldBeAbleToReturnTheOutputOfTheTable(String tableName) throws SQLException {
        JDBC.executeQuery(tableName);
    }
}
