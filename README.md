# Gauge-Framework-Example

###Пункт 1 и 2: Запускаем Powershell от администратора
## 1. Устанавливаем Chocolatey
Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))

## 2. Устанавливаем gauge
choco install gauge