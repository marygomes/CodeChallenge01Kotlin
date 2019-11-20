import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Tests {

    @Test
    fun `When number 1 is the input return "1 second"`() {
        assertEquals("1 second", formatTime(1))
    }

    @Test
    fun `When number 2 is the input return "2 seconds"`() {
        assertEquals("2 seconds", formatTime(2))
    }

    @Test
    fun `When number 2 is the input return "3 seconds"`() {
        assertEquals("3 seconds", formatTime(3))
    }

    @Test
    fun `When number 60 is the input return "1 minute"`() {
        assertEquals("1 minute", formatTime(60))
    }

    @Test
    fun `When number 61 is the input return "1 minute and 1 second"`() {
        assertEquals("1 minute and 1 second", formatTime(61))
    }

    @Test
    fun `When a number of seconds that represents several years, days, minutes and seconds, should return all time slices`() {
        assertEquals("3 years, 8 days, 3 hours, 12 minutes and 56 seconds", formatTime(60*60*24*365*3+60*60*24*8+60*60*3+60*12+56))
    }
}