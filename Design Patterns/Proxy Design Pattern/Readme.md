# TLC5: Proxy Design Pattern

This repo contains a program used to demonstrate the proxy design pattern during **TLC5** design pattern presentation.

Presentation date: 18/11/2022

**Document contents**
- [Get the app running](#Get-the-app-running)
  - [Acceptable Permission Values](#Acceptable-Permission-Values)
  - [Running in IntelliJ](#Running-in-IntelliJ)
- [References](#references)

# Get the app running

### Acceptable Permission Values
**arguments are case-insensitive** 
pass these argument to running command to determine session permissions.

| OPERATION | ARGUMENT |
|:----------|:--------:|
| create    |  create  |
| read      |  update  |
| update    |  update  |
| delete    |  delete  |

### Running in IntelliJ
- clone project into your desired repository or [see this link](https://www.jetbrains.com/idea/guide/tutorials/creating-a-project-from-github/clone-from-github/)
- open app in IntelliJ and run gradle build and install all dependencies.
- to pass arguments to your running app [see this link](https://www.baeldung.com/java-command-line-arguments)

# References
- [What is the proxy pattern](https://refactoring.guru/design-patterns/proxy)
- [Running java with gradle](https://docs.gradle.org/current/samples/sample_building_java_applications.html)
- [Passing arguments to running instance](https://www.baeldung.com/java-command-line-arguments)
- [Cloning a Project](https://www.jetbrains.com/idea/guide/tutorials/creating-a-project-from-github/clone-from-github/)
