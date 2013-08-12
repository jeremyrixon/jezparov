package au.com.icmconsulting.training.forum.repository;

import org.springframework.data.repository.CrudRepository;

import au.com.icmconsulting.training.forum.domain.ForumGroup;


public interface ForumGroupRepository extends CrudRepository<ForumGroup, Long> {

}
