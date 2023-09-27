#!/user/bin/env groovy

// import com.example.Docker
def call() {
    // return new Docker(this).buildDockerImage(imageName)
        echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t vascheffer/demo-app:jma-2.0 .'
        sh 'echo $PASS | docker login -u $USER --password-stdin'
        sh 'docker push vascheffer/demo-app:jma-2.0'

    }
}