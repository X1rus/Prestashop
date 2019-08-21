del /q "D:\SET\Prestashop\allure-results"
FOR /D %%p IN ("D:\SET\Prestashop\allure-results") DO rmdir "%%p" /s /q
exit