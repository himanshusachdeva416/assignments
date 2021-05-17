package ess.spring.boot;

import java.util.UUID;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class Springapplicationday9Application implements CommandLineRunner {
	
	@Autowired
	private JobLauncher launcher;

	@Autowired
	private Job job;


	public static void main(String[] args) {
		SpringApplication.run(Springapplicationday9Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		JobParameters params=new JobParametersBuilder().addString("date", UUID.randomUUID().toString()).addLong("jobid", System.currentTimeMillis()).toJobParameters();
		JobExecution exec=launcher.run(job, params);
		System.out.println("Status = " + exec.getStatus());
	}

}
	