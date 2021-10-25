package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Owner("admin")
@Feature("Auth")
@Story("External Auth")
public class AuthTest {

    @Test
    @AllureId("37973")
    @DisplayName("Авторизация через Google")
    public void testGoogle() {
        step("Открываем главную страницу");
        step("Авторизуемся как пользователь eroshenkoam");
        step("Проверяем что авторизовались верно", () -> {
            step("Редирект на главную страницу сервиса");
            step("Логин eroshnekoam ");
            step("Имся Artem Eroshenko");
        });
    }
}
