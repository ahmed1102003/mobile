Feature: Open Test App Andriod  

Scenario: Open Test App Andriod  cucumber

Given Open Mopria Print with for parameter from cucumber

|    Android   |  HT4CSJT00905 |    MainActivity | 6.0  |  com.example.sdasilva.practiceapp1|

#When The ID is 'com.example.sdasilva.practiceapp1:id/editText' and the printer 'Enter message here' should discover

When I Enter 'CR7' in the 'com.example.sdasilva.practiceapp1:id/editText' feild

And I Click on 'com.example.sdasilva.practiceapp1:id/button' button

Then The Text should discover at 'com.example.sdasilva.practiceapp1:id/textView'
