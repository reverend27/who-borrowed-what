import com.whoborrowedwhat.Role
import com.whoborrowedwhat.User
import com.whoborrowedwhat.UserRole

class BootStrap {

    def springSecurityService

    def init = { servletContext ->
        def adminRole = Role.findByAuthority('ROLE_ADMIN') ?: new Role(
			authority: 'ROLE_ADMIN'
		).save(failOnError: true, flush:true)
        
        def userRole = Role.findByAuthority('ROLE_USER') ?: new Role(
			authority: 'ROLE_USER'
		).save(failOnError: true, flush:true)

		String password = springSecurityService.encodePassword('password')
		
		def testUser = User.findByUsername('test') ?: new User(
			username: 'test', 
			enabled: true,
			password: password
		).save(failOnError: true, flush:true)
		
		println "******" + testUser.authorities
		
		if (!testUser.authorities.any {  it.id == adminRole.id }) {
//		if (!testUser.authorities.contains(adminRole)) {
			println 'creating the user role...'
			UserRole.create testUser, adminRole, true
		}

        assert User.count() == 1
        assert Role.count() == 2
        assert UserRole.count() == 1
    }

    def destroy = {
        
    }
}
