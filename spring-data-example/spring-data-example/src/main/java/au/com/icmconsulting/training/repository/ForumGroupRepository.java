package au.com.icmconsulting.training.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.repository.annotation.RestResource;

import au.com.icmconsulting.training.domain.ForumGroup;

//@RestResource(path = "groups", rel = "groups")
public interface ForumGroupRepository extends CrudRepository<ForumGroup, Long> {

}
