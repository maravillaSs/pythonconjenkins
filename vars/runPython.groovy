def call( String host, String dias, String token ) {
  final pythonContent = libraryResource('com/scotiabank/sharedlib/test.sh')
  writeFile(file: 'test.sh', text: pythonContent)
  sh """
     chmod +x test.sh
     ./test.sh ${host} ${dias} ${token}"
     """
}