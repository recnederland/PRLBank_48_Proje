

@DeleteState
Scenario Outline: delete states
Given user deletes a state using endpoint "<endPoint>" and its extension "<id>"

Examples: multiple states
|endPoint|id|
|https://www.gmibank.com/api/tp-states|/91463|
      #this is unique state id

@UpdateState
Scenario Outline: update states
Given user sets the response using api end point "https://www.gmibank.com/api/tp-states" and updates states using "<idJson>" and "<nameJson>"

Examples: multiple countries
|idJson|nameJson|
|91459   |NevaDADAzona|