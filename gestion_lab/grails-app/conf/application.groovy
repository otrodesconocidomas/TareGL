
<<<<<<< HEAD

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'gestion_lab.security.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'gestion_lab.security.UserRole'
grails.plugin.springsecurity.authority.className = 'gestion_lab.security.Role'

grails.plugin.springsecurity.securityConfigType="InterceptUrlMap"
grails.plugin.springsecurity.interceptUrlMap = [
=======
// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'gestion_lab.SecUser'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'gestion_lab.SecUserSecRole'
grails.plugin.springsecurity.authority.className = 'gestion_lab.SecRole'
grails.plugin.springsecurity.securityConfigType = "InterceptUrlMap"
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	
>>>>>>> 0f5496efbde1589bc4607e420e677a9616ea3fce
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
<<<<<<< HEAD
	[pattern: '/**/favicon.ico', access: ['permitAll']],
	[pattern: '/login/**',       access: ['permitAll']],
	[pattern: '/logout/**',      access: ['permitAll']],
	[pattern: '/dbconsole/**',   access: ['permitAll']],
	[pattern: '/console/**',     access: ['permitAll']],
	[pattern: '/', 				 access: ['ROLE_ADMIN']]
=======
	[pattern: '/**/favicon.ico', access: ['permitAll']]
>>>>>>> 0f5496efbde1589bc4607e420e677a9616ea3fce
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

<<<<<<< HEAD
grails.plugin.springsecurity.logout.postOnly = false
grails.plugin.springsecurity.logout.afterLogoutUrl = '/login/auth'
=======
>>>>>>> 0f5496efbde1589bc4607e420e677a9616ea3fce
