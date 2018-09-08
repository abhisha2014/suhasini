set projectLocation=C:\Users\Vijay\eclipse-workspace\CraftsVilla
cd % projectLocation%
set classpath= % projectLocation%\bin;\ % projectLocation%\jars\*
java org.testng.TestNG % projectLocation%\testng.xml
pause
