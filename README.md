# Services List

Flight Services : 

	Add Flight :
		curl -X POST http://localhost:8080/flights/addflight -H "Content-Type: application/json" -d '{
		  "name": "Test Name",
		  "description": "Test Desc",
		  "price": 300.0
		}'

	Get Flights : 
		curl -X GET http://localhost:8080/flights/getallflights

	Get Flight : 
		curl -X GET http://localhost:8080/flights/{id}

	Update Flight : 
		curl -X PUT http://localhost:8080/flights/1 -H "Content-Type: application/json" -d '{
		  "name": "Test Name",
		  "description": "Test Desc",
		  "price": 300.0
		}'

	Delete Flight : 
		curl -X DELETE http://localhost:8080/flights/{id}


Seat Services : 

	Add Seat : 
		curl -X POST http://localhost:8080/seats/addseat -H "Content-Type: application/json" -d '{
		  "seatNumber": "A1",
		  "flight": {
		    "id": 1
		  }
		}'

	Get By Flight Id : 
		curl -X GET http://localhost:8080/seats/flight/{flightId}

	Purchase Seat : 
		curl -X POST http://localhost:8080/seats/{id}/purchase

	Update Seat : 
		curl -X PUT http://localhost:8080/seats/{id} -H "Content-Type: application/json" -d '{
		  "seatNumber": "A2",
		  "flight": {
		    "id": 1
		  }
		}'

	Delete Seat : 
		curl -X DELETE http://localhost:8080/seats/{id}


Passenger Services :

	Add Passenger : 
		curl -X POST http://localhost:8080/passengers/addpassenger -H "Content-Type: application/json" -d '{
		  "name": "Test Name",
		  "email": "test@test.com"
		}'

	Get Passengers : 
		curl -X GET http://localhost:8080/passengers/getallpassengers

	Get Passenger by ID :
		curl -X GET http://localhost:8080/passengers/{id}

	Update Passenger : 
		curl -X PUT http://localhost:8080/passengers/{id} -H "Content-Type: application/json" -d '{
		  "name": "Test Name",
		  "email": "test@test.com"
		}'

	Delete Passenger : 
		curl -X DELETE http://localhost:8080/passengers/{id}
