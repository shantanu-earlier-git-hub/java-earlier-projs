package basics1.app.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findUserEntityByName(String name);

}
