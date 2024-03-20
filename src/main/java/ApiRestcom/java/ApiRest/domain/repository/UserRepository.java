package ApiRestcom.java.ApiRest.domain.repository;

import ApiRestcom.java.ApiRest.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface UserRepository extends JpaRepository<User, Long> {
        boolean existsByAccountNumber(String accountNumber);
    }


