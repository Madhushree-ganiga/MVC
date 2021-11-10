package com.wolken.monument.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@ToString
public class DetailsDTO {

	private String name;
	private String location;
	private float entryFee;
	private String builtFor;
	private short yOC;
	
}
