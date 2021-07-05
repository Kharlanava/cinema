package cinema.util;

import cinema.model.Role;
import cinema.model.RoleName;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(RoleName.ROLE_ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(RoleName.ROLE_USER);
        roleService.add(userRole);
        User user = new User();
        user.setEmail("admin@i.com");
        user.setPassword("admin123");
        user.setRoles(Set.of(adminRole));
        userService.add(user);
    }
}
