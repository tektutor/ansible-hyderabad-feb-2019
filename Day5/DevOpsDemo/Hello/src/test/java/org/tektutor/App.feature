Feature: Develop a simple Java Hello World application.

	Scenario: I should be able to invoke sayHello API
		
		Given An App class object exists
                When I invoke the sayHello API
                Then I expect the response "Hello DevOps!"
