package com.whoborrowedwhat

class User {

	String username
	String password
	boolean enabled
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired
	
	
//	Burt Beckwith added a comment - 07/Mar/11 10:03 PM
//	The same thing happens in regular GORM - persistent properties are derived from the available getters, so you either need to add non-persistent properties to the transients list or make the return type 'def'.
//	http://jira.grails.org/browse/GPMONGODB-13
	static transients = ['authorities']

	static constraints = {
		username blank: false, unique: true
		password blank: false
	}

	static mapping = {
		password column: '`password`'
	}

	Set<Role> getAuthorities() {
		UserRole.findAllByUser(this).collect { it.role } as Set
	}
}
