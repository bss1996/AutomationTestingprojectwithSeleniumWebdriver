Feature: Login Feature

Scenario: User login with valid credentials
    Given User Has Launch Chrome Browser
    When User open URL "https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage"
    When User enter Email as "shekhawat.bs13@gmail.com" and password as "Nandu!9784"
    When Click on Login button