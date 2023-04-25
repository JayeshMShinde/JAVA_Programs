package mypackage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mypackage.model.Topics_Content;

public interface TopicContentRepository extends JpaRepository<Topics_Content, Integer> {

}
