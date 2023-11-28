package springorganizationserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springorganizationserver.entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization,Long>{

	
	Organization findByOrganizationCode(String organizationCode);
}
