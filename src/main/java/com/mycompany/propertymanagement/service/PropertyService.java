package com.mycompany.propertymanagement.service;

import java.util.List;

import com.mycompany.propertymanagement.dto.PropertyDTO;

public interface PropertyService {
	
	PropertyDTO saveProperty (PropertyDTO propertyDTO);
	
	List <PropertyDTO> getAllProperties ();

	List <PropertyDTO> getAllPropertiesForUser (Long userId);

	PropertyDTO updateProperty (PropertyDTO propertyDTO, Long propertyId);  
	
	PropertyDTO updatePropertyDescription (PropertyDTO propertyDTO, Long propertyId);
	
	PropertyDTO updatePropertyPrice (PropertyDTO propertyDTO, Long propertyId);
	
	void deleteProperty (Long propertyId);
}
