dataSource {
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = 'org.hibernate.dialect.MySQL5InnoDBDialect'
    pooled = false
    dbCreate = "update"
    url = "jdbc:mysql://localhost:3306/customer_management?autoreconnect=true&allowMultiQueries=true&useUnicode=yes&characterEncoding=UTF-8"
    username = "root"
    logSql = false
    password = "nextdefault"
}
