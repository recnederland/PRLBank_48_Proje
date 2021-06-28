Feature: User create state

  @CreateState
  Scenario Outline: create a state
    Given user sets the response using api end point "https://www.gmibank.com/api/tp-states" and creates states using "<idJson>" and "<nameJson>"

    Examples: create state
      | idJson | nameJson    |
      | 92256  | Nevazona    |
      | 92256  | Calizona    |
      | 92256  | Utazona     |
      | 92256  | New Arizona |
      | 92256  | Texzona     |
      #this is country id that we want the states to be created