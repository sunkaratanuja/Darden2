package springorganizationserver.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import springorganizationserver.dto.OrganizationDto;
import springorganizationserver.entity.Organization;
import springorganizationserver.mapper.OrganizationMapper;
import springorganizationserver.repository.OrganizationRepository;
import springorganizationserver.service.OrganizationService;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {
	
	@Autowired
	OrganizationRepository organizationRepository;
	
	
	@Override
	public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

		Organization organization = OrganizationMapper.mapToOrganization(organizationDto);
		
		Organization savedOrganization = organizationRepository.save(organization);
		
		OrganizationDto saveOrganizationDto =  OrganizationMapper.mapToOrganizationDto(savedOrganization);
		

		return saveOrganizationDto;
	}


	@Override
	public OrganizationDto getByOrganizationByCode(String organizationCode) {
		
		Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
		
		OrganizationDto organizationDto = OrganizationMapper.mapToOrganizationDto(organization);
		return organizationDto;
	}

}
