Select select = null;
public void selectValue(WebElement element, String text) {
       select = new Select(element);
       select.selectByVisibleText(text);
}
