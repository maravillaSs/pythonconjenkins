def call() {
  final pythonContent = libraryResource('com/scotiabank/sharedlib/test.py')
  writeFile(file: 'test.py', text: pythonContent)
  sh('chmod +x test.py && ./test.py')
}