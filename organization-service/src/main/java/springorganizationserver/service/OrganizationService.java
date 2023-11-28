package springorganizationserver.service;

import springorganizationserver.dto.OrganizationDto;

public interface OrganizationService {

	
	OrganizationDto saveOrganization(OrganizationDto organizationDto);
	
	OrganizationDto getByOrganizationByCode(String organizationCode);
}
