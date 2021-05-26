package ess.boot.batches;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class StudentFieldSetMapper implements FieldSetMapper<Student> {

	@Override
	public Student mapFieldSet(FieldSet fieldSet) throws BindException {
		Student ref=new Student(fieldSet.readInt("studentid"),fieldSet.readString("studentname"),fieldSet.readString("studentstream"));
		System.out.println(ref.getStudentid());
		return ref;

	}

}
