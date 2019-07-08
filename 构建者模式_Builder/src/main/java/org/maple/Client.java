package org.maple;

/**
 * @auther Mapleins
 * @date 2019-07-08 16:54
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        JDBCUtils utils = new JDBCUtils.Builder().username("stark").password("123456").jdbcUrl("jdbc:mysql://localhost:3306/test?charset=utf-8").driver("com.mysql.jdbc.Driver").build();
        System.out.println(utils);

    }
}
