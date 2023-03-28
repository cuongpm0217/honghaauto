package com.hha.services;

import java.util.List;

import com.hha.entities.Account;

public interface AccountService {
	Account create(Account acc);

	Account update(long id, Account acc);

	void delete(long id);

	void hidden(long id);

	Account getById(long id);

	List<Account> getAll();
}
