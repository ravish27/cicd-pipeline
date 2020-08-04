sudo docker pull ravish27/cicd-pipeline:$1
sudo docker run -p 7011:8081 -d -t ravish27/cicd-pipeline:$1
