@echo off
chcp 65001
:x
echo 編譯中...
javac test1.java
echo 編譯完成 自動執行中
java test1
pause
goto x
exit
