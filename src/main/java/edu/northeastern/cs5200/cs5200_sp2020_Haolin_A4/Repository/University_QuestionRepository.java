package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models.Question;
@Repository
public interface University_QuestionRepository extends CrudRepository<Question, Integer>{

}
