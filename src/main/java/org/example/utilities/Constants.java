package org.example.utilities;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Constants {
    //Url's
    public static final String URL_AUTH = "https://restful-booker.herokuapp.com/auth";
    public static final String URL_CREATEBOOKING = "https://restful-booker.herokuapp.com/booking";
    public static final String URL_GETBOOKING = "https://restful-booker.herokuapp.com/booking/";


    //Información Auth
    public static final String TEST_USERNAME = "admin";
    public static final String TEST_PASSWORD = "password123";

    //Información CreateBookingDTO
    public static final String TEST_FIRSTNAME_1 = "Pedro";
    public static final String TEST_LASTNAME_1 = "Gutierrez";
    public static final int TEST_TOTALPRICE_1 = 100;
    public static final String TEST_CHECKIN_1 = "2024-03-01";
    public static final String TEST_CHECKOUT_1 = "2024-04-01";
    public static final String TEST_ADDITIONALNEEDS_1 = "Comics";

    public static final String TEST_FIRSTNAME_2 = "Javier";
    public static final String TEST_LASTNAME_2 = "Jaramillo";
    public static final int TEST_TOTALPRICE_2 = 356;
    public static final String TEST_CHECKIN_2 = "2024-03-15";
    public static final String TEST_CHECKOUT_2 = "2024-04-15";
    public static final String TEST_ADDITIONALNEEDS_2 = "Terror";



}
