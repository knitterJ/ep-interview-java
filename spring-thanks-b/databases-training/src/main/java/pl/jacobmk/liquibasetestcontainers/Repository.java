package pl.jacobmk.liquibasetestcontainers;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Person, Long> {
}
