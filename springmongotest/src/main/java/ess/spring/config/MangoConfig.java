package ess.spring.config;

import java.util.Collection;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoRepositories(basePackages ="com.spring.mongo")
public class MangoConfig{

	 @Bean
	    public MongoClient mongo() {
	        ConnectionString connectionString = new ConnectionString("mongodb+srv://test:hnnEwdsq9YecAMPD@cluster0.6f7kz.mongodb.net/hs_mongo?retryWrites=true&w=majority");
	        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
	          .applyConnectionString(connectionString)
	          .build();
	        
	        return MongoClients.create(mongoClientSettings);
	    }

	    @Bean
	    public MongoTemplate mongoTemplate() throws Exception {
	        return new MongoTemplate(mongo(), "test");
	    }

}
