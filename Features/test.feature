Feature: Pruebas de acceso a traves de username y contraseña
Scenario: Verificación Inicio Sesion Correco
Given Abrir Chrome
When Ingresar Username "rene" y Password "4321"
Then inicia sesion

Scenario: Verificación Inicio Sesion Incorrecto
Given Abrir Chrome
When Ingresar Username "rene" y Password "1234"
Then inicia sesion
  