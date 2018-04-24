package edu.javamasterbook.ch12.sec01;

public class OracleFactory implements Factory {
    @Override
    public Connection getConnection() {
        return new OracleConnection();
    }

    @Override
    public Configuration getConfiguration() {
        return new OracleConfiguration();
    }
}
