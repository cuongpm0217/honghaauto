package com.hha.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account extends BaseDTO {

	private long Id;

	private String code;

	private String name;

	private int lever;// 0-2:sub-account, account example: 131,1311
}
