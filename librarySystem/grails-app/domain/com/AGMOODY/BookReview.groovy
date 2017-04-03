package com.AGMOODY

class BookReview {

String title
Date dateMade
Student student
String review

String toString(){
return title}

static hasMany=[books:Book]
static belongsTo = Book

    static constraints = {
title blank:false, nullable:false
dateMade blank:false, nullable:false
student blank:false, nullable:false
review blank:false, nullable:false
    }
}
