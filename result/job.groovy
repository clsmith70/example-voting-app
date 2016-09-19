node{
    
    docker.withRegistry('https://dtrnodednsq7g5ypoz2cbpo.westus.cloudapp.azure.com', 'satta-dtr-login') {
        git 'https://github.com/SattaRavi/example-voting-app.git'

        docker.build('satta/com.sysgain.voting-app.result','./result').push('latest')
    }
    
}
