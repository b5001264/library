package com.AGMOODY

class BookReview {

Date dateMade
Student student
String review

static hasMany=[books:Book]
static belongsTo = Book

    static constraints = {
dateMade blank:false, nullable:false
student blank:false, nullable:false
review blank:false, nullable:false
    }
}
