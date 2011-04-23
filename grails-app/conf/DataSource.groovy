grails {
    mongo {
        host="localhost"
//        port="27017"
//        username="blah"
//        password="blah"
//        databaseName="wbw"
//        replicaSet = [ "localhost:27017", "localhost:27018", "localhost:27019" ]
    }
}
// environment specific settings
environments {
    development {
		grails {
			mongo {
//				host="localhost"
				port="27017"
//				username="devUser"
//				password="#p455w0rd!"
				databaseName="wbwDev"
			}
		}
    }
    test {
		grails {
			mongo {
				host="localhost"
				port="27027"
				username="testUser"
				password="#p455w0rd!"
				databaseName="wbwTest"
			}
		}
    }
    production {
    }
}