package gestion_lab
import gestion_lab.security.Role
import gestion_lab.security.User
import gestion_lab.security.UserRole

class BootStrap {

    def init = { servletContext ->
        environments{
            development{
                bootStrapEntities()
            }
        }
    }
    def destroy = {
    }
    
    private void bootStrapEntities() throws Exception{
        createRoles()
        createUsers()
    }
    private static void createRoles() throws Exception{
        createRol('ROLE_ADMIN')
        createRol('ROLE_ADMIN_USUARIOS')
        createRol('ROLE_ADMIN-CATALOGOS')
    }
    private static void createRol(String authority){
        def role = new Role(authority: authority)
        role.save(failOnError: true)
    }
    private void createUsers() throws Exception{
        createUser('admin', '123456', 'ROLE_ADMIN')
    }
    private void createUser(String username, String password, String role) throws Exception{
        def user = new User(username:username, password:password)
        user.save(failOnError: true)
        def elRol=Role.findByAuthority(role)
        
        if(!elRol){
            elRol=createRol(role)
        }
        new UserRole(user: user, role:elRol).save(failOnError: true)
    }
}
