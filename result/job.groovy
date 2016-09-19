node{
    
    docker.withRegistry('dtrnodednsq7g5ypoz2cbpo.westus.cloudapp.azure.com', 'ddc-dtr-login') {
        git 'https://github.com/SattaRavi/example-voting-app.git'

        docker.build('admin/com.sysgain.voting-app.result','./result').push('latest')
    }
    
}
