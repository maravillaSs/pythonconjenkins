def call( a, b, c ) {
  final pythonContent = libraryResource('com/scotiabank/sharedlib/test.py')
  writeFile(file: 'test.py', text: pythonContent)
  sh """
     chmod +x test.py
     echo "./test.py ${a} ${b} ${c}"
     """
}