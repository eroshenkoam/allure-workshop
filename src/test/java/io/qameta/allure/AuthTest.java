package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Owner("admin")
@Feature("Auth")
@Microservice("Auth")
@Story("External Auth")
public class AuthTest {

    @Test
    @AllureId("37948")
    @JiraIssue("AE-1")
    @Tags({@Tag("web"), @Tag("smoke")})
    @DisplayName("Авторизация через Facebook")
    public void testFacebook() {
        step("Открываем главную страницу");
        step("Выбираем авторизацию через Facebook", () -> {
            step("Нажимаем кнопку Войти");
            step("Нажимаем кнопку Facebook");
            step("Проверяем что перешли на страницу Facebook");
        });
        step("Авторизуемся как пользователь 'Mr Test'", () -> {
            step("Вводим логин 'test-user@gmail.com'");
            step("Вводим пароль 'test-pass'");
            step("Нажимаем кнопку Войти");
        });
        step("Проверяем что успешно авторизовались", () -> {
            step("Текущая страница - это глаавня страницу приложения");
            step("Имя пользователя 'Mr Test'");
            step("Логин пользователя 'test-user'");
        });
    }

}
