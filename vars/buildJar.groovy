#!/user/bin/env groovy

def call() {
    //echo "building the application for branch $BRANCH_NAME"
    echo "building the application for branch $BRANCH_NAME" // branch_name is not working
    sh 'mvn package'
}