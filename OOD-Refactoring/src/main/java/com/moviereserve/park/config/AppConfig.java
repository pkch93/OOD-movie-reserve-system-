package com.moviereserve.park.config;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@ComponentScan
@EnableAspectJAutoProxy
@Configuration
public class AppConfig {
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dm.setUrl("jdbc:mysql:/localhost:3306/ood?SSLuse=false");
		dm.setUsername("park");
		dm.setPassword("1234");
		return dm;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() {
		DataSource dataSource = dataSource();
		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		Environment environment = new Environment("development", transactionFactory, dataSource);
		org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration(environment);
		return new SqlSessionFactoryBuilder().build(configuration);
	}
	
	@Bean
	public SqlSession sqlSession() {
		SqlSessionTemplate session = new SqlSessionTemplate(sqlSessionFactory());
		return session;
	}
}
