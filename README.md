# Electric Cloud Immersion Plugin
I created this plugin as an exercise to understand how Electric cloud plugins are built and deployed. This can also be used by a prospective plug in developer to create something similar to it, as part of a first week immersion into electric cloud.

This project also contains a perl script that can be used to create a project within Electric flow by using the ec-perl tool.

## Instructions
- Clone this project
- Modify immersionplugin/src/main/resources/project/procedures/sayHello.pl to create a different message.
- Follow instructions under https://electric-cloud.github.io/build-deploy.html to build using gradle
- Once done import plugin to Electric Flow as per Electric Flow userguide. This should create a plugin called ImmersionPlugin.
- Create the project using command line below
`ec-perl createHelloWorldProject.pl`
- The above step would create a Project called ImmersionProject which would use the ImmersionPlugin.
- Run the ImmersionProject to see the following message printed when the sayHello step completes.
`Welcome to Electric Cloud, You are now immersed into Plugin Development!`