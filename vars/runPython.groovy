def maintenance_sonar( String url, String dias, String token ) {
  final pythonContent = libraryResource('com/scotiabank/sharedlib/test.py')
  writeFile(file: 'test.py', text: pythonContent)
  sh('chmod +x test.py && echo "./test.py ${url} ${dias} ${token}" ')
}