To run this application on kubernetes follow the below given steps

step 1
    build jar file using maven
        mvn package
step 2
    build docker image
        docker build -t <username>:<image-name>:tag .
step 3
    test docker image by running the image as a docker container
        docker run -it -v <path to application.properties file on host machine(kubernetes node)>:/opt/data <image name>

step 4
    deploying and testing on kubernetes
         create application.properties file in the kubernetes nodes.
         kubectl apply if kubernetes/samplejava-deployment.yaml

step 5
    test the application  by printing the log
    kubectl logs -f <pod-name>