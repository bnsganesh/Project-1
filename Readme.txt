Title
	Project #1

Description
	It's an Application for tranporting the small or tiny goodies between small ranges. It provides interfaces for the both Traveller and Exporter.
	Whenerver a person wants to send a thing  'ABC' from location 'X' to location 'Y'. Then the person can utilize this application, can search for 
	Traveller who travels from 'X' to 'Y' and willing to transport. On Sucessful Booking, Some Credits would be transferred between Exporter and Traveller.

Application Type
	Console Based Application

Interfaces:
	1) Traveller
	2) Exporter

Interface
	1) Traveller
			Name	Age	PhoneNo	fromLocation	toLocation		Willing	Credit
	2) Exporter
			Name	Age	PhoneNo	fromLocation	toLocation		GoodType	  Debit
	3) Admin
			username	password	Display

Models
	1) Person
		Name	Age Phone No fromLocation	toLocation
	2)Transporter
		Person	Willing Credit
	3) Exporter
		Person	GoodType	Debit