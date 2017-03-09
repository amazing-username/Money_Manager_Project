package sample;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AccountPercentages
{
    public AccountPercentages()
    {

    }

    private Map<String, Double> databaseNameToPercent;


    public void setDatabaseNameToPercent() throws SQLException
    {
        this.databaseNameToPercent = new HashMap<String, Double>();
        try
        {
            DatabaseConnection dbsql = new DatabaseConnection();
            dbsql.getAccountList();

            Iterator it = dbsql.getAccountListPre().iterator();
            while (it.hasNext())
            {
                String key = (String) it.next();
                //System.out.println("Key: " + key);
                databaseNameToPercent.put(key, dbsql.getAccountPercentages(key));
            }
        }
        catch (SQLException s)
        {
            s.printStackTrace();
        }
    }
    public Map<String, Double> getDatabaseNameToPercent()
    {
        return databaseNameToPercent;
    }
}
