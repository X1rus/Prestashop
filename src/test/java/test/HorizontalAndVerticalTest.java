package test;

import data.Category;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CategoryPage;
import pages.HomePage;
import tools.TestRunner;

public class HorizontalAndVerticalTest extends TestRunner {
    public HomePage homePage;

    @BeforeMethod
    public void init() {
        homePage = loadApplication();
    }

    @Description("@Description class HorizontalAndVerticalTest; checkClothes().")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void checkClothes() throws InterruptedException {
        //Arrange
        CategoryPage clothesPage;
        String actual;
        String expected = Category.CLOTHES.toString();

        //Act
        clothesPage = homePage.clickClothesButton();
        delayExecution(500); //Only for presentation
        actual = clothesPage.getCategoryName();

        //Assert
        Assert.assertEquals(actual, expected);
    }

    @Description("@Description class HorizontalAndVerticalTest; checkMenClothes().")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void checkMenClothes() throws InterruptedException {
        //Arrange
        CategoryPage menClothesPage;
        String actual;
        String expected = Category.MEN.toString();

        //Act
        homePage.hoverClothesButton();
        delayExecution(500); //Only for presentation
        menClothesPage = homePage.clickMenClothesButton();
        delayExecution(500); //Only for presentation
        actual = menClothesPage.getCategoryName();

        //Assert
        Assert.assertEquals(actual, expected);
    }

    @Description("@Description class HorizontalAndVerticalTest; checkAccessories().")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void checkAccessories() throws InterruptedException {
        //Arrange
        CategoryPage accessoriesPage;
        String actual;
        String expected = Category.ACCESSORIES.toString();

        //Act
        accessoriesPage = homePage.clickAccessoriesButton();
        actual = accessoriesPage.getCategoryName();

        //Assert
        Assert.assertEquals(actual, expected);
    }

    @Description("@Description class HorizontalAndVerticalTest; checkStationeryAccessories().")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void checkStationeryAccessories() {
        //Arrange
        CategoryPage stationeryAccessoriesPage;
        String actual;
        String expected = Category.STATIONERY.toString();

        //Act
        homePage.hoverAccessoriesButton();
        stationeryAccessoriesPage = homePage.clickStationeryAccessoriesButton();
        actual = stationeryAccessoriesPage.getCategoryName();

        //Assert
        Assert.assertEquals(actual, expected);
    }

    @Description("@Description class HorizontalAndVerticalTest; checkArt().")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void checkArt() {
        //Arrange
        CategoryPage artPage;
        String actual;
        String expected = Category.ART.toString();

        //Act
        artPage = homePage.clickArtButton();
        actual = artPage.getCategoryName();

        //Assert
        Assert.assertEquals(actual, expected);
    }
}
