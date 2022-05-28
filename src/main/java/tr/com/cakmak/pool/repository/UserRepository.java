package tr.com.cakmak.pool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.cakmak.pool.model.entity.Users;

public interface UserRepository extends JpaRepository<Users,Long> {
}
