#!/bin/bash

echo "Starting the TODO app";

WORKING_DIR=$(cd -P -- "$(dirname -- "$0")" && pwd -P);
LOGGING_DIR="$WORKING_DIR/logs";

#echo "workdir: $WORKING_DIR"
#echo "logdir: $LOGGING_DIR"

if [ -d "$LOGGING_DIR" ]; then
   rm -rf $LOGGING_DIR;
fi
mkdir $LOGGING_DIR;

#exit 0;


PATH_APP_SERVICE_DISCOVERY="$WORKING_DIR/spring-walkthrough-servicediscovery/target";
PATH_APP_TODO_API="$WORKING_DIR/spring-walkthrough-todoapi/target";
PATH_APP_TODO_WEB="$WORKING_DIR/spring-walkthrough-todoweb/target";



# SERVICE DISCOVERY STARTUP
touch "$LOGGIN_DIR/serviceDiscovery.log";
nohup java -jar "$PATH_APP_SERVICE_DISCOVERY/spring-walkthrough-servicediscovery.jar" > "$LOGGING_DIR/serviceDiscovery.log" &

sleep 3

# TO-DO API STARTUP
touch "$LOGGIN_DIR/todoApi.log";
nohup java -jar "$PATH_APP_TODO_API/spring-walkthrough-todoapi.jar" > "$LOGGING_DIR/todoApi.log" &

sleep 3

# TO-DO WEBAPP STARTUP
touch "$LOGGING_DIR/todoWeb.log";
nohup java -jar "$PATH_APP_TODO_WEB/spring-walkthrough-todoweb.jar" > "$LOGGING_DIR/todoWeb.log" &

sleep 3

echo "The application is starting..."
echo "For more details check the log files in logs/ directory"





