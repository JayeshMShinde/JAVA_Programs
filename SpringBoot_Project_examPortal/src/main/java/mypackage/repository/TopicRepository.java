package mypackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mypackage.model.Topics;

public interface TopicRepository extends JpaRepository<Topics, Integer> {

}
