@tag
Feature: Busqueda de productos
  Necesito buscar un mouse

  @tag1
  Scenario: Busqueda de producto
    Given Abro el Navegador con la pagina web
    And navego por la pagina
    When encuentro el buscador
    And escribo mouse y comienzo la busqueda
    Then veo todos los resultados
    And se cierra el navegador
