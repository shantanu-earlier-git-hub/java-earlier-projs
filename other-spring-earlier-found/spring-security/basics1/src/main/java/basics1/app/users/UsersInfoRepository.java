package basics1.app.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersInfoRepository extends JpaRepository<UserInfo, Integer> {

}
