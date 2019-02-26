Scenario: Login succesfully to greytHR site

Given the <url> is launched
When username <user> and password <pwd> is entered and click on sigin
Then greytHR home page should display
Examples:
|url|user|pwd|
|https://milvik.greythr.com/login.do|66||