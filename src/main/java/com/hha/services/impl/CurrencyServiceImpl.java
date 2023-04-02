package com.hha.services.impl;

import com.hha.entities.Currency;
import com.hha.repository.CurrencyRepository;
import com.hha.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CurrencyServiceImpl implements CurrencyService {
	@Autowired
	private CurrencyRepository repo;

	@Override
	public Currency create(Currency cur) {
		cur.setEnable(true);
		return repo.save(cur);
	}

	@Override
	public Currency update(long id, Currency cur) {
		Currency curSelect = repo.findById(id).get();
		if (Objects.nonNull(id) || Objects.nonNull(curSelect) || Objects.nonNull(cur)) {
			curSelect.setCode(cur.getCode());
			curSelect.setEnable(cur.isEnable());
			curSelect.setName(cur.getName());
			curSelect.setRate(cur.getRate());			
		}
		return repo.save(curSelect);
	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);
	}

	@Override
	public boolean hidden(long id) {
		Currency curSelect = repo.findById(id).get();
		if (Objects.nonNull(id) || Objects.nonNull(curSelect)) {
			curSelect.setEnable(false);
			repo.save(curSelect);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Currency getById(long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Currency> getAll() {
		return repo.findAll();
	}
}
