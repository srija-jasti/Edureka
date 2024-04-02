Feature: search courses on edureka app
#

@tag
Scenario: enrollment pop up using category
Given user is on edureka Homepage
When user click on DevOps Category
When user click on Devps certification course
When user has click on enroll button
Then user should see enroll pop

@tag
Scenario: Search using Keyword and go to course page
Given user is on edureka Homepage
When user tap on search screen
When user enter "power Bi" in search bar and click
And user should see list of courses related to the power bi
And user tap on the course Micosoft powerBi Certification Training Course
Then user should be on course page
#
#@tag
#Scenario: Search using courses option 
#Given user is on edureka Homepage
#When user click on courses button
#And different courses will be display
#And user click on Selenium Certification Training course
#Then user will be redirected to enrollment page

@tag
Scenario: To get help in enrolling
Given user is in Edureka Homepage
When user tap click on search screen
When user enter "Cloud Architect Course - Masters Program" on search bar and click 
And user tap on the course Cloud Architect Course - Masters Program
And user click on get in touch button
Then user will get a popup

@tag
Scenario Outline: search using course name and read review
Given user is in Edureka Homepage
When user click on search screen
When user enter <courses> in search bar
When web page is redirected to the course page and click on review
Then reviews will be displayed

Examples:
		|courses|
		|"PMP Certification Training Course"|

@tag
Scenario: unable to login during enrollment 
Given user is on edureka Homepage
When user select on know more it is redirected to course page
When user click on login button to enroll
When user give username
When user click on login
Then it shows a error message
