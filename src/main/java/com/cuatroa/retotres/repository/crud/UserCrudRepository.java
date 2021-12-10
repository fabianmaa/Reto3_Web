package com.cuatroa.retotres.repository.crud;

import com.cuatroa.retotres.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author desaextremo
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);
    
    //Selecciona el usuario con el mayor id
    Optional<User> findTopByOrderByIdDesc();
}
