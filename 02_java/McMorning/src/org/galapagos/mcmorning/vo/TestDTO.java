package org.galapagos.mcmorning.vo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode

@NoargsConstructor
@RequiredArgsConstructor
@AllArgsConstructor

public class TestDTO {
	private String user;
	private String password;
	private String name;
	private String email;

}
