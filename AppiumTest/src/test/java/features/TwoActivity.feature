Feature: Проверка взаимодействия двух Activity

  Scenario: Проверка открытия второго активити из первого
    When Открыто приложение TwoActivity
     And Нажимаем на кнопку "Button"
    Then видим текст "My text"