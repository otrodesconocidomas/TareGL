

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'gestion_lab.security.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'gestion_lab.security.UserRole'
grails.plugin.springsecurity.authority.className = 'gestion_lab.security.Role'

grails.plugin.springsecurity.securityConfigType="InterceptUrlMap"
grails.plugin.springsecurity.interceptUrlMap = [
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']],
	[pattern: '/login/**',       access: ['permitAll']],
	[pattern: '/logout/**',      access: ['permitAll']],
	[pattern: '/dbconsole/**',   access: ['permitAll']],
	[pattern: '/console/**',     access: ['permitAll']],
	[pattern: '/', 				 access: ['ROLE_ADMIN']],
	[pattern: '/local/**', 		 access: ['ROLE_ADMIN']],
	[pattern: '/escuela/**',	 access: ['ROLE_ADMIN']],
	[pattern: '/catalogoLocales/**',access: ['ROLE_ADMIN']],
	[pattern: '/materia/**',	 access: ['ROLE_ADMIN']],
	[pattern: '/pensum/**',	 	 access: ['ROLE_ADMIN']],
	[pattern: '/materiaActiva/**',access: ['ROLE_ADMIN']]
	
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

grails.plugin.springsecurity.logout.postOnly = false
grails.plugin.springsecurity.logout.afterLogoutUrl = '/login/auth'