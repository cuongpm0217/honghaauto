package com.hha.repository;

import java.io.Serializable;
import java.security.Principal;
import java.util.Collection;



public interface Authentication extends Principal,Serializable{
	Collection getAuthorities();
}
