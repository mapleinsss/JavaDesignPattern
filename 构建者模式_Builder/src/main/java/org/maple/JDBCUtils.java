package org.maple;

/**
 * @auther Mapleins
 * @date 2019-07-08 15:05
 * @Description
 */
public class JDBCUtils {

    private String driver;
    private String jdbcUrl;
    private String username;
    private String password;
    private String charset;
    private String port;
    private String jdbcType;

    private JDBCUtils(Builder builder) {
        this.driver = builder.driver;
        this.jdbcUrl = builder.jdbcUrl;
        this.username = builder.username;
        this.password = builder.password;
        this.charset = builder.charset;
        this.port = builder.port;
        this.jdbcType = builder.jdbcType;
    }

    @Override
    public String toString() {
        return "JDBCUtils{" +
                "driver='" + driver + '\'' +
                ", jdbcUrl='" + jdbcUrl + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", charset='" + charset + '\'' +
                ", port='" + port + '\'' +
                ", jdbcType='" + jdbcType + '\'' +
                '}';
    }

    public static class Builder {
        private String driver;
        private String jdbcUrl;
        private String username;
        private String password;
        private String charset;
        private String port;
        private String jdbcType;

        public Builder driver(String driver) {
            this.driver = driver;
            return this;
        }
        public Builder jdbcUrl(String jdbcUrl) {
            this.jdbcUrl = jdbcUrl;
            return this;
        }
        public Builder username(String username) {
            this.username = username;
            return this;
        }
        public Builder password(String password) {
            this.password = password;
            return this;
        }
        public Builder charset(String charset) {
            this.charset = charset;
            return this;
        }
        public Builder port(String port) {
            this.port = port;
            return this;
        }
        public Builder jdbcType(String jdbcType) {
            this.jdbcType = jdbcType;
            return this;
        }

        public JDBCUtils build(){
            return new JDBCUtils(this);
        }

    }
}
