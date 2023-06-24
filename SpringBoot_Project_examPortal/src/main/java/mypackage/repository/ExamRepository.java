package mypackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mypackage.model.ExamDetials;

public interface ExamRepository extends JpaRepository<ExamDetials, Integer> {

}
