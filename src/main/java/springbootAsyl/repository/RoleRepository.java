package springbootAsyl.repository;

import springbootAsyl.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.management.relation.Role;

@Repository
public interface RoleRepository extends JpaRepository<Roles, Long> {
    Roles findByRole(String role);
}