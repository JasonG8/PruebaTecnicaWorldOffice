# **PRUEBA TECNICA WORLD OFFICE PARA QA AUTOMATION**

## Introducci贸n 馃摉
Automatizaci贸n desarrollada para cumplir con el reto t茅cnico para ingresar al equipo de QA en World Office.
La automatizaci贸n se realiz贸 para la pagina [AdvantageDemo](https://www.advantageonlineshopping.com/#/).

## Pre-requisitos 馃搵
- Java version 1.8 update 241 o superior y JDK (variables de entorno configuradas)
- IntelliJ IDEA  o Eclipse IDE  
- Gradle version 6.0 o superior (variables de entorno configuradas)
- Cucumber
## Instalaci贸n 馃洜锔忦煍?
- Descomprimir el archivo comprimido:
- Importar el proyecto desde Eclipse o IntelliJ IDE bajo la estructura de un proyecto Gradle existente 
- Configurar JRE System Library con JavaSE-1.8
- Configurar la codificaci贸n a UTF-8 al proyecto una vez sea importado

## Navegadores Web 馃寪
La automatizaci贸n actualmente se ejecuta en los siguientes navegadores
- Google Chrome Version 103 o superior
## Detalles Generales De La Implementaci贸n  馃捇
Los escenarios de pruebas se crean en el feature con lenguaje Gherkin, se conectan con un m茅todo de las clases StepDefinitions con la ayuda de anotaciones @Given, @When y @Then, los m茅todos de la definici贸n de los pasos se conectan con clases tipo Task para el Given y el When, donde se realizan las acciones de alto nivel y desde las cuales se pueden invocar clases tipo Interactions en las cuales se realizan acciones de bajo nivel, pero para el Then se comunica con clases tipo Questions para hacer las validaciones.
馃毀 **_La estructura completa del proyecto se ver谩 as铆:_**
   ```bash
   馃摝NameProject(AutomationAdvantageOnlineShopping)
   鈹? 馃搨src
   鈹? 鈹? 馃搨main
   鈹? 鈹? 鈹? 馃搨java
   鈹? 鈹? 鈹?   鈹? 馃搨exceptions (Clases que capturan excepciones personalizadas cuando falla la automatizaci贸n y no encuentra un campo esperado.
   鈹? 鈹? 鈹?   鈹? 馃搨interactions (Clases que realizan las acciones de bajo nivel, como lo es escribir texto en campos, hacer clicks, entre otros.) 
   鈹? 鈹? 鈹?   鈹? 馃搨questions (Clases en las que se realizan las validaciones de los escenarios)
   鈹? 鈹? 鈹?   鈹? 馃搨tasks (Clases que realizan las acciones de alto nivel, como ingresar datos de un formulario, etc.)
   鈹? 鈹? 鈹?   鈹? 馃搨userinterfaces(Clases donde se mapean los elementos de la interfaz de usuario, es decir los elementos web.) 
   鈹? 鈹? 鈹?   鈹? 馃搨utils (Clases que contienen funcionalidades en com煤n.)
   鈹? 鈹? 鈹? 馃搨resources
   鈹? 鈹? 馃搨test
   鈹? 鈹? 鈹? 馃搨java
   鈹? 鈹? 鈹?   鈹? 馃搨runners(Clases para ejecutar la automatizaci贸n con los escenarios indicados en el feature.)
   鈹? 鈹? 鈹?   鈹? 馃搨stepdefinitions (Clases donde se definen los pasos de los escenarios a ejecutar en la automatizaci贸n.)
   鈹? 鈹? 鈹? 馃搨resources
   鈹? 鈹?   鈹? 馃搨features (Se almacenar los archivos con extensi贸n.feature, donde se redactan las historias de usuario.)
   鈹? 馃搨target
   鈹? 馃摐build.gradle
   鈹? 鈿欙笍ChromeDriver.exe
   鈹? 馃摐gradlew
   鈹? 馃摐gradle.bat
   鈹? 馃摐settings.gradle
```

## Construido con 馃懆馃徎鈥嶐煉?
 La automatizaci贸n fue desarrollada con:
 - Java - Lenguaje de programaci贸n.
 - BDD - Estrategia de desarrollo
 - Screenplay - Patron de dise帽o
 - Gradle - Gestor de dependencias
 - Selenium Web Driver - Herramienta para  automatizar acciones en navegadores web
 - Cucumber - Framework para automatizar pruebas BDD
 - Serenity BDD - Biblioteca de c贸digo abierto para la generaci贸n de reportes
 - Gherkin - Lenguaje Business Readable DSL (Lenguaje especifico de dominio legible por el negocio)

## Autor 鉁掞笍馃懆馃徎鈥?
 **漏锔? Jason David Guzman Gomez** - *Creaci贸n de proyecto.* - [jeison.0828@gmail.com]
