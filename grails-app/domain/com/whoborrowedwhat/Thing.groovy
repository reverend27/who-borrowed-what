package com.whoborrowedwhat

class Thing {
	String name
	String desc
//	Person borrowedFrom
//	Person lentTo
	Date onDate
	Date returnDate
	Boolean returned
	Boolean archived
//	Byte[] photo

    static constraints = {
		name blank:false, nullable:false, maxSize:255
		desc nullable:true, maxSize:1000
//		borrowedFrom nullable:true
//		lentTo nullable:true
		onDate nullable:true
		returnDate nullable:true
    }
}
