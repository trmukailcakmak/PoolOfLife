package tr.com.cakmak.pool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.cakmak.pool.model.entity.Friends;

public interface FriendsRepository extends JpaRepository<Friends, Long> {
}
