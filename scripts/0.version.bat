@echo off
set workspace=C:\DatosJBB\Workspaces\Workspace.Eclipse.JEE.Luna\SPAI\maven
set PATH=%PATH%C:\Program Files (x86)\Java\jre1.8.0_60\bin;C:\Users\adrian.santos\Desktop\MASTER\apache-maven-3.3.3\bin
set JAVA_HOME=C:\Program Files (x86)\Java\jre1.8.0_60
set M2_HOME=C:\Users\adrian.santos\Desktop\MASTER\apache-maven-3.3.3
echo -----------------------------------------
echo . (C) MIW
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo .
cd %workspace%
echo ============ mvn --version =======================================================
echo .
call mvn --version
call mvn clean package
pause
::Se queda la consola abierta para realizar comandos en línea
::cmd /k
