package Pages;

import org.openqa.selenium.By;

public class P11CreateOrder {
    public static By ShippingCartPageLocator = By.cssSelector("#topcartlink > a");
    public static By CountryLocator =By.id("BillingNewAddress_CountryId");
    public static By city = By.id("BillingNewAddress_City");
    public static By Address = By.id("BillingNewAddress_Address1");
    public static By ZIPCode = By.id("BillingNewAddress_ZipPostalCode");
    public static By Phone = By.id("BillingNewAddress_PhoneNumber");
    public static By ShippingMethodLocator = By.xpath("//div[contains(@id, 'shipping-method-buttons-container')] /button[contains(@class, 'shipping-method-next-step-button')]");
    public static By PaymentMethodBTNLocator = By.xpath("//div[contains(@id, 'payment-method-buttons-container')] /button[contains(@class, 'payment-method-next-step-button')]");
    public static By PaymentInfoBTNLocator = By.xpath("//div[contains(@id, 'payment-info-buttons-container')] /button[contains(@class, 'payment-info-next-step-button')]");
    public static By ConfirmOrderBTNLocator = By.xpath("//div[contains(@id, 'confirm-order-buttons-container')] /button[contains(@class, 'confirm-order-next-step-button')]");
    public static By SuccessMessageLocator = By.xpath("//div[contains(@class, 'order-completed')] /div[contains(@class, 'title')] /strong");
    public static By OrderNumberLocator = By.xpath("//div[contains(@class, 'details')] /div[contains(@class, 'order-number')] /strong");





}
