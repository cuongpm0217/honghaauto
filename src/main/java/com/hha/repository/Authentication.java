package com.hha.repository;

import java.io.Serializable;
import java.security.Principal;

import java.util.Collections;

public interface Authentication extends Principal,Serializable{
	Collections getAuthorities();
}
