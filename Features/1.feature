Feature: 
	Scenario Outline: Verify Updating user password feature
		Given open google url"<Url>"
		When enter details"<First_Value>"in text box
        And enter details"<Operator>"in text box
        And enter details"<Second_Value>"in text box
        And hit on enter key
		Then result"<Result>"should be displayed in box
Examples:
|Url|First_Value|Second_Value|Operator|Result|
|https://www.google.co.in|5|4|+|9|
|https://www.google.co.in|5|25|+|30|
|https://www.google.co.in|50|25|-|25|
|https://www.google.co.in|5|25|+|30|