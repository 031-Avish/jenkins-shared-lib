def call(){
  sh 'echo using jenkins shared library'
  // build docker image

  sh "docker build -t ${imageName}:${tag} ."

  // tag the docker umage 
  sh "docker tag ${imageName}:${tag} ${ecrRepository}:${tag}"

  sh "docker push ${ecrRepository}:${tag}"
}
