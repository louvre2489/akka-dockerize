- Create Docker Image

`sbt docker:publishLocal`

- Run

`docker run -d -p 8080:8080 --name akka akka-dockerize:1.0`