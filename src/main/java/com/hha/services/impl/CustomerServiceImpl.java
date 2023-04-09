package com.hha.services.impl;

import com.hha.entities.Customer;
import com.hha.repository.CustomerRepository;
import com.hha.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository repo;

    @Override
    public Customer createCustomer(Customer c) {
        c.setEnable(true);
        return repo.save(c);
    }

    @Override
    public Customer updateCustomer(long id, Customer c) {
        Customer cusSelect = repo.findById(id).get();
        if (Objects.nonNull(id) || Objects.nonNull(c) || Objects.nonNull(cusSelect)) {
            cusSelect.setDOB(c.getDOB());
            cusSelect.setGenId(c.getGenId());
            cusSelect.setEnable(c.isEnable());
            cusSelect.setName(c.getName());
            cusSelect.setTel1(c.getTel1());
            cusSelect.setTel1(c.getTel2());
            cusSelect.setAdd1(c.getAdd1());
            cusSelect.setAdd2(c.getAdd2());
        }
        return repo.save(cusSelect);
    }

    @Override
    public void deleteCustomer(long id) {
        repo.deleteById(id);
    }

    @Override
    public boolean hidden(long id) {
        Customer cusSelect = repo.findById(id).get();
        if (Objects.nonNull(id) || Objects.nonNull(cusSelect)) {
            cusSelect.setEnable(false);
            repo.save(cusSelect);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Customer getCustomerById(long id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Customer> getAllCustomer() {
        return repo.findAll();
    }

    @Override
    public List<Customer> getCustomerByText(String txtSearch) {
        return repo.findByTxt(txtSearch);
    }
}
