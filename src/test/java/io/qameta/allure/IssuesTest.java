package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Feature("Задачи")
@Owner("eroshenkoam")
public class IssuesTest {

    private final String REPOSITORY = "owner/repo";
    private final int ISSUE = 74;

    @Test
    @Tag("critical")
    @AllureId("88708")
    @Story("Поиск задачи в репозитории")
    @DisplayName("Неавторизованный пользователь должен иметь возможность найти задачу в репозитории")
    public void testIssueSearch() {
        step("Открывает главную страницу");
        step("Ищем репозиторий " + REPOSITORY + " на основной странице", () -> {
            step("Кликаем на поисковую строку");
            step("Вводим текст " + REPOSITORY);
            step("Нажимаем кнопку Enter");
        });
        step("Переходим по ссылке репозитория " + REPOSITORY);
        step("Активируем таб Задачи в настройках");
        step("Переходим в Tab Задачи");
        step("Проверяем что Задача с номером #" + ISSUE + " существует");
    }

    @Test
    @Tag("critical")
    @AllureId("88710")
    @Story("Поиск задачи в репозитории")
    @DisplayName("Владелец репозитория должен иметь возможность найти задачу в репозитории")
    public void testIssueSearchForRepoOwner() {
        step("Открывает главную страницу");
        step("Ищем репозиторий " + REPOSITORY + " в форме поиска в шапке", () -> {
            step("Кликаем на поисковую строку");
            step("Вводим текст " + REPOSITORY);
            step("Нажимаем кнопку Enter");
        });
        step("Переходим по ссылке репозитория " + REPOSITORY);
        step("Переходим в Tab Задачи");
        step("Проверяем что Задача с номером #" + ISSUE + " существует");
    }

}
