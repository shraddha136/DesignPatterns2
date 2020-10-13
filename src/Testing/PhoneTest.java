package Testing;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestPhone {

    Phone phone = new Phone();
    @Test
    public void doubleCapacity() {
        assertEquals(64,phone.doubleCapacity());
    }
}