package za.co.novabank.core.config;


import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SpringBeanJobFactory;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @author Noxolo.Mkhungo
 */
@Configuration
public class QuartzConfig {

    private PlatformTransactionManager transactionManager;
    private AutowireCapableBeanFactory beanFactory;
    @Autowired
    public QuartzConfig(PlatformTransactionManager transactionManager,AutowireCapableBeanFactory beanFactory){
        this.beanFactory=beanFactory;
        this.transactionManager=transactionManager;
    }

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean() {
        SchedulerFactoryBean factory = new SchedulerFactoryBean();
        factory.setJobFactory(springBeanJobFactory());
        factory.setTransactionManager(transactionManager);
        factory.setConfigLocation(new ClassPathResource("quartz.properties"));
        factory.setOverwriteExistingJobs(true); // Optional:Overwrite existing jobs
        factory.setWaitForJobsToCompleteOnShutdown(true); // Graceful shutdown
        return factory; }

    @Bean
    public SpringBeanJobFactory springBeanJobFactory() {
        return new SpringBeanJobFactory() {
            @Override protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
                Object job = super.createJobInstance(bundle);
                beanFactory.autowireBean(job);
                return job;
            }
        };
    }
}
