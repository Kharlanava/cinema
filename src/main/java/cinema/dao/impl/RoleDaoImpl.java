package cinema.dao.impl;

import cinema.dao.AbstractDao;
import cinema.dao.RoleDao;
import cinema.exception.DataProcessingException;
import cinema.model.Role;
import cinema.model.RoleName;
import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getRoleByName(String roleName) {
        try (Session session = factory.openSession()) {
            return session.createQuery("FROM Role "
                            + "WHERE roleName = :roleName", Role.class)
                    .setParameter("roleName", RoleName.valueOf("ROLE_" + roleName))
                    .uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Can't found role with name " + roleName, e);
        }
    }
}
