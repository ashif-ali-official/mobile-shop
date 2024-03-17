package com.achillis.mobileshop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "mobile")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mobile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String modelName;
	private String brandName;
	private Integer launchYear;
	private String operatingSystem;
	private Double price;
	private Integer soldCount;
}
