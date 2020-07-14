package ro.project.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.project.project.models.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {

}
