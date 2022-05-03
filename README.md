# Demoinit
# Web Test part
for the web test part no prerequests is required and no config 
everything is already setup
the application ligin in package
src/main/java/web

test for web demo is in package
src/test/java/webtest
#############################
# mobile test part
app logic
src/main/java/mobile
test
src/test/java/mobiletest
config
    locally
    replace executionplatform.properties with the file for mobile app it is the same name but for you I will name it executionPlatform1 to make it clear for you but do not forget to remove the 1 when you run the test
    build emulator and run appium server on 0.0.0.0:4723
##############################
# CI/CD 
no config required everything is already configured with github action
the test will run in headless mode

docker compose file is already prepared in 
src/main/resources/docker-compose
####################
# Hint
in this demo I try to make it easy as much as I can to the one who will write the test so I use builder pattern with self reference
with this approach I design the test with the chain of responsibility styple and follw page object model
