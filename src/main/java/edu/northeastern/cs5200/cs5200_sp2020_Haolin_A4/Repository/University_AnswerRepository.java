package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Answer;
@Repository
public interface University_AnswerRepository extends CrudRepository<Answer, Integer>{

}
