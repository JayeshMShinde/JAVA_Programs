package mypackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mypackage.model.ExamQuestion;

public interface ExamQuestionRepositroy extends JpaRepository<ExamQuestion,Integer> {

}
