package edu.javamasterbook.ch12.sec01;

public class Sec01Main {

    public static void main(String[] args) {
        System.out.println("12-1. Desgin Pattern: Abstract Factory Pattern");

        Factory factory = createFactory("MySQL");
        Connection connection = factory.getConnection();
        Configuration configuration = factory.getConfiguration();

    }

    private static Factory createFactory(String env) {
        switch (env) {
            case "MySQL":
                return new MySQLFactory();
            case "Oracle":
                return new OracleFactory();
            default:
                throw new IllegalArgumentException(env);
        }
    }

}
