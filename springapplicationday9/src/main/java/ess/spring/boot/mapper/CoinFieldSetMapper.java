package ess.spring.boot.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import ess.spring.boot.entity.Coin;

public class CoinFieldSetMapper implements FieldSetMapper<Coin> {

	@Override
	public Coin mapFieldSet(FieldSet fieldSet) throws BindException {
		Coin ref= new Coin(fieldSet.readString("country"),fieldSet.readInt("denomination"),fieldSet.readString("yearofminting"),fieldSet.readInt("currentvalue"),fieldSet.readString("acquireddate"));
		System.out.println(ref.getDenomination());
		return ref;
	}

}
