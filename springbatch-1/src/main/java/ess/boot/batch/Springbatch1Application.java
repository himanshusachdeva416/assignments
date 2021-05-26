package ess.boot.batch;

import java.util.UUID;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springbatch1Application implements CommandLineRunner {
	
	@Autowired
	private JobLauncher launcher;

	@Autowired
	private Job job;


	public static void main(String[] args) {
		SpringApplication.run(Springbatch1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		JobParameters params=new JobParametersBuilder().addString("date", UUID.randomUUID().toString()).addLong("jobid", System.currentTimeMillis()).toJobParameters();
		
		JobExecution exec=launcher.run(job, params);
		System.out.println("Status = " + exec.getStatus());
	}

}
