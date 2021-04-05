Проект содержит UI-тесты на открытие страниц Отус.

Предполагается запуск тестов в Selenoid под Windows.

Для запуска тестов необходимо запустить приложенный к проекту файл "install.bat":
- скрипт создаст папку C:\users\%USERNAME%\otus7
- скачает в нее Configuration Manager
- запустит через Configuration Manager selenoid
- запустит через Configuration Manager selenoid-ui
После этого тесты доступны для запуска.

Selenoid-UI доступен по адресу:
http://localhost:8080/

Текущий статус selenoid можно посмотреть по адресу:
http://localhost:4444/status