FROM openjdk:17-oracle
EXPOSE 8080
COPY target/*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]

# open windows powershell and do following steps 
# 'docker login '
#goto the project path which contains dockerfile. using cd ...
# 'docker build -t {project name}' . ( build the command to create image)
#then ur image will be created in docker hub verify using command 'docker images'
#'docker tag docker-demo karthiknakshatri/docker-java'(tag the docker image to dockerhub repository)
#'docker push karthiknakshatri/docker-java'({repo name})
#then the images will be pushed to dockerhub under mentioned repositories.
# run the app using 'docker run -p 8080:8080 karthiknakshatri/docker-java'