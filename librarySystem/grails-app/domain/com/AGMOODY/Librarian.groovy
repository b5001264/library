package com.AGMOODY

class Librarian {

String name
String email
String office
String username
String password
String telephone
String library

    static constraints = {
name blank:false, nullable:false
email blank:false, nullable:false, email:true
username blank:false, nullable:false, username:true
password blank:false, nullable:false, password:true
telephone blank:false, nullable:false
library blank:false, nullable:false
    }
}
