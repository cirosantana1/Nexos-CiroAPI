@FeatureDos
Feature: Caso de Prueba Booking - CreateBooking.

#Creación de los libros
  Scenario: Consumo del servicio Booking - CreateBooking para Pedro
    Given Que deseo crear un nuevo libro para Pedro
    When Ingreso la informacion solicitada para libro de Pedro
    Then Se recibe una respuesta exitosa del libro de Pedro

  Scenario: Consumo del servicio Booking - CreateBooking para Javier
    Given Que deseo crear un nuevo libro para Javier
    When Ingreso la informacion solicitada para libro de Javier
    Then Se recibe una respuesta exitosa del libro de Javier

#Consulta de los libros
  Scenario: Consumo del servicio Booking - GetBooking para Pedro
    Given Que deseo consultar un libro
    When Genero la consulta para libro de Pedro
    Then Se recibe una respuesta exitosa de la consulta del libro de Pedro

  Scenario: Consumo del servicio Booking - GetBooking para Javier
    Given Que deseo consultar un libro
    When Genero la consulta para libro de Javier
    Then Se recibe una respuesta exitosa de la consulta del libro de Javier