package basics1.app.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRolesRepository extends JpaRepository<UserRoles, Integer> {

}
