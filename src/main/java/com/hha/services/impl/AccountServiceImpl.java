package com.hha.services.impl;

import com.hha.entities.Account;
import com.hha.repository.AccountRepository;
import com.hha.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepository repo;

	@Override
	public Account create(Account acc) {
		acc.setEnable(true);
		return repo.save(acc);
	}

	@Override
	public Account update(long id, Account acc) {
		Account accSelect = repo.findById(id).get();
		if (Objects.nonNull(accSelect)) {
			accSelect.setCode(acc.getCode());
			accSelect.setEnable(acc.isEnable());
			accSelect.setLever(acc.getLever());			
			accSelect.setName(acc.getName());			
		}
		return repo.save(accSelect);
	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);
	}

	@Override
	public boolean hidden(long id) {
		Account accSelect = repo.findById(id).get();
		if (accSelect!=null) {
			accSelect.setEnable(false);
			repo.save(accSelect);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Account getById(long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Account> getAll() {
		return repo.findAll();
	}

}
