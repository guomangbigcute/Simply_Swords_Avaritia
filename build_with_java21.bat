@echo off
echo ========================================
echo Building with Java 21 (Zulu)
echo ========================================
echo.

REM Set Java 21 path
set JAVA_HOME=C:\Program Files\Zulu\zulu-21
set PATH=%JAVA_HOME%\bin;%PATH%

REM Use local Gradle directory to avoid cache conflicts
set GRADLE_USER_HOME=%~dp0.gradle-local

REM Fix SSL certificate issues with Zulu JDK
set GRADLE_OPTS=-Djavax.net.ssl.trustStoreType=Windows-ROOT

echo Using GRADLE_USER_HOME: %GRADLE_USER_HOME%
echo.

REM Verify Java version
echo Current Java version:
java -version
echo.

REM Clean build directories
echo Cleaning build directories...
if exist .gradle-local rmdir /s /q .gradle-local
if exist .gradle rmdir /s /q .gradle
if exist common\build rmdir /s /q common\build
if exist forge\build rmdir /s /q forge\build

REM Clean global Gradle caches (this will force re-download of all dependencies)
echo Cleaning global Gradle caches...
if exist C:\Users\yyy\.gradle\caches rmdir /s /q C:\Users\yyy\.gradle\caches
if exist C:\Users\yyy\.gradle\wrapper\dists rmdir /s /q C:\Users\yyy\.gradle\wrapper\dists
echo Done.
echo.

REM Build the project
echo Starting build...
call gradlew.bat :forge:build --no-daemon

echo.
echo ========================================
echo Build completed!
echo ========================================
pause
