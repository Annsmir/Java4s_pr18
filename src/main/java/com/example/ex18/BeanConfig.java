package com.example.ex18;

// import com.zaxxer.hikari.HikariDataSource;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.orm.hibernate5.HibernateTransactionManager;
// import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
// import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// @ComponentScan
@Configuration
@EnableJpaRepositories
public class BeanConfig {

    // @Autowired
    // HikariDataSource ds;

    // @Bean
    // public LocalSessionFactoryBean factoryBean() {
    //     LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
    //     sf.setDataSource(ds);
    //     sf.setAnnotatedClasses(new Class[] { Address.class, Building.class });
 
    //     return sf;
    // }

    // @Bean
    // public PlatformTransactionManager platformTransactionManager(LocalSessionFactoryBean factoryBean){
    //     HibernateTransactionManager transactionManager = new HibernateTransactionManager();
    //     transactionManager.setSessionFactory(factoryBean.getObject());
    //     return transactionManager;
    // }
}
