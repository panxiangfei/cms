//package com.icare.cms.systemconfig.config;
//
//import java.beans.PropertyVetoException;
//
//import javax.sql.DataSource;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//import com.mchange.v2.c3p0.ComboPooledDataSource;
//@Configuration
//@PropertySource(value = {"classpath:jdbc.properties"})
//public class DataSourceConfig{
//	protected Logger logger = LoggerFactory.getLogger(this.getClass());
//	
//    @Value("${jdbc.jdbcUrl}")
//    private String jdbcUrl;
//
//    @Value("${jdbc.driverClass}")
//    private String jdbcDriverClassName;
//
//    @Value("${jdbc.user}")
//    private String jdbcUsername;
//
//    @Value("${jdbc.password}")
//    private String jdbcPassword;
//
//    @Bean(destroyMethod = "close")
//    public DataSource dataSource() {
//    	ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
//        // 数据库驱动
//    	try {
//			comboPooledDataSource.setDriverClass(jdbcDriverClassName);
//		} catch (PropertyVetoException e) {
//			logger.error("设置数据库驱动"+jdbcDriverClassName+"出错,出错原因:"+e.getMessage());
//		}
//    	comboPooledDataSource.setJdbcUrl(jdbcUrl);   	// 相应驱动的jdbcUrl
//    	comboPooledDataSource.setUser(jdbcUsername);    // 数据库的用户名
//    	comboPooledDataSource.setPassword(jdbcUsername); // 数据库的密码
//    	comboPooledDataSource.setMinPoolSize(10);
//    	comboPooledDataSource.setMaxPoolSize(100);
//    	comboPooledDataSource.setInitialPoolSize(10);
//    	comboPooledDataSource.setAcquireIncrement(5);
//    	comboPooledDataSource.setMaxStatements(0);
//    	comboPooledDataSource.setCheckoutTimeout(100);
//    	comboPooledDataSource.setIdleConnectionTestPeriod(60);
//    	comboPooledDataSource.setBreakAfterAcquireFailure(false);
//    	comboPooledDataSource.setTestConnectionOnCheckin(true);
//    	comboPooledDataSource.setTestConnectionOnCheckout(true);
//        return comboPooledDataSource;
//    }
//}
