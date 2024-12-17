package org.example.tests.integration.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.TestRunner.PriorityWeight.priority;

public class TestIntegrationSample {

    // Create a booking , Create a token
    // Get Booking
    // Update the booking
    // Delete the booking

    @Test(groups = "qa", priority = 1)
    @Owner("Ravindra")
    @ Description("TC#INT1 Step 1. Verify that the Booking can be Created")
    public void test_Create_Booking() {
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 2)
    @Owner("Ravindra")
    @Description("TC #INT1 Step 2. Verify that the Booking By ID")
    public void test_Verify_BookingId() {
        Assert.assertTrue( true);
    }

    @Test(groups = "qa", priority = 3)
    @Owner("Ravindra")
    @Description("TC#INT1 Step 3. Verify Updated Booking by ID")
    public void test_Update_BookingByID() {
        Assert.assertTrue( true);
    }
    @Test(groups = "qa", priority = 4)
    @Owner("Ravindra")
    @Description("TC#INT1 - Step 4. Delete the Booking by ID")
    public void test_Delete_BookingById() {
        Assert.assertTrue(  true);
    }
}
