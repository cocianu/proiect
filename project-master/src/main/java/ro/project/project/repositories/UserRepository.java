package ro.project.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ro.project.project.models.User;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.query.Param;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {



    @Query("SELECT u FROM User u where u.userIdName = ?1 AND u.userEmail = ?2")
     Optional<User> findUserByNameAndEmail(@Param("userIdName") String userIdName,
                                                    @Param("userEmail") String userEmail);

    @Query("SELECT u FROM User u where u.userPerson = ?1")
    List<User> findUserByPerson(@Param("userPerson") String userPerson);

}



