package com.moviereserve.park;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(
		excludeFilters=@Filter(type=FilterType.ANNOTATION, classes=EnableWebMvc.class))
public class RootConfig {
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost:3306/ood?SSLuse=false&serverTimezone=UTC&useUnicode=true&characterEncoding=utf8");
		dm.setUsername("park");
		dm.setPassword("1234");
		return dm;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		DataSource dataSource = dataSource();
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource);
		sqlSessionFactory.setMapperLocations(new 
				PathMatchingResourcePatternResolver().getResources("com/moviereserve/park/DAO/mapper/*.xml"));
		return (SqlSessionFactory) sqlSessionFactory.getObject();
	}
	
	@Bean
	public SqlSession sqlSession() throws Exception {
		SqlSessionTemplate session = new SqlSessionTemplate(sqlSessionFactory());
		return session;
	}
}
