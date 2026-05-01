package jpa_app.repositories;

import jpa_app.entities.Authorities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthoritiesRepository extends JpaRepository<Authorities, Integer> {

    @Query("select Authorities from Authorities auth where auth.moduleId =:moduleId and auth.roleId=:roleId")
    public Optional<Authorities> findAllByModuleIdAndRoleId(Integer moduleId, Integer roleId);


}
