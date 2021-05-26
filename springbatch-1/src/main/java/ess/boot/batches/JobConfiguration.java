package ess.boot.batches;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class JobConfiguration {

	@Autowired
	public JobBuilderFactory jobFactory;
	
	@Autowired
	public StepBuilderFactory stepFactory;
	
	@Autowired
	public DataSource ds;
	
	@Bean
	public FlatFileItemReader<Student> studentItemReader()
	{
		FlatFileItemReader<Student> reader=new FlatFileItemReader<>();
		reader.setLinesToSkip(1);
		reader.setResource(new ClassPathResource("./student.csv"));
		DefaultLineMapper<Student> customLineMapper = new DefaultLineMapper<>();
		
		DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
		tokenizer.setNames(new String[] {"student","studentname","studentstream"});
		
		customLineMapper.setLineTokenizer(tokenizer);
		customLineMapper.setFieldSetMapper(new StudentFieldSetMapper());
		customLineMapper.afterPropertiesSet();
		
		reader.setLineMapper(customLineMapper);
		return reader;
	}
	
	@Bean
	public JdbcBatchItemWriter<Student> studentItemWriter()
	{
		JdbcBatchItemWriter<Student> writer=new JdbcBatchItemWriter<>();
		
		writer.setDataSource(this.ds);
		writer.setSql("insert into student values(:studentid, :studentname, :studentstream)");
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>());
		writer.afterPropertiesSet();
		return writer;
	}
	
	@Bean
	public Step step1()
	{
		return stepFactory.get("step1").<Student,Student>chunk(1).reader(studentItemReader()).writer(studentItemWriter()).build();
	}
	@Bean
	public Job job()
	{
		return jobFactory.get("job").start(step1()).build();
	}
	
	
}
