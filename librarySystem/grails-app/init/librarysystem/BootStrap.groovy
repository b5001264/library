package com.AGMOODY

class BootStrap {

    def init = { servletContext ->

def library1 = new Library (

building: 'Sheffield Hallam',
address: 'Arundel Gate',
openingHours: '09:00 - 17:00',
location: 'Sheffield',
studySpaces: 42

).save()

def library2 = new Library (

building: 'Sheffield Hallam',
address: 'Cantor',
openingHours: '09:00 - 17:00',
location: 'Sheffield',
studySpaces: 106

).save()

def course1 = new Course (

title: 'Computing',
code: 'ACES',
leader: 'Tonderai',
department: 'Computing',
description: 'This is a Computing course',
studyMode: 'Full Time'

).save()

def course2 = new Course (

title: 'Business and Computing',
code: 'ACES',
leader: 'Matthew Love',
department: 'Computing',
description: 'This is a Business and Computing course',
studyMode: 'Full Time'

).save()

def student1 = new Student (

name: 'Ryan Wiggles',
email: 'b5001264@my.shu.ac.uk',
username: 'Wiggles',
password: 'password',
studentID: 'b5001264',
course: course1

).save()

def student2 = new Student (

name: 'Chloe Harvey',
email: 'b5001263@my.shu.ac.uk',
username: 'Harvey',
password: 'password1',
studentID: 'b5001263',
course: course2

).save()

def student3 = new Student (

name: 'Miles Kenyon',
email: 'b5001262@my.shu.ac.uk',
username: 'Milesy',
password: 'password3',
studentID: 'b5001262',
course: course2

).save()

def book1 = new Book(

title: 'Twits',
subject: 'Children Stories',
author: 'Roald Dahl',
isbn: '012345678',
dateBorrowed: new Date('16/03/2017'),
returnDate: new Date('23/03/2017'),
student: student1,
overdue: false

).save()

def book2 = new Book(

title: 'Fantastic Mr Fox',
subject: 'Children Stories',
author: 'Roald Dahl',
isbn: '123456789',
dateBorrowed: new Date('17/03/2017'),
returnDate: new Date('24/03/2017'),
student: student2,
overdue: false

).save()

def book3 = new Book(

title: 'The Witches',
subject: 'Children Stories',
author: 'Roald Dahl',
isbn: '234567891',
dateBorrowed: new Date('18/03/2017'),
returnDate: new Date('25/03/2017'),
student: student3,
overdue: false

).save()

def bookReview1 = new BookReview(

book: book1,
dateMade: new Date('17/03/2017'),
student: student1,
review: 'very good'

).save()

def bookReview2 = new BookReview(

book: book2,
dateMade: new Date('18/03/2017'),
student: student2,
review: 'did not like this book'

).save()

def bookReview3 = new BookReview(

book: book3,
dateMade: new Date('19/03/2017'),
student: student3,
review: 'this book was ok'

).save()

def librarian1 = new Librarian(

name: 'Mr Jones',
email: 'mrjones@outlook.com',
office: 'adsetts',
username: 'sjones',
password: 'password',
telephone: '01122345987',
library: library1

).save()

def librarian2 = new Librarian(

name: 'Mrs Berry',
email: 'mrsberry@outlook.com',
office: 'cantor',
username: 'mberry',
password: 'password',
telephone: '01122456097',
library: library2

).save()


}
    def destroy = {
    }
}
