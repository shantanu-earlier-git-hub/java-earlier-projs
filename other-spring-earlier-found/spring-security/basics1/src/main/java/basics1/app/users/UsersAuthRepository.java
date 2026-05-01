package basics1.app.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersAuthRepository extends JpaRepository<UserAuthorities, Integer> {

}
