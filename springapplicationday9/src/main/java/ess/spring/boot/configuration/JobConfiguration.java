package ess.spring.boot.configuration;

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

import ess.spring.boot.entity.Coin;
import ess.spring.boot.mapper.CoinFieldSetMapper;

@Configuration
public class JobConfiguration {
	
	@Autowired
	public JobBuilderFactory jobFactory;
	
	@Autowired
	public StepBuilderFactory stepFactory;
	
	@Autowired
	public DataSource ds;
	
	@Bean
	public FlatFileItemReader<Coin> coinItemReader()
	{
		FlatFileItemReader<Coin> reader=new FlatFileItemReader<>();
		reader.setLinesToSkip(1);
		reader.setResource(new ClassPathResource("./coin.csv"));
		DefaultLineMapper<Coin> customLineMapper = new DefaultLineMapper<>();
		
		DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
		tokenizer.setNames(new String[] {"country","denomination","yearofminting","currentvalue","acquireddate"});
		
		customLineMapper.setLineTokenizer(tokenizer);
		customLineMapper.setFieldSetMapper(new CoinFieldSetMapper());
		customLineMapper.afterPropertiesSet();
		
		reader.setLineMapper(customLineMapper);
		return reader;
	}
	
	@Bean
	public JdbcBatchItemWriter<Coin> coinItemWriter()
	{
		JdbcBatchItemWriter<Coin> writer=new JdbcBatchItemWriter<>();
		
		writer.setDataSource(this.ds);
		writer.setSql("insert into coindata values(:country, :denomination, :yearofminting, :currentvalue, :acquireddate)");
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>());
		writer.afterPropertiesSet();
		return writer;
	}
	
	@Bean
	public Step step1()
	{
		return stepFactory.get("step1").<Coin,Coin>chunk(1).reader(coinItemReader()).writer(coinItemWriter()).build();
	}
	@Bean
	public Job job()
	{
		return jobFactory.get("job").start(step1()).build();
	}

}
