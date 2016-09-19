node{
    
    docker.withRegistry('https://dtrnodednsq7g5ypoz2cbpo.westus.cloudapp.azure.com/', 'ddc-dtr-login') {
        git 'https://github.com/SattaRavi/example-voting-app.git'
    
        docker.build('admin/com.sysgain.voting-app.worker','./worker').push('latest')
    }
    
}
