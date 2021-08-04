package ocms.db;

public class DBAccessor {

    public DBAccessor() throws java.sql.SQLException {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (ClassNotFoundException ex) {
            throw new java.sql.SQLException(ex.getMessage(), ex.getCause());
        }
        this.connection = java.sql.DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Venkatesh\\Documents\\sample.accdb");
    }

    public java.sql.ResultSet retrieve(String query, String[] values) throws java.sql.SQLException {
        java.sql.PreparedStatement statement = connection.prepareStatement(query);
        if (values != null) {
            for (int i = 0; i < values.length; i++) {
                statement.setString(i + 1, values[i]);
            }
        }
        return statement.executeQuery();
    }

    public void execute(String query, String[] values) throws java.sql.SQLException {
        java.sql.PreparedStatement statement = connection.prepareStatement(query);
        for (int i = 0; i < values.length; i++) {
            statement.setString(i + 1, values[i]);
        }
        statement.executeUpdate();
        connection.commit();
    }

    public void update(String query, String[] values) throws java.sql.SQLException {
        java.sql.PreparedStatement statement = connection.prepareStatement(query);
        for (int i = 0; i < values.length; i++) {
            statement.setString(i + 1, values[i]);
        }
        statement.executeUpdate();
        connection.commit();
    }
    private final java.sql.Connection connection;
}
