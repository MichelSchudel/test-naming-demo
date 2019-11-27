package nl.craftsmen;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class GreetingServiceTest {

    private GreetingService sut = new GreetingService();

    /**
     * This test name basically says nothing. If it fails, what could be wrong?
     */
    @Test
    public void test() {
        assertThat(sut.greet("John")).isEqualTo("Hello, John");
    }

    /**
     * Yes, we DO realize that this tests the greeting service class. But other than that, no specific details.
     */
    @Test
    public void testGreetingService() {
        assertThat(sut.greet("John")).isEqualTo("Hello, John");
    }

    /**
     * Well, it probably has to do with the "greet" method, but I still have no idea what could be wrong if the test fails.
     */
    @Test
    public void testGreet() {
        assertThat(sut.greet("John")).isEqualTo("Hello, John");
    }

    /**
     * Pretty specific, but a bit unreadable test method name.
     */
    @Test
    public void whenGreetingIsCalledWithUserNameThenResponseShouldBeHelloWithTheUserName() {
        assertThat(sut.greet("John")).isEqualTo("Hello, John");
    }

    /**
     * Yes, this looks much nicer, but are we testing too much at the same time?
     */
    @Test
    public void when_greeting_is_called_with_user_name_then_response_should_be_hello_with_the_user_name() {
        assertThat(sut.greet("John")).isEqualTo("Hello, John");
    }


    /**
     * This test tests the first part of the behaviour.
     */
    @Test
    public void when_greeting_is_called_with_user_name_then_response_should_start_with_hello() {
        assertThat(sut.greet("John")).startsWith("Hello,");
    }

    /**
     * This test tests the second part of the behaviour.
     */
    @Test
    public void when_greeting_is_called_with_user_name_then_response_should_contain_the_user_name() {
        assertThat(sut.greet("John")).endsWith("John");
    }

}