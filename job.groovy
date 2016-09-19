node{
    
    docker.withRegistry('https://dtrnodednsq7g5ypoz2cbpo.westus.cloudapp.azure.com/', 'satta-dtr-login') {
        git 'https://github.com/SattaRavi/example-voting-app.git'
        
         build 'Job-Result'
         build 'Job-Vote'
         build 'Job-Worker'
        
    }
    
}
