package com.hha.services;

import com.hha.entities.Account;

import java.util.List;

public interface AccountService {
	Account create(Account acc);

	Account update(long id, Account acc);

	void delete(long id);

	void hidden(long id);

	Account getById(long id);

	List<Account> getAll();
}
